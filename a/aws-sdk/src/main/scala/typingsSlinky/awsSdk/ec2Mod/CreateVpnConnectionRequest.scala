package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionRequest extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: typingsSlinky.awsSdk.ec2Mod.CustomerGatewayId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The options for the VPN connection.
    */
  var Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.native
  /**
    * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private gateway.
    */
  var TransitGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The type of VPN connection (ipsec.1).
    */
  var Type: String = js.native
  /**
    * The ID of the virtual private gateway. If you specify a virtual private gateway, you cannot specify a transit gateway.
    */
  var VpnGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpnGatewayId] = js.native
}

object CreateVpnConnectionRequest {
  @scala.inline
  def apply(CustomerGatewayId: CustomerGatewayId, Type: String): CreateVpnConnectionRequest = {
    val __obj = js.Dynamic.literal(CustomerGatewayId = CustomerGatewayId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionRequest]
  }
  @scala.inline
  implicit class CreateVpnConnectionRequestOps[Self <: CreateVpnConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGatewayId(value: CustomerGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
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
    def withOptions(value: VpnConnectionOptionsSpecification): Self = {
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

