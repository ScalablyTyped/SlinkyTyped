package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnection extends js.Object {
  /**
    * The category of the VPN connection. A value of VPN indicates an AWS VPN connection. A value of VPN-Classic indicates an AWS Classic VPN connection.
    */
  var Category: js.UndefOr[String] = js.native
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format). This element is always present in the CreateVpnConnection response; however, it's present in the DescribeVpnConnections response only if the VPN connection is in the pending or available state.
    */
  var CustomerGatewayConfiguration: js.UndefOr[String] = js.native
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  /**
    * The VPN connection options.
    */
  var Options: js.UndefOr[VpnConnectionOptions] = js.native
  /**
    * The static routes associated with the VPN connection.
    */
  var Routes: js.UndefOr[VpnStaticRouteList] = js.native
  /**
    * The current state of the VPN connection.
    */
  var State: js.UndefOr[VpnState] = js.native
  /**
    * Any tags assigned to the VPN connection.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The type of VPN connection.
    */
  var Type: js.UndefOr[GatewayType] = js.native
  /**
    * Information about the VPN tunnel.
    */
  var VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: js.UndefOr[String] = js.native
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[String] = js.native
}

object VpnConnection {
  @scala.inline
  def apply(): VpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnection]
  }
  @scala.inline
  implicit class VpnConnectionOps[Self <: VpnConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerGatewayConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: VpnConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: VpnStaticRouteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: VpnState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GatewayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVgwTelemetry(value: VgwTelemetryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VgwTelemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVgwTelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VgwTelemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnGatewayId")(js.undefined)
        ret
    }
  }
  
}

