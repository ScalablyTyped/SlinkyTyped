package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteRequest extends js.Object {
  /**
    * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId = js.native
  /**
    * The ID of the virtual interface group.
    */
  var LocalGatewayVirtualInterfaceGroupId: typingsSlinky.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroupId = js.native
}

object CreateLocalGatewayRouteRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    LocalGatewayRouteTableId: LocalGatewayRoutetableId,
    LocalGatewayVirtualInterfaceGroupId: LocalGatewayVirtualInterfaceGroupId
  ): CreateLocalGatewayRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any], LocalGatewayVirtualInterfaceGroupId = LocalGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalGatewayRouteRequest]
  }
  @scala.inline
  implicit class CreateLocalGatewayRouteRequestOps[Self <: CreateLocalGatewayRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalGatewayVirtualInterfaceGroupId(value: LocalGatewayVirtualInterfaceGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayVirtualInterfaceGroupId")(value.asInstanceOf[js.Any])
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
  }
  
}

