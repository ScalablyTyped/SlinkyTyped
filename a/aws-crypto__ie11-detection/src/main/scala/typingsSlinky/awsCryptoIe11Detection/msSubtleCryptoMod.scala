package typingsSlinky.awsCryptoIe11Detection

import typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
import typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSAES-PKCS1-v1_5`
import typingsSlinky.awsCryptoIe11Detection.cryptoOperationMod.CryptoOperation
import typingsSlinky.awsCryptoIe11Detection.keyMod.Key
import typingsSlinky.awsCryptoIe11Detection.keyOperationMod.KeyOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msSubtleCryptoMod {
  
  type EncryptionOrVerificationAlgorithm = `RSAES-PKCS1-v1_5`
  
  @js.native
  trait HashAlgorithm extends StObject {
    
    var name: Ie11DigestAlgorithm = js.native
  }
  object HashAlgorithm {
    
    @scala.inline
    def apply(name: Ie11DigestAlgorithm): HashAlgorithm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashAlgorithm]
    }
    
    @scala.inline
    implicit class HashAlgorithmMutableBuilder[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Ie11DigestAlgorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HmacAlgorithm extends StObject {
    
    var hash: HashAlgorithm = js.native
    
    var name: HMAC = js.native
  }
  object HmacAlgorithm {
    
    @scala.inline
    def apply(hash: HashAlgorithm, name: HMAC): HmacAlgorithm = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HmacAlgorithm]
    }
    
    @scala.inline
    implicit class HmacAlgorithmMutableBuilder[Self <: HmacAlgorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: HashAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: HMAC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`
  */
  trait Ie11DigestAlgorithm extends StObject
  object Ie11DigestAlgorithm {
    
    @scala.inline
    def `SHA-1`: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1` = "SHA-1".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`]
    
    @scala.inline
    def `SHA-256`: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256` = "SHA-256".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`]
    
    @scala.inline
    def `SHA-384`: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384` = "SHA-384".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-CBC`
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-GCM`
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSA-OAEP`
    - typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  */
  type Ie11EncryptionAlgorithm = _Ie11EncryptionAlgorithm | EncryptionOrVerificationAlgorithm
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey
    - typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey
  */
  trait KeyUsage extends StObject
  object KeyUsage {
    
    @scala.inline
    def decrypt: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt = "decrypt".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt]
    
    @scala.inline
    def derive: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive = "derive".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive]
    
    @scala.inline
    def encrypt: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt = "encrypt".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt]
    
    @scala.inline
    def importKey: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey = "importKey".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey]
    
    @scala.inline
    def sign: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign = "sign".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign]
    
    @scala.inline
    def unwrapKey: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey = "unwrapKey".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey]
    
    @scala.inline
    def verify: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify = "verify".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify]
    
    @scala.inline
    def wrapKey: typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey = "wrapKey".asInstanceOf[typingsSlinky.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey]
  }
  
  @js.native
  trait MsSubtleCrypto extends StObject {
    
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
    def digest(algorithm: Ie11DigestAlgorithm, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def exportKey(format: String, key: Key): KeyOperation = js.native
    
    def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
    def generateKey(
      algorithm: Ie11EncryptionAlgorithm,
      extractable: js.UndefOr[scala.Nothing],
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: js.UndefOr[scala.Nothing], keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: js.Any): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: js.Any,
      extractable: js.UndefOr[scala.Nothing],
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: js.Any, extractable: Boolean): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: js.Any,
      extractable: Boolean,
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    
    def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
    def sign(algorithm: SigningAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def verify(algorithm: EncryptionOrVerificationAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: EncryptionOrVerificationAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
    def verify(algorithm: SigningAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: SigningAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
  }
  
  type SigningAlgorithm = HmacAlgorithm
  
  trait _Ie11EncryptionAlgorithm extends StObject
}
