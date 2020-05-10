package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VgwTelemetry extends js.Object {
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The date and time of the last change in status.
    */
  var LastStatusChange: js.UndefOr[js.Date] = js.native
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.native
  /**
    * The status of the VPN tunnel.
    */
  var Status: js.UndefOr[TelemetryStatus] = js.native
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object VgwTelemetry {
  @scala.inline
  def apply(): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgwTelemetry]
  }
  @scala.inline
  implicit class VgwTelemetryOps[Self <: VgwTelemetry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedRouteCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptedRouteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedRouteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptedRouteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusChange(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutsideIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TelemetryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

