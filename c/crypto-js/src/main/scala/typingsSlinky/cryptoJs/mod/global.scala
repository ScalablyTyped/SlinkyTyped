package typingsSlinky.cryptoJs.mod

import typingsSlinky.cryptoJs.anon.PartialCipherParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CryptoJS {
    
    @JSGlobal("CryptoJS.AES")
    @js.native
    val AES: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.DES")
    @js.native
    val DES: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: String, salt: String): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: String, salt: String, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: String, salt: WordArray): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: String, salt: WordArray, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: WordArray, salt: String): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: WordArray, salt: String, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: WordArray, salt: WordArray): WordArray = js.native
    @JSGlobal("CryptoJS.EvpKDF")
    @js.native
    def EvpKDF(password: WordArray, salt: WordArray, cfg: typingsSlinky.cryptoJs.anon.Hasher): WordArray = js.native
    
    @JSGlobal("CryptoJS.HmacMD5")
    @js.native
    val HmacMD5: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacRIPEMD160")
    @js.native
    val HmacRIPEMD160: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA1")
    @js.native
    val HmacSHA1: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA224")
    @js.native
    val HmacSHA224: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA256")
    @js.native
    val HmacSHA256: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA3")
    @js.native
    val HmacSHA3: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA384")
    @js.native
    val HmacSHA384: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.HmacSHA512")
    @js.native
    val HmacSHA512: HmacHasherHelper = js.native
    
    @JSGlobal("CryptoJS.MD5")
    @js.native
    val MD5: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: String, salt: String): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: String, salt: String, cfg: KDFOption): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: String, salt: WordArray): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: String, salt: WordArray, cfg: KDFOption): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: WordArray, salt: String): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: WordArray, salt: String, cfg: KDFOption): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: WordArray, salt: WordArray): WordArray = js.native
    @JSGlobal("CryptoJS.PBKDF2")
    @js.native
    def PBKDF2(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = js.native
    
    @JSGlobal("CryptoJS.RC4")
    @js.native
    val RC4: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.RC4Drop")
    @js.native
    val RC4Drop: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.RIPEMD160")
    @js.native
    val RIPEMD160: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.Rabbit")
    @js.native
    val Rabbit: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.RabbitLegacy")
    @js.native
    val RabbitLegacy: CipherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA1")
    @js.native
    val SHA1: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA224")
    @js.native
    val SHA224: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA256")
    @js.native
    val SHA256: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA3")
    @js.native
    val SHA3: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA384")
    @js.native
    val SHA384: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.SHA512")
    @js.native
    val SHA512: HasherHelper = js.native
    
    @JSGlobal("CryptoJS.TripleDES")
    @js.native
    val TripleDES: CipherHelper = js.native
    
    object algo {
      
      /**
        * AES block cipher algorithm.
        */
      @JSGlobal("CryptoJS.algo.AES")
      @js.native
      val AES: CipherStatic = js.native
      
      /**
        * DES block cipher algorithm.
        */
      @JSGlobal("CryptoJS.algo.DES")
      @js.native
      val DES: CipherStatic = js.native
      
      /**
        * This key derivation function is meant to conform with EVP_BytesToKey.
        * www.openssl.org/docs/crypto/EVP_BytesToKey.html
        */
      @JSGlobal("CryptoJS.algo.EvpKDF")
      @js.native
      abstract class EvpKDF () extends StObject {
        
        def compute(password: String, salt: WordArray): WordArray = js.native
        /**
          * Derives a key from a password.
          *
          * @param password The password.
          * @param salt A salt.
          *
          * @return The derived key.
          *
          * @example
          *
          *     var key = kdf.compute(password, salt);
          */
        def compute(password: WordArray, salt: WordArray): WordArray = js.native
      }
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
        @JSGlobal("CryptoJS.algo.EvpKDF.create")
        @js.native
        def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
        @JSGlobal("CryptoJS.algo.EvpKDF.create")
        @js.native
        def create(cfg: typingsSlinky.cryptoJs.anon.Hasher): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
      }
      
      /**
        * HMAC algorithm.
        */
      @JSGlobal("CryptoJS.algo.HMAC")
      @js.native
      abstract class HMAC () extends StObject {
        
        def finalize(messageUpdate: String): WordArray = js.native
        def finalize(messageUpdate: WordArray): WordArray = js.native
        
        /**
          * Resets this HMAC to its initial state.
          *
          * @example
          *
          *     hmacHasher.reset();
          */
        def reset(): Unit = js.native
        
        def update(messageUpdate: String): this.type = js.native
        /**
          * Updates this HMAC with a message.
          *
          * @param messageUpdate The message to append.
          *
          * @return This HMAC instance.
          *
          * @example
          *
          *     hmacHasher.update('message');
          *     hmacHasher.update(wordArray);
          */
        def update(messageUpdate: WordArray): this.type = js.native
      }
      object HMAC {
        
        @JSGlobal("CryptoJS.algo.HMAC.create")
        @js.native
        def create(hasher: HasherStatic, key: String): HMAC = js.native
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
        @JSGlobal("CryptoJS.algo.HMAC.create")
        @js.native
        def create(hasher: HasherStatic, key: WordArray): HMAC = js.native
      }
      
      /**
        * MD5 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.MD5")
      @js.native
      val MD5: HasherStatic = js.native
      
      /**
        * Password-Based Key Derivation Function 2 algorithm.
        */
      @JSGlobal("CryptoJS.algo.PBKDF2")
      @js.native
      abstract class PBKDF2 () extends StObject {
        
        def compute(password: String, salt: WordArray): WordArray = js.native
        /**
          * Computes the Password-Based Key Derivation Function 2.
          *
          * @param password The password.
          * @param salt A salt.
          *
          * @return The derived key.
          *
          * @example
          *
          *     var key = kdf.compute(password, salt);
          */
        def compute(password: WordArray, salt: WordArray): WordArray = js.native
      }
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
        @JSGlobal("CryptoJS.algo.PBKDF2.create")
        @js.native
        def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
        @JSGlobal("CryptoJS.algo.PBKDF2.create")
        @js.native
        def create(cfg: KDFOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
      }
      
      /**
        * RC4 stream cipher algorithm.
        */
      @JSGlobal("CryptoJS.algo.RC4")
      @js.native
      val RC4: CipherStatic = js.native
      
      /**
        * Modified RC4 stream cipher algorithm.
        */
      @JSGlobal("CryptoJS.algo.RC4Drop")
      @js.native
      val RC4Drop: CipherStatic = js.native
      
      /**
        * RIPEMD160 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.RIPEMD160")
      @js.native
      val RIPEMD160: HasherStatic = js.native
      
      /**
        * Rabbit stream cipher algorithm
        */
      @JSGlobal("CryptoJS.algo.Rabbit")
      @js.native
      val Rabbit: CipherStatic = js.native
      
      /**
        * Rabbit stream cipher algorithm.
        *
        * This is a legacy version that neglected to convert the key to little-endian.
        * This error doesn't affect the cipher's security,
        * but it does affect its compatibility with other implementations.
        */
      @JSGlobal("CryptoJS.algo.RabbitLegacy")
      @js.native
      val RabbitLegacy: CipherStatic = js.native
      
      /**
        * SHA-1 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA1")
      @js.native
      val SHA1: HasherStatic = js.native
      
      /**
        * SHA-224 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA224")
      @js.native
      val SHA224: HasherStatic = js.native
      
      /**
        * SHA-256 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA256")
      @js.native
      val SHA256: HasherStatic = js.native
      
      /**
        * SHA-3 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA3")
      @js.native
      val SHA3: HasherStatic = js.native
      
      /**
        * SHA-384 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA384")
      @js.native
      val SHA384: HasherStatic = js.native
      
      /**
        * SHA-512 hash algorithm.
        */
      @JSGlobal("CryptoJS.algo.SHA512")
      @js.native
      val SHA512: HasherStatic = js.native
      
      /**
        * Triple-DES block cipher algorithm.
        */
      @JSGlobal("CryptoJS.algo.TripleDES")
      @js.native
      val TripleDES: CipherStatic = js.native
    }
    
    object enc {
      
      /**
        * Base64 encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Base64")
      @js.native
      val Base64: Encoder = js.native
      
      /**
        * Hex encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Hex")
      @js.native
      val Hex: Encoder = js.native
      
      /**
        * Latin1 encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Latin1")
      @js.native
      val Latin1: Encoder = js.native
      
      /**
        * UTF-16 BE encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Utf16")
      @js.native
      val Utf16: Encoder = js.native
      
      @JSGlobal("CryptoJS.enc.Utf16BE")
      @js.native
      val Utf16BE: Encoder = js.native
      
      /**
        * UTF-16 LE encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Utf16LE")
      @js.native
      val Utf16LE: Encoder = js.native
      
      /**
        * UTF-8 encoding strategy.
        */
      @JSGlobal("CryptoJS.enc.Utf8")
      @js.native
      val Utf8: Encoder = js.native
    }
    
    object format {
      
      @JSGlobal("CryptoJS.format.Hex")
      @js.native
      val Hex: Format_ = js.native
      
      /**
        * OpenSSL formatting strategy.
        */
      @JSGlobal("CryptoJS.format.OpenSSL")
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
        @JSGlobal("CryptoJS.kdf.OpenSSL.execute")
        @js.native
        def execute(password: String, keySize: Double, ivSize: Double): CipherParams = js.native
        @JSGlobal("CryptoJS.kdf.OpenSSL.execute")
        @js.native
        def execute(password: String, keySize: Double, ivSize: Double, salt: String): CipherParams = js.native
        @JSGlobal("CryptoJS.kdf.OpenSSL.execute")
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
        @JSGlobal("CryptoJS.lib.Base.create")
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
        @JSGlobal("CryptoJS.lib.Base.extend")
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
        @JSGlobal("CryptoJS.lib.Base.mixIn")
        @js.native
        def mixIn(properties: js.Object): js.Any = js.native
      }
      
      /**
        * Abstract base block cipher mode template.
        */
      @JSGlobal("CryptoJS.lib.BlockCipherMode")
      @js.native
      val BlockCipherMode: js.Any = js.native
      
      @JSGlobal("CryptoJS.lib.BufferedBlockAlgorithm")
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
        @JSGlobal("CryptoJS.lib.Cipher._createHelper")
        @js.native
        def createHelper(cipher: typingsSlinky.cryptoJs.mod.Cipher): CipherHelper = js.native
      }
      
      /**
        * A collection of cipher parameters.
        */
      @js.native
      trait CipherParams extends StObject {
        
        /**
          * The cipher algorithm.
          */
        var algorithm: CipherStatic = js.native
        
        /**
          * The block size of the cipher.
          */
        var blockSize: Double = js.native
        
        /**
          * The raw ciphertext.
          */
        var ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        
        /**
          * The default formatting strategy to convert this cipher params object to a string.
          */
        var formatter: Format_ = js.native
        
        /**
          * The IV used in the ciphering operation.
          */
        var iv: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        
        /**
          * The key to this ciphertext.
          */
        var key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        
        /**
          * The block mode used in the ciphering operation.
          */
        var mode: Mode_ = js.native
        
        /**
          * The padding scheme used in the ciphering operation.
          */
        var padding: Padding = js.native
        
        /**
          * The salt used with a key derivation function.
          */
        var salt: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        
        def toString(formatter: Format_): String = js.native
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
        @JSGlobal("CryptoJS.lib.CipherParams.create")
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
        @JSGlobal("CryptoJS.lib.Hasher._createHelper")
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
        @JSGlobal("CryptoJS.lib.Hasher._createHmacHelper")
        @js.native
        def createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
      }
      
      /**
        * A serializable cipher wrapper that derives the key from a password,
        * and returns ciphertext as a serializable cipher params object.
        */
      object PasswordBasedCipher {
        
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.decrypt")
        @js.native
        def decrypt(cipher: CipherStatic, ciphertext: String, password: String): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.decrypt")
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
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.decrypt")
        @js.native
        def decrypt(
          cipher: CipherStatic,
          ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
          password: String
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.decrypt")
        @js.native
        def decrypt(
          cipher: CipherStatic,
          ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams,
          password: String,
          cfg: CipherOption
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.encrypt")
        @js.native
        def encrypt(cipher: CipherStatic, message: String, password: String): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.encrypt")
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
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.encrypt")
        @js.native
        def encrypt(
          cipher: CipherStatic,
          message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          password: String
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.PasswordBasedCipher.encrypt")
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
        
        @JSGlobal("CryptoJS.lib.SerializableCipher.decrypt")
        @js.native
        def decrypt(
          cipher: CipherStatic,
          ciphertext: String,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.SerializableCipher.decrypt")
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
        @JSGlobal("CryptoJS.lib.SerializableCipher.decrypt")
        @js.native
        def decrypt(
          cipher: CipherStatic,
          ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.SerializableCipher.decrypt")
        @js.native
        def decrypt(
          cipher: CipherStatic,
          ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          cfg: CipherOption
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        
        @JSGlobal("CryptoJS.lib.SerializableCipher.encrypt")
        @js.native
        def encrypt(
          cipher: CipherStatic,
          message: String,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.SerializableCipher.encrypt")
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
        @JSGlobal("CryptoJS.lib.SerializableCipher.encrypt")
        @js.native
        def encrypt(
          cipher: CipherStatic,
          message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        @JSGlobal("CryptoJS.lib.SerializableCipher.encrypt")
        @js.native
        def encrypt(
          cipher: CipherStatic,
          message: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          key: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray,
          cfg: CipherOption
        ): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
        
        @JSGlobal("CryptoJS.lib.SerializableCipher._parse")
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
        @JSGlobal("CryptoJS.lib.SerializableCipher._parse")
        @js.native
        def parse(ciphertext: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams, format: Format_): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams = js.native
      }
      
      /**
        * An array of 32-bit words.
        */
      @js.native
      trait WordArray extends StObject {
        
        /**
          * Removes insignificant bits.
          *
          * @example
          *
          *     wordArray.clamp();
          */
        def clamp(): Unit = js.native
        
        /**
          * Concatenates a word array to this word array.
          *
          * @param wordArray The word array to append.
          *
          * @return This word array.
          *
          * @example
          *
          *     wordArray1.concat(wordArray2);
          */
        def concat(wordArray: typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray): this.type = js.native
        
        /**
          * The number of significant bytes in this word array.
          */
        var sigBytes: Double = js.native
        
        def toString(encoder: Encoder): String = js.native
        
        /**
          * The array of 32-bit words.
          */
        var words: js.Array[Double] = js.native
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
        @JSGlobal("CryptoJS.lib.WordArray.create")
        @js.native
        def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        @JSGlobal("CryptoJS.lib.WordArray.create")
        @js.native
        def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        @JSGlobal("CryptoJS.lib.WordArray.create")
        @js.native
        def create(words: js.Array[Double]): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
        @JSGlobal("CryptoJS.lib.WordArray.create")
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
        @JSGlobal("CryptoJS.lib.WordArray.random")
        @js.native
        def random(nBytes: Double): typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray = js.native
      }
      
      /**
        * Abstract base stream cipher template.
        */
      @js.native
      trait StreamCipher extends Cipher {
        
        /**
          * The number of 32-bit words this cipher operates on. Default: 1 (32 bits)
          */
        var blockSize: Double = js.native
      }
    }
    
    object mode {
      
      /**
        * Cipher Block Chaining mode.
        */
      @JSGlobal("CryptoJS.mode.CBC")
      @js.native
      val CBC: BlockCipherMode = js.native
      
      /**
        * Cipher Feedback block mode.
        */
      @JSGlobal("CryptoJS.mode.CFB")
      @js.native
      val CFB: BlockCipherMode = js.native
      
      /**
        * Counter block mode.
        */
      @JSGlobal("CryptoJS.mode.CTR")
      @js.native
      val CTR: BlockCipherMode = js.native
      
      /**
        * @preserve
        * Counter block mode compatible with  Dr Brian Gladman fileenc.c
        * derived from CryptoJS.mode.CTR
        * Jan Hruby jhruby.web@gmail.com
        */
      @JSGlobal("CryptoJS.mode.CTRGladman")
      @js.native
      val CTRGladman: BlockCipherMode = js.native
      
      /**
        * Electronic Codebook block mode.
        */
      @JSGlobal("CryptoJS.mode.ECB")
      @js.native
      val ECB: BlockCipherMode = js.native
      
      /**
        * Output Feedback block mode.
        */
      @JSGlobal("CryptoJS.mode.OFB")
      @js.native
      val OFB: BlockCipherMode = js.native
    }
    
    object pad {
      
      /**
        * ANSI X.923 padding strategy.
        */
      @JSGlobal("CryptoJS.pad.AnsiX923")
      @js.native
      val AnsiX923: Padding = js.native
      
      /**
        * ISO 10126 padding strategy.
        */
      @JSGlobal("CryptoJS.pad.Iso10126")
      @js.native
      val Iso10126: Padding = js.native
      
      /**
        * ISO/IEC 9797-1 Padding Method 2.
        */
      @JSGlobal("CryptoJS.pad.Iso97971")
      @js.native
      val Iso97971: Padding = js.native
      
      /**
        * A noop padding strategy.
        */
      @JSGlobal("CryptoJS.pad.NoPadding")
      @js.native
      val NoPadding: Padding = js.native
      
      /**
        * PKCS #5/7 padding strategy.
        */
      @JSGlobal("CryptoJS.pad.Pkcs7")
      @js.native
      val Pkcs7: Padding = js.native
      
      /**
        * Zero padding strategy.
        */
      @JSGlobal("CryptoJS.pad.ZeroPadding")
      @js.native
      val ZeroPadding: Padding = js.native
    }
    
    object x64 {
      
      /**
        * A 64-bit word.
        */
      @js.native
      trait Word extends StObject {
        
        /**
          * Adds this word with the passed word.
          *
          * @param word The x64-Word to add with this word.
          *
          * @return A new x64-Word object after adding.
          *
          * @example
          *
          *     var added = x64Word.add(anotherX64Word);
          */
        def add(word: X64Word): X64Word = js.native
        
        /**
          * Bitwise ANDs this word with the passed word.
          *
          * @param word The x64-Word to AND with this word.
          *
          * @return A new x64-Word object after ANDing.
          *
          * @example
          *
          *     var anded = x64Word.and(anotherX64Word);
          */
        def and(word: X64Word): X64Word = js.native
        
        /**
          * Bitwise NOTs this word.
          *
          * @return A new x64-Word object after negating.
          *
          * @example
          *
          *     var negated = x64Word.not();
          */
        def not(): X64Word = js.native
        
        /**
          * Bitwise ORs this word with the passed word.
          *
          * @param word The x64-Word to OR with this word.
          *
          * @return A new x64-Word object after ORing.
          *
          * @example
          *
          *     var ored = x64Word.or(anotherX64Word);
          */
        def or(word: X64Word): X64Word = js.native
        
        /**
          * Rotates this word n bits to the left.
          *
          * @param n The number of bits to rotate.
          *
          * @return A new x64-Word object after rotating.
          *
          * @example
          *
          *     var rotated = x64Word.rotL(25);
          */
        def rotL(n: Double): X64Word = js.native
        
        /**
          * Rotates this word n bits to the right.
          *
          * @param n The number of bits to rotate.
          *
          * @return A new x64-Word object after rotating.
          *
          * @example
          *
          *     var rotated = x64Word.rotR(7);
          */
        def rotR(n: Double): X64Word = js.native
        
        /**
          * Shifts this word n bits to the left.
          *
          * @param n The number of bits to shift.
          *
          * @return A new x64-Word object after shifting.
          *
          * @example
          *
          *     var shifted = x64Word.shiftL(25);
          */
        def shiftL(n: Double): X64Word = js.native
        
        /**
          * Shifts this word n bits to the right.
          *
          * @param n The number of bits to shift.
          *
          * @return A new x64-Word object after shifting.
          *
          * @example
          *
          *     var shifted = x64Word.shiftR(7);
          */
        def shiftR(n: Double): X64Word = js.native
        
        /**
          * Bitwise XORs this word with the passed word.
          *
          * @param word The x64-Word to XOR with this word.
          *
          * @return A new x64-Word object after XORing.
          *
          * @example
          *
          *     var xored = x64Word.xor(anotherX64Word);
          */
        def xor(word: X64Word): X64Word = js.native
      }
      object Word {
        
        @scala.inline
        def apply(
          add: X64Word => X64Word,
          and: X64Word => X64Word,
          not: () => X64Word,
          or: X64Word => X64Word,
          rotL: Double => X64Word,
          rotR: Double => X64Word,
          shiftL: Double => X64Word,
          shiftR: Double => X64Word,
          xor: X64Word => X64Word
        ): Word = {
          val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), and = js.Any.fromFunction1(and), not = js.Any.fromFunction0(not), or = js.Any.fromFunction1(or), rotL = js.Any.fromFunction1(rotL), rotR = js.Any.fromFunction1(rotR), shiftL = js.Any.fromFunction1(shiftL), shiftR = js.Any.fromFunction1(shiftR), xor = js.Any.fromFunction1(xor))
          __obj.asInstanceOf[Word]
        }
        
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
        @JSGlobal("CryptoJS.x64.Word.create")
        @js.native
        def create(high: Double, low: Double): X64Word = js.native
        
        @scala.inline
        implicit class WordMutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAdd(value: X64Word => X64Word): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
          
          @scala.inline
          def setAnd(value: X64Word => X64Word): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
          
          @scala.inline
          def setNot(value: () => X64Word): Self = StObject.set(x, "not", js.Any.fromFunction0(value))
          
          @scala.inline
          def setOr(value: X64Word => X64Word): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
          
          @scala.inline
          def setRotL(value: Double => X64Word): Self = StObject.set(x, "rotL", js.Any.fromFunction1(value))
          
          @scala.inline
          def setRotR(value: Double => X64Word): Self = StObject.set(x, "rotR", js.Any.fromFunction1(value))
          
          @scala.inline
          def setShiftL(value: Double => X64Word): Self = StObject.set(x, "shiftL", js.Any.fromFunction1(value))
          
          @scala.inline
          def setShiftR(value: Double => X64Word): Self = StObject.set(x, "shiftR", js.Any.fromFunction1(value))
          
          @scala.inline
          def setXor(value: X64Word => X64Word): Self = StObject.set(x, "xor", js.Any.fromFunction1(value))
        }
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
        
        @JSGlobal("CryptoJS.x64.WordArray.create")
        @js.native
        def create(): X64WordArray = js.native
        @JSGlobal("CryptoJS.x64.WordArray.create")
        @js.native
        def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): X64WordArray = js.native
        @JSGlobal("CryptoJS.x64.WordArray.create")
        @js.native
        def create(words: js.Array[X64WordArray]): X64WordArray = js.native
        @JSGlobal("CryptoJS.x64.WordArray.create")
        @js.native
        def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = js.native
      }
    }
  }
}
