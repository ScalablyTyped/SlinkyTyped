package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /**
    * The IPv4 CIDR block used for the destination match.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block used for the destination match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The prefix of the AWS service.
    */
  var DestinationPrefixListId: js.UndefOr[String] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a NAT instance in your VPC.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * Describes how the route was created.    CreateRouteTable - The route was automatically created when the route table was created.    CreateRoute - The route was manually added to the route table.    EnableVgwRoutePropagation - The route was propagated by route propagation.  
    */
  var Origin: js.UndefOr[RouteOrigin] = js.native
  /**
    * The state of the route. The blackhole state indicates that the route's target isn't available (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
    */
  var State: js.UndefOr[RouteState] = js.native
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object Route {
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
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
    def withDestinationPrefixListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPrefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPrefixListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPrefixListId")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressOnlyInternetGatewayId(value: String): Self = {
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
    def withGatewayId(value: String): Self = {
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
    def withInstanceId(value: String): Self = {
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
    def withInstanceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayId(value: String): Self = {
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
    def withNatGatewayId(value: String): Self = {
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
    def withNetworkInterfaceId(value: String): Self = {
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
    def withOrigin(value: RouteOrigin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origin")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: RouteState): Self = {
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
    def withVpcPeeringConnectionId(value: String): Self = {
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

