package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X509CertificateDetails extends js.Object {
  /** The time the certificate becomes invalid. */
  var expiryTime: js.UndefOr[String] = js.native
  /** The entity that signed the certificate. */
  var issuer: js.UndefOr[String] = js.native
  /** The type of public key in the certificate. */
  var publicKeyType: js.UndefOr[String] = js.native
  /** The algorithm used to sign the certificate. */
  var signatureAlgorithm: js.UndefOr[String] = js.native
  /** The time the certificate becomes valid. */
  var startTime: js.UndefOr[String] = js.native
  /** The entity the certificate and public key belong to. */
  var subject: js.UndefOr[String] = js.native
}

object X509CertificateDetails {
  @scala.inline
  def apply(): X509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateDetails]
  }
  @scala.inline
  implicit class X509CertificateDetailsOps[Self <: X509CertificateDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiryTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKeyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyType")(js.undefined)
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
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

