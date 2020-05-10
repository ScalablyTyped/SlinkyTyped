package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteRequest extends js.Object {
  /**
    * The IPv4 CIDR address block used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block used for the destination match. Routing decisions are based on the most specific match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * [IPv6 traffic only] The ID of an egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.native
  /**
    * The ID of an internet gateway or virtual private gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[RouteGatewayId] = js.native
  /**
    * The ID of a NAT instance in your VPC. The operation fails if you specify an instance ID unless exactly one network interface is attached.
    */
  var InstanceId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceId] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayId] = js.native
  /**
    * [IPv4 traffic only] The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NatGatewayId] = js.native
  /**
    * The ID of a network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * The ID of the route table for the route.
    */
  var RouteTableId: typingsSlinky.awsSdk.ec2Mod.RouteTableId = js.native
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayId] = js.native
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcPeeringConnectionId] = js.native
}

object CreateRouteRequest {
  @scala.inline
  def apply(RouteTableId: RouteTableId): CreateRouteRequest = {
    val __obj = js.Dynamic.literal(RouteTableId = RouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteRequest]
  }
  @scala.inline
  implicit class CreateRouteRequestOps[Self <: CreateRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteTableId(value: RouteTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIpv6CidrBlock")(js.undefined)
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
    def withEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressOnlyInternetGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressOnlyInternetGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EgressOnlyInternetGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: RouteGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayId(value: LocalGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGatewayId(value: NatGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
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
    def withVpcPeeringConnectionId(value: VpcPeeringConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

