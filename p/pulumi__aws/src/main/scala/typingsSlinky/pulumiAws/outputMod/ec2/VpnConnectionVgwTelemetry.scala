package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionVgwTelemetry extends js.Object {
  var acceptedRouteCount: Double = js.native
  var lastStatusChange: String = js.native
  var outsideIpAddress: String = js.native
  var status: String = js.native
  var statusMessage: String = js.native
}

object VpnConnectionVgwTelemetry {
  @scala.inline
  def apply(
    acceptedRouteCount: Double,
    lastStatusChange: String,
    outsideIpAddress: String,
    status: String,
    statusMessage: String
  ): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount.asInstanceOf[js.Any], lastStatusChange = lastStatusChange.asInstanceOf[js.Any], outsideIpAddress = outsideIpAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  @scala.inline
  implicit class VpnConnectionVgwTelemetryOps[Self <: VpnConnectionVgwTelemetry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedRouteCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedRouteCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastStatusChange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutsideIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

