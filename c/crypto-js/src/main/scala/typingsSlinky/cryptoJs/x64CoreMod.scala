package typingsSlinky.cryptoJs

import typingsSlinky.cryptoJs.anon.Hasher
import typingsSlinky.cryptoJs.anon.PartialCipherParams
import typingsSlinky.cryptoJs.mod.BlockCipherMode
import typingsSlinky.cryptoJs.mod.CipherHelper
import typingsSlinky.cryptoJs.mod.CipherOption
import typingsSlinky.cryptoJs.mod.CipherParams
import typingsSlinky.cryptoJs.mod.CipherStatic
import typingsSlinky.cryptoJs.mod.Encoder
import typingsSlinky.cryptoJs.mod.Format_
import typingsSlinky.cryptoJs.mod.HasherHelper
import typingsSlinky.cryptoJs.mod.HasherStatic
import typingsSlinky.cryptoJs.mod.HmacHasherHelper
import typingsSlinky.cryptoJs.mod.KDFOption
import typingsSlinky.cryptoJs.mod.Padding
import typingsSlinky.cryptoJs.mod.WordArray
import typingsSlinky.cryptoJs.mod.X64Word
import typingsSlinky.cryptoJs.mod.X64WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x64CoreMod {
  
  @JSImport("crypto-js/x64-core", "AES")
  @js.native
  val AES: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "DES")
  @js.native
  val DES: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: String, salt: String): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: String, salt: String, cfg: Hasher): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: String, salt: WordArray): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: String, salt: WordArray, cfg: Hasher): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: WordArray, salt: String): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: WordArray, salt: String, cfg: Hasher): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: WordArray, salt: WordArray): WordArray = js.native
  @JSImport("crypto-js/x64-core", "EvpKDF")
  @js.native
  def EvpKDF(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = js.native
  
  @JSImport("crypto-js/x64-core", "HmacMD5")
  @js.native
  val HmacMD5: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacRIPEMD160")
  @js.native
  val HmacRIPEMD160: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA1")
  @js.native
  val HmacSHA1: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA224")
  @js.native
  val HmacSHA224: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA256")
  @js.native
  val HmacSHA256: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA3")
  @js.native
  val HmacSHA3: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA384")
  @js.native
  val HmacSHA384: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "HmacSHA512")
  @js.native
  val HmacSHA512: HmacHasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "MD5")
  @js.native
  val MD5: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: String, salt: String): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: String, salt: WordArray): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: WordArray, salt: String): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: WordArray, salt: WordArray): WordArray = js.native
  @JSImport("crypto-js/x64-core", "PBKDF2")
  @js.native
  def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = js.native
  
  @JSImport("crypto-js/x64-core", "RC4")
  @js.native
  val RC4: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RC4Drop")
  @js.native
  val RC4Drop: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RIPEMD160")
  @js.native
  val RIPEMD160: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "Rabbit")
  @js.native
  val Rabbit: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "RabbitLegacy")
  @js.native
  val RabbitLegacy: CipherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA1")
  @js.native
  val SHA1: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA224")
  @js.native
  val SHA224: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA256")
  @js.native
  val SHA256: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA3")
  @js.native
  val SHA3: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA384")
  @js.native
  val SHA384: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "SHA512")
  @js.native
  val SHA512: HasherHelper = js.native
  
  @JSImport("crypto-js/x64-core", "TripleDES")
  @js.native
  val TripleDES: CipherHelper = js.native
  
  object algo {
    
    /**
      * AES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.AES")
    @js.native
    val AES: CipherStatic = js.native
    
    /**
      * DES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.DES")
    @js.native
    val DES: CipherStatic = js.native
    
    /**
      * This key derivation function is meant to conform with EVP_BytesToKey.
      * www.openssl.org/docs/crypto/EVP_BytesToKey.html
      */
    @JSImport("crypto-js/x64-core", "algo.EvpKDF")
    @js.native
    abstract class EvpKDF ()
      extends typingsSlinky.cryptoJs.mod.algo.EvpKDF
    object EvpKDF {
      
      /**
        * Initializes a newly created key derivation function.
        *
        * @param cfg (Optional) The configuration options to use for the derivation.
        *
        * @example
        *
        *     var kdf = CryptoJS.algo.EvpKDF.create();
        *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8 });
        *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8, iterations: 1000 });
        */
      /* static member */
      @JSImport("crypto-js/x64-core", "algo.EvpKDF.create")
      @js.native
      def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
      @JSImport("crypto-js/x64-core", "algo.EvpKDF.create")
      @js.native
      def create(cfg: Hasher): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
    }
    
    /**
      * HMAC algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.HMAC")
    @js.native
    abstract class HMAC ()
      extends typingsSlinky.cryptoJs.mod.algo.HMAC
    object HMAC {
      
      @JSImport("crypto-js/x64-core", "algo.HMAC.create")
      @js.native
      def create(hasher: HasherStatic, key: String): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
      /**
        * Initializes a newly created HMAC.
        *
        * @param hasher The hash algorithm to use.
        * @param key The secret key.
        *
        * @example
        *
        *     var hmacHasher = CryptoJS.algo.HMAC.create(CryptoJS.algo.SHA256, key);
        */
      /* static member */
      @JSImport("crypto-js/x64-core", "algo.HMAC.create")
      @js.native
      def create(hasher: HasherStatic, key: WordArray): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
    }
    
    /**
      * MD5 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.MD5")
    @js.native
    val MD5: HasherStatic = js.native
    
    /**
      * Password-Based Key Derivation Function 2 algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.PBKDF2")
    @js.native
    abstract class PBKDF2 ()
      extends typingsSlinky.cryptoJs.mod.algo.PBKDF2
    object PBKDF2 {
      
      /**
        * Initializes a newly created key derivation function.
        *
        * @param cfg (Optional) The configuration options to use for the derivation.
        *
        * @example
        *
        *     var kdf = CryptoJS.algo.PBKDF2.create();
        *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8 });
        *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8, iterations: 1000 });
        */
      /* static member */
      @JSImport("crypto-js/x64-core", "algo.PBKDF2.create")
      @js.native
      def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
      @JSImport("crypto-js/x64-core", "algo.PBKDF2.create")
      @js.native
      def create(cfg: KDFOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
    }
    
    /**
      * RC4 stream cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RC4")
    @js.native
    val RC4: CipherStatic = js.native
    
    /**
      * Modified RC4 stream cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RC4Drop")
    @js.native
    val RC4Drop: CipherStatic = js.native
    
    /**
      * RIPEMD160 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.RIPEMD160")
    @js.native
    val RIPEMD160: HasherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm
      */
    @JSImport("crypto-js/x64-core", "algo.Rabbit")
    @js.native
    val Rabbit: CipherStatic = js.native
    
    /**
      * Rabbit stream cipher algorithm.
      *
      * This is a legacy version that neglected to convert the key to little-endian.
      * This error doesn't affect the cipher's security,
      * but it does affect its compatibility with other implementations.
      */
    @JSImport("crypto-js/x64-core", "algo.RabbitLegacy")
    @js.native
    val RabbitLegacy: CipherStatic = js.native
    
    /**
      * SHA-1 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA1")
    @js.native
    val SHA1: HasherStatic = js.native
    
    /**
      * SHA-224 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA224")
    @js.native
    val SHA224: HasherStatic = js.native
    
    /**
      * SHA-256 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA256")
    @js.native
    val SHA256: HasherStatic = js.native
    
    /**
      * SHA-3 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA3")
    @js.native
    val SHA3: HasherStatic = js.native
    
    /**
      * SHA-384 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA384")
    @js.native
    val SHA384: HasherStatic = js.native
    
    /**
      * SHA-512 hash algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.SHA512")
    @js.native
    val SHA512: HasherStatic = js.native
    
    /**
      * Triple-DES block cipher algorithm.
      */
    @JSImport("crypto-js/x64-core", "algo.TripleDES")
    @js.native
    val TripleDES: CipherStatic = js.native
  }
  
  object enc {
    
    /**
      * Base64 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Base64")
    @js.native
    val Base64: Encoder = js.native
    
    /**
      * Hex encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Hex")
    @js.native
    val Hex: Encoder = js.native
    
    /**
      * Latin1 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Latin1")
    @js.native
    val Latin1: Encoder = js.native
    
    /**
      * UTF-16 BE encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf16")
    @js.native
    val Utf16: Encoder = js.native
    
    @JSImport("crypto-js/x64-core", "enc.Utf16BE")
    @js.native
    val Utf16BE: Encoder = js.native
    
    /**
      * UTF-16 LE encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf16LE")
    @js.native
    val Utf16LE: Encoder = js.native
    
    /**
      * UTF-8 encoding strategy.
      */
    @JSImport("crypto-js/x64-core", "enc.Utf8")
    @js.native
    val Utf8: Encoder = js.native
  }
  
  object format {
    
    @JSImport("crypto-js/x64-core", "format.Hex")
    @js.native
    val Hex: Format_ = js.native
    
    /**
      * OpenSSL formatting strategy.
      */
    @JSImport("crypto-js/x64-core", "format.OpenSSL")
    @js.native
    val OpenSSL: Format_ = js.native
  }
  
  object kdf {
    
    /**
      * OpenSSL key derivation function.
      */
    object OpenSSL {
      
      /**
        * Derives a key and IV from a password.
        *
        * @param password The password to derive from.
        * @param keySize The size in words of the key to generate.
        * @param ivSize The size in words of the IV to generate.
        * @param salt (Optional) A 64-bit salt to use. If omitted, a salt will be generated randomly.
        *
        * @return A cipher params object with the key, IV, and salt.
        *
        * @example
        *
        *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32);
        *     var derivedParams = CryptoJS.kdf.OpenSSL.execute('Password', 256/32, 128/32, 'saltsalt');
        */
      @JSImport("crypto-js/x64-core", "kdf.OpenSSL.execute")
      @js.native
      def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
      @JSImport("crypto-js/x64-core", "kdf.OpenSSL.execute")
      @js.native
      def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
      @JSImport("crypto-js/x64-core", "kdf.OpenSSL.execute")
      @js.native
      def execute(password: String, keySize: Double, ivSize: Double, salt: WordArray): CipherParams = js.native
    }
  }
  
  object lib {
    
    /**
      * Base object for prototypal inheritance.
      */
    object Base {
      
      /**
        * Extends this object and runs the init method.
        * Arguments to create() will be passed to init().
        *
        * @return The new object.
        *
        * @example
        *
        *     var instance = MyType.create();
        */
      @JSImport("crypto-js/x64-core", "lib.Base.create")
      @js.native
      def create(args: js.Any*): js.Any = js.native
      
      /**
        * Creates a new object that inherits from this object.
        *
        * @param overrides Properties to copy into the new object.
        *
        * @return The new object.
        *
        * @example
        *
        *     var MyType = CryptoJS.lib.Base.extend({
        *         field: 'value',
        *
        *         method: function () {
        *         }
        *     });
        */
      @JSImport("crypto-js/x64-core", "lib.Base.extend")
      @js.native
      def extend(overrides: js.Object): js.Any = js.native
      
      /**
        * Copies properties into this object.
        *
        * @param properties The properties to mix in.
        *
        * @example
        *
        *     MyType.mixIn({
        *         field: 'value'
        *     });
        */
      @JSImport("crypto-js/x64-core", "lib.Base.mixIn")
      @js.native
      def mixIn(properties: js.Object): js.Any = js.native
    }
    
    /**
      * Abstract base block cipher mode template.
      */
    @JSImport("crypto-js/x64-core", "lib.BlockCipherMode")
    @js.native
    val BlockCipherMode: js.Any = js.native
    
    @JSImport("crypto-js/x64-core", "lib.BufferedBlockAlgorithm")
    @js.native
    val BufferedBlockAlgorithm: js.Any = js.native
    
    object Cipher {
      
      /**
        * Creates shortcut functions to a cipher's object interface.
        *
        * @param cipher The cipher to create a helper for.
        *
        * @return An object with encrypt and decrypt shortcut functions.
        *
        * @example
        *
        *     var AES = CryptoJS.lib.Cipher._createHelper(CryptoJS.algo.AES);
        */
      @JSImport("crypto-js/x64-core", "lib.Cipher._createHelper")
      @js.native
      def createHelper(cipher: typingsSlinky.cryptoJs.mod.Cipher): CipherHelper = js.native
    }
    
    object CipherParams {
      
      /**
        * Initializes a newly created cipher params object.
        *
        * @param cipherParams An object with any of the possible cipher parameters.
        *
        * @example
        *
        *     var cipherParams = CryptoJS.lib.CipherParams.create({
        *         ciphertext: ciphertextWordArray,
        *         key: keyWordArray,
        *         iv: ivWordArray,
        *         salt: saltWordArray,
        *         algorithm: CryptoJS.algo.AES,
        *         mode: CryptoJS.mode.CBC,
        *         padding: CryptoJS.pad.PKCS7,
        *         blockSize: 4,
        *         formatter: CryptoJS.format.OpenSSL
        *     });
        */
      @JSImport("crypto-js/x64-core", "lib.CipherParams.create")
      @js.native
      def create(cipherParams: PartialCipherParams): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    }
    
    object Hasher {
      
      /**
        * Creates a shortcut function to a hasher's object interface.
        *
        * @param hasher The hasher to create a helper for.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var SHA256 = CryptoJS.lib.Hasher._createHelper(CryptoJS.algo.SHA256);
        */
      @JSImport("crypto-js/x64-core", "lib.Hasher._createHelper")
      @js.native
      def createHelper(hasher: HasherStatic): HasherHelper = js.native
      
      /**
        * Creates a shortcut function to the HMAC's object interface.
        *
        * @param hasher The hasher to use in this HMAC helper.
        *
        * @return The shortcut function.
        *
        * @example
        *
        *     var HmacSHA256 = CryptoJS.lib.Hasher._createHmacHelper(CryptoJS.algo.SHA256);
        */
      @JSImport("crypto-js/x64-core", "lib.Hasher._createHmacHelper")
      @js.native
      def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
    }
    
    /**
      * A serializable cipher wrapper that derives the key from a password,
      * and returns ciphertext as a serializable cipher params object.
      */
    object PasswordBasedCipher {
      
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.decrypt")
      @js.native
      def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.decrypt")
      @js.native
      def decrypt(cipher: CipherStatic, ciphertext: String, password: String, cfg: CipherOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      /**
        * Decrypts serialized ciphertext using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, 'password', { format: CryptoJS.format.OpenSSL });
        *     var plaintext = CryptoJS.lib.PasswordBasedCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, 'password', { format: CryptoJS.format.OpenSSL });
        */
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
        password: String
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
        password: String,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.encrypt")
      @js.native
      def encrypt(cipher: CipherStatic, message: String, password: String): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.encrypt")
      @js.native
      def encrypt(cipher: CipherStatic, message: String, password: String, cfg: CipherOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      /**
        * Encrypts a message using a password.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param password The password.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password');
        *     var ciphertextParams = CryptoJS.lib.PasswordBasedCipher.encrypt(CryptoJS.algo.AES, message, 'password', { format: CryptoJS.format.OpenSSL });
        */
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        password: String
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.PasswordBasedCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        password: String,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    }
    
    /**
      * A cipher wrapper that returns ciphertext as a serializable cipher params object.
      */
    object SerializableCipher {
      
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: String,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: String,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      /**
        * Decrypts serialized ciphertext.
        *
        * @param cipher The cipher algorithm to use.
        * @param ciphertext The ciphertext to decrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return The plaintext.
        *
        * @example
        *
        *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, formattedCiphertext, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        *     var plaintext = CryptoJS.lib.SerializableCipher.decrypt(CryptoJS.algo.AES, ciphertextParams, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        */
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.decrypt")
      @js.native
      def decrypt(
        cipher: CipherStatic,
        ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: String,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: String,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      /**
        * Encrypts a message.
        *
        * @param cipher The cipher algorithm to use.
        * @param message The message to encrypt.
        * @param key The key.
        * @param cfg (Optional) The configuration options to use for this operation.
        *
        * @return A cipher params object.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key);
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv });
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher.encrypt(CryptoJS.algo.AES, message, key, { iv: iv, format: CryptoJS.format.OpenSSL });
        */
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher.encrypt")
      @js.native
      def encrypt(
        cipher: CipherStatic,
        message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
        cfg: CipherOption
      ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher._parse")
      @js.native
      def parse(ciphertext: String, format: Format_): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      /**
        * Converts serialized ciphertext to CipherParams,
        * else assumed CipherParams already and returns ciphertext unchanged.
        *
        * @param ciphertext The ciphertext.
        * @param format The formatting strategy to use to parse serialized ciphertext.
        *
        * @return The unserialized ciphertext.
        *
        * @example
        *
        *     var ciphertextParams = CryptoJS.lib.SerializableCipher._parse(ciphertextStringOrParams, format);
        */
      @JSImport("crypto-js/x64-core", "lib.SerializableCipher._parse")
      @js.native
      def parse(ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams, format: Format_): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
    }
    
    object WordArray {
      
      /**
        * Initializes a newly created word array.
        *
        * @param words (Optional) An array of 32-bit words.
        * @param sigBytes (Optional) The number of significant bytes in the words.
        *
        * @example
        *
        *     var wordArray = CryptoJS.lib.WordArray.create();
        *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607]);
        *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607], 6);
        */
      @JSImport("crypto-js/x64-core", "lib.WordArray.create")
      @js.native
      def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      @JSImport("crypto-js/x64-core", "lib.WordArray.create")
      @js.native
      def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      @JSImport("crypto-js/x64-core", "lib.WordArray.create")
      @js.native
      def create(words: js.Array[Double]): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      @JSImport("crypto-js/x64-core", "lib.WordArray.create")
      @js.native
      def create(words: js.Array[Double], sigBytes: Double): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      
      /**
        * Creates a word array filled with random bytes.
        *
        * @param nBytes The number of random bytes to generate.
        *
        * @return The random word array.
        *
        * @example
        *
        *     var wordArray = CryptoJS.lib.WordArray.random(16);
        */
      @JSImport("crypto-js/x64-core", "lib.WordArray.random")
      @js.native
      def random(nBytes: Double): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
    }
  }
  
  object mode {
    
    /**
      * Cipher Block Chaining mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CBC")
    @js.native
    val CBC: BlockCipherMode = js.native
    
    /**
      * Cipher Feedback block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CFB")
    @js.native
    val CFB: BlockCipherMode = js.native
    
    /**
      * Counter block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.CTR")
    @js.native
    val CTR: BlockCipherMode = js.native
    
    /**
      * @preserve
      * Counter block mode compatible with  Dr Brian Gladman fileenc.c
      * derived from CryptoJS.mode.CTR
      * Jan Hruby jhruby.web@gmail.com
      */
    @JSImport("crypto-js/x64-core", "mode.CTRGladman")
    @js.native
    val CTRGladman: BlockCipherMode = js.native
    
    /**
      * Electronic Codebook block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.ECB")
    @js.native
    val ECB: BlockCipherMode = js.native
    
    /**
      * Output Feedback block mode.
      */
    @JSImport("crypto-js/x64-core", "mode.OFB")
    @js.native
    val OFB: BlockCipherMode = js.native
  }
  
  object pad {
    
    /**
      * ANSI X.923 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.AnsiX923")
    @js.native
    val AnsiX923: Padding = js.native
    
    /**
      * ISO 10126 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.Iso10126")
    @js.native
    val Iso10126: Padding = js.native
    
    /**
      * ISO/IEC 9797-1 Padding Method 2.
      */
    @JSImport("crypto-js/x64-core", "pad.Iso97971")
    @js.native
    val Iso97971: Padding = js.native
    
    /**
      * A noop padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.NoPadding")
    @js.native
    val NoPadding: Padding = js.native
    
    /**
      * PKCS #5/7 padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.Pkcs7")
    @js.native
    val Pkcs7: Padding = js.native
    
    /**
      * Zero padding strategy.
      */
    @JSImport("crypto-js/x64-core", "pad.ZeroPadding")
    @js.native
    val ZeroPadding: Padding = js.native
  }
  
  object x64 {
    
    object Word {
      
      /**
        * Initializes a newly created 64-bit word.
        *
        * @param high The high 32 bits.
        * @param low The low 32 bits.
        *
        * @example
        *
        *     var x64Word = CryptoJS.x64.Word.create(0x00010203, 0x04050607);
        */
      @JSImport("crypto-js/x64-core", "x64.Word.create")
      @js.native
      def create(high: Double, low: Double): X64Word = js.native
    }
    
    /**
      * Initializes a newly created word array.
      *
      * @param words (Optional) An array of CryptoJS.x64.Word objects.
      * @param sigBytes (Optional) The number of significant bytes in the words.
      *
      * @example
      *
      *     var wordArray = CryptoJS.x64.WordArray.create();
      *
      *     var wordArray = CryptoJS.x64.WordArray.create([
      *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ]);
      *
      *     var wordArray = CryptoJS.x64.WordArray.create([
      *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
      *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
      *     ], 10);
      */
    object WordArray {
      
      @JSImport("crypto-js/x64-core", "x64.WordArray.create")
      @js.native
      def create(): X64WordArray = js.native
      @JSImport("crypto-js/x64-core", "x64.WordArray.create")
      @js.native
      def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): X64WordArray = js.native
      @JSImport("crypto-js/x64-core", "x64.WordArray.create")
      @js.native
      def create(words: js.Array[X64WordArray]): X64WordArray = js.native
      @JSImport("crypto-js/x64-core", "x64.WordArray.create")
      @js.native
      def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = js.native
    }
  }
}
