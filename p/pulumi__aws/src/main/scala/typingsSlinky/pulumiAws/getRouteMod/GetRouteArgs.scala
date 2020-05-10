package typingsSlinky.pulumiAws.getRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteArgs extends js.Object {
  /**
    * The CIDR block of the Route belonging to the Route Table.
    */
  val destinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block of the Route belonging to the Route Table.
    */
  val destinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The Egress Only Gateway ID of the Route belonging to the Route Table.
    */
  val egressOnlyGatewayId: js.UndefOr[String] = js.native
  /**
    * The Gateway ID of the Route belonging to the Route Table.
    */
  val gatewayId: js.UndefOr[String] = js.native
  /**
    * The Instance ID of the Route belonging to the Route Table.
    */
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The NAT Gateway ID of the Route belonging to the Route Table.
    */
  val natGatewayId: js.UndefOr[String] = js.native
  /**
    * The Network Interface ID of the Route belonging to the Route Table.
    */
  val networkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The id of the specific Route Table containing the Route entry.
    */
  val routeTableId: String = js.native
  /**
    * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
  /**
    * The VPC Peering Connection ID of the Route belonging to the Route Table.
    */
  val vpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object GetRouteArgs {
  @scala.inline
  def apply(routeTableId: String): GetRouteArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteArgs]
  }
  @scala.inline
  implicit class GetRouteArgsOps[Self <: GetRouteArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
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
    def withDestinationIpv6CidrBlock(value: String): Self = {
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
    def withEgressOnlyGatewayId(value: String): Self = {
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
    def withGatewayId(value: String): Self = {
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
    def withInstanceId(value: String): Self = {
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
    def withNatGatewayId(value: String): Self = {
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
    def withNetworkInterfaceId(value: String): Self = {
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
    def withTransitGatewayId(value: String): Self = {
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
    def withVpcPeeringConnectionId(value: String): Self = {
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

