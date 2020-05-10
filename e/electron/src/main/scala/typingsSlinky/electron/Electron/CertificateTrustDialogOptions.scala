package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateTrustDialogOptions extends js.Object {
  /**
    * The certificate to trust/import.
    */
  var certificate: Certificate = js.native
  /**
    * The message to display to the user.
    */
  var message: String = js.native
}

object CertificateTrustDialogOptions {
  @scala.inline
  def apply(certificate: Certificate, message: String): CertificateTrustDialogOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateTrustDialogOptions]
  }
  @scala.inline
  implicit class CertificateTrustDialogOptionsOps[Self <: CertificateTrustDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

