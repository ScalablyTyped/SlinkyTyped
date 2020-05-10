package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An SSL certificate obtained from a certificate authority.
  */
@js.native
trait SchemaCertificateRawData extends js.Object {
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on
    * certificate creation and then encrypted. The key size must be 2048 bits
    * or fewer. Must include the header and footer. Example: &lt;pre&gt;
    * -----BEGIN RSA PRIVATE KEY----- &lt;unencrypted_key_value&gt; -----END
    * RSA PRIVATE KEY----- &lt;/pre&gt; @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.native
  /**
    * PEM encoded x.509 public key certificate. This field is set once on
    * certificate creation. Must include the header and footer. Example:
    * &lt;pre&gt; -----BEGIN CERTIFICATE----- &lt;certificate_value&gt;
    * -----END CERTIFICATE----- &lt;/pre&gt;
    */
  var publicCertificate: js.UndefOr[String] = js.native
}

object SchemaCertificateRawData {
  @scala.inline
  def apply(): SchemaCertificateRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateRawData]
  }
  @scala.inline
  implicit class SchemaCertificateRawDataOps[Self <: SchemaCertificateRawData] (val x: Self) extends AnyVal {
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

