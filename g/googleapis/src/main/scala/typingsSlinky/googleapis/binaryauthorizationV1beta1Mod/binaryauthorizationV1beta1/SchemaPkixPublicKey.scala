package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public key in the PkixPublicKey format (see
  * https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public
  * keys of this type are typically textually encoded using the PEM format.
  */
@js.native
trait SchemaPkixPublicKey extends StObject {
  
  /**
    * A PEM-encoded public key, as described in
    * https://tools.ietf.org/html/rfc7468#section-13
    */
  var publicKeyPem: js.UndefOr[String] = js.native
  
  /**
    * The signature algorithm used to verify a message against a signature
    * using this key. These signature algorithm must match the structure and
    * any object identifiers encoded in `public_key_pem` (i.e. this algorithm
    * must match that of the public key).
    */
  var signatureAlgorithm: js.UndefOr[String] = js.native
}
object SchemaPkixPublicKey {
  
  @scala.inline
  def apply(): SchemaPkixPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPkixPublicKey]
  }
  
  @scala.inline
  implicit class SchemaPkixPublicKeyMutableBuilder[Self <: SchemaPkixPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyPem(value: String): Self = StObject.set(x, "publicKeyPem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyPemUndefined: Self = StObject.set(x, "publicKeyPem", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
  }
}
