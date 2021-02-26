package typingsSlinky.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algo {
  
  /**
    * AES block cipher algorithm.
    */
  @JSImport("crypto-js", "algo.AES")
  @js.native
  val AES: CipherStatic = js.native
  
  /**
    * DES block cipher algorithm.
    */
  @JSImport("crypto-js", "algo.DES")
  @js.native
  val DES: CipherStatic = js.native
  
  /**
    * This key derivation function is meant to conform with EVP_BytesToKey.
    * www.openssl.org/docs/crypto/EVP_BytesToKey.html
    */
  @JSImport("crypto-js", "algo.EvpKDF")
  @js.native
  abstract class EvpKDF ()
    extends typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF
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
    @JSImport("crypto-js", "algo.EvpKDF.create")
    @js.native
    def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
    @JSImport("crypto-js", "algo.EvpKDF.create")
    @js.native
    def create(cfg: typingsSlinky.cryptoJs.anon.Hasher): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
  }
  
  /**
    * HMAC algorithm.
    */
  @JSImport("crypto-js", "algo.HMAC")
  @js.native
  abstract class HMAC ()
    extends typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.HMAC
  object HMAC {
    
    @JSImport("crypto-js", "algo.HMAC.create")
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
    @JSImport("crypto-js", "algo.HMAC.create")
    @js.native
    def create(hasher: HasherStatic, key: WordArray): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
  }
  
  /**
    * MD5 hash algorithm.
    */
  @JSImport("crypto-js", "algo.MD5")
  @js.native
  val MD5: HasherStatic = js.native
  
  /**
    * Password-Based Key Derivation Function 2 algorithm.
    */
  @JSImport("crypto-js", "algo.PBKDF2")
  @js.native
  abstract class PBKDF2 ()
    extends typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2
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
    @JSImport("crypto-js", "algo.PBKDF2.create")
    @js.native
    def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
    @JSImport("crypto-js", "algo.PBKDF2.create")
    @js.native
    def create(cfg: KDFOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
  }
  
  /**
    * RC4 stream cipher algorithm.
    */
  @JSImport("crypto-js", "algo.RC4")
  @js.native
  val RC4: CipherStatic = js.native
  
  /**
    * Modified RC4 stream cipher algorithm.
    */
  @JSImport("crypto-js", "algo.RC4Drop")
  @js.native
  val RC4Drop: CipherStatic = js.native
  
  /**
    * RIPEMD160 hash algorithm.
    */
  @JSImport("crypto-js", "algo.RIPEMD160")
  @js.native
  val RIPEMD160: HasherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm
    */
  @JSImport("crypto-js", "algo.Rabbit")
  @js.native
  val Rabbit: CipherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm.
    *
    * This is a legacy version that neglected to convert the key to little-endian.
    * This error doesn't affect the cipher's security,
    * but it does affect its compatibility with other implementations.
    */
  @JSImport("crypto-js", "algo.RabbitLegacy")
  @js.native
  val RabbitLegacy: CipherStatic = js.native
  
  /**
    * SHA-1 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA1")
  @js.native
  val SHA1: HasherStatic = js.native
  
  /**
    * SHA-224 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA224")
  @js.native
  val SHA224: HasherStatic = js.native
  
  /**
    * SHA-256 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA256")
  @js.native
  val SHA256: HasherStatic = js.native
  
  /**
    * SHA-3 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA3")
  @js.native
  val SHA3: HasherStatic = js.native
  
  /**
    * SHA-384 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA384")
  @js.native
  val SHA384: HasherStatic = js.native
  
  /**
    * SHA-512 hash algorithm.
    */
  @JSImport("crypto-js", "algo.SHA512")
  @js.native
  val SHA512: HasherStatic = js.native
  
  /**
    * Triple-DES block cipher algorithm.
    */
  @JSImport("crypto-js", "algo.TripleDES")
  @js.native
  val TripleDES: CipherStatic = js.native
}
