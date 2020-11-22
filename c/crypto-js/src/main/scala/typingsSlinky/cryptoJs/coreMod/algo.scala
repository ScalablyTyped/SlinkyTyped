package typingsSlinky.cryptoJs.coreMod

import typingsSlinky.cryptoJs.anon.Hasher
import typingsSlinky.cryptoJs.mod.CipherStatic
import typingsSlinky.cryptoJs.mod.HasherStatic
import typingsSlinky.cryptoJs.mod.KDFOption
import typingsSlinky.cryptoJs.mod.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/core", "algo")
@js.native
object algo extends js.Object {
  
  /**
    * AES block cipher algorithm.
    */
  val AES: CipherStatic = js.native
  
  /**
    * DES block cipher algorithm.
    */
  val DES: CipherStatic = js.native
  
  /**
    * MD5 hash algorithm.
    */
  val MD5: HasherStatic = js.native
  
  /**
    * RC4 stream cipher algorithm.
    */
  val RC4: CipherStatic = js.native
  
  /**
    * Modified RC4 stream cipher algorithm.
    */
  val RC4Drop: CipherStatic = js.native
  
  /**
    * RIPEMD160 hash algorithm.
    */
  val RIPEMD160: HasherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm
    */
  val Rabbit: CipherStatic = js.native
  
  /**
    * Rabbit stream cipher algorithm.
    *
    * This is a legacy version that neglected to convert the key to little-endian.
    * This error doesn't affect the cipher's security,
    * but it does affect its compatibility with other implementations.
    */
  val RabbitLegacy: CipherStatic = js.native
  
  /**
    * SHA-1 hash algorithm.
    */
  val SHA1: HasherStatic = js.native
  
  /**
    * SHA-224 hash algorithm.
    */
  val SHA224: HasherStatic = js.native
  
  /**
    * SHA-256 hash algorithm.
    */
  val SHA256: HasherStatic = js.native
  
  /**
    * SHA-3 hash algorithm.
    */
  val SHA3: HasherStatic = js.native
  
  /**
    * SHA-384 hash algorithm.
    */
  val SHA384: HasherStatic = js.native
  
  /**
    * SHA-512 hash algorithm.
    */
  val SHA512: HasherStatic = js.native
  
  /**
    * Triple-DES block cipher algorithm.
    */
  val TripleDES: CipherStatic = js.native
  
  /**
    * This key derivation function is meant to conform with EVP_BytesToKey.
    * www.openssl.org/docs/crypto/EVP_BytesToKey.html
    */
  @js.native
  abstract class EvpKDF ()
    extends typingsSlinky.cryptoJs.mod.algo.EvpKDF
  /* static members */
  @js.native
  object EvpKDF extends js.Object {
    
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
    def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
    def create(cfg: Hasher): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
  }
  
  /**
    * HMAC algorithm.
    */
  @js.native
  abstract class HMAC ()
    extends typingsSlinky.cryptoJs.mod.algo.HMAC
  /* static members */
  @js.native
  object HMAC extends js.Object {
    
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
    def create(hasher: HasherStatic, key: WordArray): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.HMAC = js.native
  }
  
  /**
    * Password-Based Key Derivation Function 2 algorithm.
    */
  @js.native
  abstract class PBKDF2 ()
    extends typingsSlinky.cryptoJs.mod.algo.PBKDF2
  /* static members */
  @js.native
  object PBKDF2 extends js.Object {
    
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
    def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
    def create(cfg: KDFOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
  }
}
