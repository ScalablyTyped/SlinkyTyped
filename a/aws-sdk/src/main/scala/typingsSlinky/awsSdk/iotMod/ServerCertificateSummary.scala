package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateSummary extends js.Object {
  /**
    * The ARN of the server certificate.
    */
  var serverCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
  /**
    * The status of the server certificate.
    */
  var serverCertificateStatus: js.UndefOr[ServerCertificateStatus] = js.native
  /**
    * Details that explain the status of the server certificate.
    */
  var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail] = js.native
}

object ServerCertificateSummary {
  @scala.inline
  def apply(): ServerCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCertificateSummary]
  }
  @scala.inline
  implicit class ServerCertificateSummaryOps[Self <: ServerCertificateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerCertificateArn(value: AcmCertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertificateStatus(value: ServerCertificateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertificateStatusDetail(value: ServerCertificateStatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateStatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertificateStatusDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateStatusDetail")(js.undefined)
        ret
    }
  }
  
}

