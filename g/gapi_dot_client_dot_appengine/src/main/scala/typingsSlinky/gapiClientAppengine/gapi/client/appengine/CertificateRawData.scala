package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRawData extends js.Object {
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer.
    * Must include the header and footer. Example: <pre> -----BEGIN RSA PRIVATE KEY----- <unencrypted_key_value> -----END RSA PRIVATE KEY----- </pre>
    * @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.native
  /**
    * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: <pre> -----BEGIN
    * CERTIFICATE----- <certificate_value> -----END CERTIFICATE----- </pre>
    */
  var publicCertificate: js.UndefOr[String] = js.native
}

object CertificateRawData {
  @scala.inline
  def apply(): CertificateRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRawData]
  }
  @scala.inline
  implicit class CertificateRawDataOps[Self <: CertificateRawData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicCertificate")(js.undefined)
        ret
    }
  }
  
}

