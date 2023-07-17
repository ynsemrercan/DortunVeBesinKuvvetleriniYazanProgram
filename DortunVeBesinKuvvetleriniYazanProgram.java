import java.util.Scanner;

public class DortunVeBesinKuvvetleriniYazanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        int carpim = 1;
        int i = 1;
        while (carpim <= sayi) {
            System.out.println(carpim);
            carpim *= 4;
        }

        System.out.println("5'in kuvvetleri:");
        carpim = 1;
        i = 1;
        while (carpim <= sayi) {
            System.out.println(carpim);
            carpim *= 5;
        }
    }
}












