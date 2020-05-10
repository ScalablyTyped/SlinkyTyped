package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnGatewayStatus extends js.Object {
  /**
    * List of VPN connection for this VpnGateway.
    */
  var vpnConnections: js.UndefOr[js.Array[SchemaVpnGatewayStatusVpnConnection]] = js.native
}

object SchemaVpnGatewayStatus {
  @scala.inline
  def apply(): SchemaVpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatus]
  }
  @scala.inline
  implicit class SchemaVpnGatewayStatusOps[Self <: SchemaVpnGatewayStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnConnections(value: js.Array[SchemaVpnGatewayStatusVpnConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnections")(js.undefined)
        ret
    }
  }
  
}

