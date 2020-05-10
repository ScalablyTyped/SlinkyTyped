package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmClientCertificateResult extends js.Object {
  var HsmClientCertificate: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.HsmClientCertificate] = js.native
}

object CreateHsmClientCertificateResult {
  @scala.inline
  def apply(): CreateHsmClientCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmClientCertificateResult]
  }
  @scala.inline
  implicit class CreateHsmClientCertificateResultOps[Self <: CreateHsmClientCertificateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmClientCertificate(value: HsmClientCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmClientCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificate")(js.undefined)
        ret
    }
  }
  
}

