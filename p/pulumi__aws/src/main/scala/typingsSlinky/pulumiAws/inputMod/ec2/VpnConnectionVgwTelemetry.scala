package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionVgwTelemetry extends js.Object {
  var acceptedRouteCount: js.UndefOr[Input[Double]] = js.native
  var lastStatusChange: js.UndefOr[Input[String]] = js.native
  var outsideIpAddress: js.UndefOr[Input[String]] = js.native
  var status: js.UndefOr[Input[String]] = js.native
  var statusMessage: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionVgwTelemetry {
  @scala.inline
  def apply(): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  @scala.inline
  implicit class VpnConnectionVgwTelemetryOps[Self <: VpnConnectionVgwTelemetry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedRouteCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedRouteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedRouteCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedRouteCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusChange(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
  }
  
}

