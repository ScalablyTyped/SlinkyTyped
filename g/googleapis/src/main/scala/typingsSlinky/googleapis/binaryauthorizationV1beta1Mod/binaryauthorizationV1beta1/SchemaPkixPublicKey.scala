package typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key in the PkixPublicKey format (see
  * https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public
  * keys of this type are typically textually encoded using the PEM format.
  */
@js.native
trait SchemaPkixPublicKey extends js.Object {
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
  implicit class SchemaPkixPublicKeyOps[Self <: SchemaPkixPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeyPem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyPem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyPem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyPem")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
  }
  
}

