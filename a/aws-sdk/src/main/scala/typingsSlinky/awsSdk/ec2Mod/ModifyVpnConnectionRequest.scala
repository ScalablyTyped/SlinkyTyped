package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CustomerGatewayId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typingsSlinky.awsSdk.ec2Mod.VpnConnectionId = js.native
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnGatewayId] = js.native
}

object ModifyVpnConnectionRequest {
  @scala.inline
  def apply(VpnConnectionId: VpnConnectionId): ModifyVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpnConnectionRequest]
  }
  @scala.inline
  implicit class ModifyVpnConnectionRequestOps[Self <: ModifyVpnConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpnConnectionId(value: VpnConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerGatewayId(value: CustomerGatewayId): Self = {
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
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: TransitGatewayId): Self = {
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
    def withVpnGatewayId(value: VpnGatewayId): Self = {
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

