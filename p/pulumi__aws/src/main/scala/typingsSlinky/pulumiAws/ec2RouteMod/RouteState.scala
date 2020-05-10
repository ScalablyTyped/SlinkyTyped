package typingsSlinky.pulumiAws.ec2RouteMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteState extends js.Object {
  /**
    * The destination CIDR block.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The destination IPv6 CIDR block.
    */
  val destinationIpv6CidrBlock: js.UndefOr[Input[String]] = js.native
  val destinationPrefixListId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  val egressOnlyGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 instance.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  val instanceOwnerId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC NAT gateway.
    */
  val natGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 network interface.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  val origin: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the routing table.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC peering connection.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object RouteState {
  @scala.inline
  def apply(): RouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteState]
  }
  @scala.inline
  implicit class RouteStateOps[Self <: RouteState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationIpv6CidrBlock(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationIpv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationIpv6CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationPrefixListId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPrefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPrefixListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationPrefixListId")(js.undefined)
        ret
    }
    @scala.inline
    def withEgressOnlyGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egressOnlyGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgressOnlyGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egressOnlyGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcPeeringConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

