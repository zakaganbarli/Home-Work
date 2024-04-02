import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("adinizi daxil edin:");
        String name = scanner.nextLine();

        System.out.println("balinizi daxil edin:");
        int bal = scanner.nextInt();

        if (bal >= 91 && bal <= 100) {
            System.out.println("A");
        } else if (bal >= 81 && bal <= 90) {
            System.out.println("B");
        } else if (bal >= 71 && bal <= 80) {
            System.out.println("C");
        } else if (bal >= 61 && bal <= 70) {
            System.out.println("D");
        } else if (bal >= 51 && bal <= 60) {
            System.out.println("E");
        } else if (bal >= 0 && bal <= 50) {
            System.out.println("F");
        } else {
            System.out.println("Balınız qebul olmadı");
        }
    }
}