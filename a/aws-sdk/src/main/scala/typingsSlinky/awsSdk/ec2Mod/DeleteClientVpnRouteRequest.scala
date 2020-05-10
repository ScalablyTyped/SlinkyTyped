package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientVpnRouteRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint from which the route is to be deleted.
    */
  var ClientVpnEndpointId: typingsSlinky.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the route to be deleted.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the target subnet used by the route.
    */
  var TargetVpcSubnetId: js.UndefOr[SubnetId] = js.native
}

object DeleteClientVpnRouteRequest {
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, DestinationCidrBlock: String): DeleteClientVpnRouteRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientVpnRouteRequest]
  }
  @scala.inline
  implicit class DeleteClientVpnRouteRequestOps[Self <: DeleteClientVpnRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientVpnEndpointId(value: ClientVpnEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpnEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
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
    def withTargetVpcSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVpcSubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVpcSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVpcSubnetId")(js.undefined)
        ret
    }
  }
  
}

