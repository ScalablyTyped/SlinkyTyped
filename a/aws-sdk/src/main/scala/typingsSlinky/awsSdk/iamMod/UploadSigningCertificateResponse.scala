package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSigningCertificateResponse extends js.Object {
  /**
    * Information about the certificate.
    */
  var Certificate: SigningCertificate = js.native
}

object UploadSigningCertificateResponse {
  @scala.inline
  def apply(Certificate: SigningCertificate): UploadSigningCertificateResponse = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSigningCertificateResponse]
  }
  @scala.inline
  implicit class UploadSigningCertificateResponseOps[Self <: UploadSigningCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: SigningCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

