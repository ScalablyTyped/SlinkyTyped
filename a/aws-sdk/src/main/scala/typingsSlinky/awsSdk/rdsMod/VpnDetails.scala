package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnDetails extends js.Object {
  /**
    * The IP address of network traffic from AWS to your on-premises data center.
    */
  var VpnGatewayIp: js.UndefOr[String] = js.native
  /**
    * The ID of the VPN.
    */
  var VpnId: js.UndefOr[String] = js.native
  /**
    * The name of the VPN.
    */
  var VpnName: js.UndefOr[String] = js.native
  /**
    * The preshared key (PSK) for the VPN.
    */
  var VpnPSK: js.UndefOr[StringSensitive] = js.native
  /**
    * The state of the VPN.
    */
  var VpnState: js.UndefOr[String] = js.native
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.native
}

object VpnDetails {
  @scala.inline
  def apply(): VpnDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnDetails]
  }
  @scala.inline
  implicit class VpnDetailsOps[Self <: VpnDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnGatewayIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayIp")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnName")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnPSK(value: StringSensitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnPSK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnPSK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnPSK")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnState")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnTunnelOriginatorIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnTunnelOriginatorIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnTunnelOriginatorIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnTunnelOriginatorIP")(js.undefined)
        ret
    }
  }
  
}

