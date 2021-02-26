package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgpSignedAttestation extends StObject {
  
  /**
    * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation
    * payload is a valid instantiation of that type (for example by validating a JSON schema).
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a
    * 40 character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated
    * key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with
    * --with-colons. For example: ``` gpg --with-colons --with-fingerprint --force-v4-certs \ --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:......
    * fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: ``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
    */
  var pgpKeyId: js.UndefOr[String] = js.native
  
  /**
    * Required. The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent. Since this message only supports attached signatures, the payload that was signed
    * must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign`
    * rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in
    * `signature.gpg` for the `payload.json` attestation payload.
    */
  var signature: js.UndefOr[String] = js.native
}
object PgpSignedAttestation {
  
  @scala.inline
  def apply(): PgpSignedAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PgpSignedAttestation]
  }
  
  @scala.inline
  implicit class PgpSignedAttestationMutableBuilder[Self <: PgpSignedAttestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setPgpKeyId(value: String): Self = StObject.set(x, "pgpKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPgpKeyIdUndefined: Self = StObject.set(x, "pgpKeyId", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
