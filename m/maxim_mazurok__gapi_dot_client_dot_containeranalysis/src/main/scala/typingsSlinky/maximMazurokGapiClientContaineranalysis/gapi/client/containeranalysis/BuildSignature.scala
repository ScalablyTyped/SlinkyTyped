package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildSignature extends StObject {
  
  /**
    * An ID for the key used to sign. This could be either an ID for the key stored in `public_key` (such as the ID or fingerprint for a PGP key, or the CN for a cert), or a reference to
    * an external key (such as a reference to a key in Cloud Key Management Service).
    */
  var keyId: js.UndefOr[String] = js.native
  
  /** The type of the key, either stored in `public_key` or referenced in `key_id`. */
  var keyType: js.UndefOr[String] = js.native
  
  /**
    * Public key of the builder which can be used to verify that the related findings are valid and unchanged. If `key_type` is empty, this defaults to PEM encoded public keys. This field
    * may be empty if `key_id` references an external key. For Cloud Build based signatures, this is a PEM encoded public key. To verify the Cloud Build signature, place the contents of
    * this field into a file (public.pem). The signature field is base64-decoded into its binary representation in signature.bin, and the provenance bytes from `BuildDetails` are
    * base64-decoded into a binary representation in signed.bin. OpenSSL can then verify the signature: `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
    */
  var publicKey: js.UndefOr[String] = js.native
  
  /** Required. Signature of the related `BuildProvenance`. In JSON, this is base-64 encoded. */
  var signature: js.UndefOr[String] = js.native
}
object BuildSignature {
  
  @scala.inline
  def apply(): BuildSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSignature]
  }
  
  @scala.inline
  implicit class BuildSignatureMutableBuilder[Self <: BuildSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
