package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLunaClientRequest extends js.Object {
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientArn] = js.native
}

object DescribeLunaClientRequest {
  @scala.inline
  def apply(): DescribeLunaClientRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientRequest]
  }
  @scala.inline
  implicit class DescribeLunaClientRequestOps[Self <: DescribeLunaClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateFingerprint(value: CertificateFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withClientArn(value: ClientArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientArn")(js.undefined)
        ret
    }
  }
  
}

