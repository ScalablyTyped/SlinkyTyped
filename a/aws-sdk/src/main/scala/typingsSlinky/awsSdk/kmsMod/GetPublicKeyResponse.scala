package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicKeyResponse extends StObject {
  
  /**
    * The type of the of the public key that was downloaded.
    */
  var CustomerMasterKeySpec: js.UndefOr[typingsSlinky.awsSdk.kmsMod.CustomerMasterKeySpec] = js.native
  
  /**
    * The encryption algorithms that AWS KMS supports for this key.  This information is critical. If a public key encrypts data outside of AWS KMS by using an unsupported encryption algorithm, the ciphertext cannot be decrypted.  This field appears in the response only when the KeyUsage of the public key is ENCRYPT_DECRYPT.
    */
  var EncryptionAlgorithms: js.UndefOr[EncryptionAlgorithmSpecList] = js.native
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK from which the public key was downloaded.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * The permitted use of the public key. Valid values are ENCRYPT_DECRYPT or SIGN_VERIFY.  This information is critical. If a public key with SIGN_VERIFY key usage encrypts data outside of AWS KMS, the ciphertext cannot be decrypted. 
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.native
  
  /**
    * The exported public key.  The value is a DER-encoded X.509 public key, also known as SubjectPublicKeyInfo (SPKI), as defined in RFC 5280. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded. 
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
  
  /**
    * The signing algorithms that AWS KMS supports for this key. This field appears in the response only when the KeyUsage of the public key is SIGN_VERIFY.
    */
  var SigningAlgorithms: js.UndefOr[SigningAlgorithmSpecList] = js.native
}
object GetPublicKeyResponse {
  
  @scala.inline
  def apply(): GetPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicKeyResponse]
  }
  
  @scala.inline
  implicit class GetPublicKeyResponseMutableBuilder[Self <: GetPublicKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerMasterKeySpec(value: CustomerMasterKeySpec): Self = StObject.set(x, "CustomerMasterKeySpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerMasterKeySpecUndefined: Self = StObject.set(x, "CustomerMasterKeySpec", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithms(value: EncryptionAlgorithmSpecList): Self = StObject.set(x, "EncryptionAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmsUndefined: Self = StObject.set(x, "EncryptionAlgorithms", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithmsVarargs(value: EncryptionAlgorithmSpec*): Self = StObject.set(x, "EncryptionAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsageType): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    @scala.inline
    def setPublicKey(value: PublicKeyType): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    @scala.inline
    def setSigningAlgorithms(value: SigningAlgorithmSpecList): Self = StObject.set(x, "SigningAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithmsUndefined: Self = StObject.set(x, "SigningAlgorithms", js.undefined)
    
    @scala.inline
    def setSigningAlgorithmsVarargs(value: SigningAlgorithmSpec*): Self = StObject.set(x, "SigningAlgorithms", js.Array(value :_*))
  }
}
