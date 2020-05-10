package typingsSlinky.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRevocationRequest extends js.Object {
  var reason: js.UndefOr[CertificateRevocationReason] = js.native
}

object CertificateRevocationRequest {
  @scala.inline
  def apply(): CertificateRevocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationRequest]
  }
  @scala.inline
  implicit class CertificateRevocationRequestOps[Self <: CertificateRevocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: CertificateRevocationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}

