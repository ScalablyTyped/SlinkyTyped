package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCertificateResponse extends js.Object {
  /**
    * The Secure Sockets Layer (SSL) certificate.
    */
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Certificate] = js.native
}

object DeleteCertificateResponse {
  @scala.inline
  def apply(): DeleteCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCertificateResponse]
  }
  @scala.inline
  implicit class DeleteCertificateResponseOps[Self <: DeleteCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
  }
  
}

