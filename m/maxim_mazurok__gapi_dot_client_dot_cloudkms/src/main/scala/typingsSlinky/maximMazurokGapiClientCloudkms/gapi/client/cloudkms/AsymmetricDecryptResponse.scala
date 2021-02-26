package typingsSlinky.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricDecryptResponse extends StObject {
  
  /** The decrypted data originally encrypted with the matching public key. */
  var plaintext: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned AsymmetricDecryptResponse.plaintext. An integrity check of AsymmetricDecryptResponse.plaintext can be performed by
    * computing the CRC32C checksum of AsymmetricDecryptResponse.plaintext and comparing your results to this field. Discard the response in case of non-matching checksum values, and
    * perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
    * compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support
    * this type. NOTE: This field is in Beta.
    */
  var plaintextCrc32c: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A flag indicating whether AsymmetricDecryptRequest.ciphertext_crc32c was received by KeyManagementService and used for the integrity verification of
    * the ciphertext. A false value of this field indicates either that AsymmetricDecryptRequest.ciphertext_crc32c was left unset or that it was not delivered to KeyManagementService. If
    * you've set AsymmetricDecryptRequest.ciphertext_crc32c but this field is still false, discard the response and perform a limited number of retries. NOTE: This field is in Beta.
    */
  var verifiedCiphertextCrc32c: js.UndefOr[Boolean] = js.native
}
object AsymmetricDecryptResponse {
  
  @scala.inline
  def apply(): AsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricDecryptResponse]
  }
  
  @scala.inline
  implicit class AsymmetricDecryptResponseMutableBuilder[Self <: AsymmetricDecryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextCrc32c(value: String): Self = StObject.set(x, "plaintextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextCrc32cUndefined: Self = StObject.set(x, "plaintextCrc32c", js.undefined)
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
    
    @scala.inline
    def setVerifiedCiphertextCrc32c(value: Boolean): Self = StObject.set(x, "verifiedCiphertextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedCiphertextCrc32cUndefined: Self = StObject.set(x, "verifiedCiphertextCrc32c", js.undefined)
  }
}
