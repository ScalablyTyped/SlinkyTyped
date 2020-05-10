package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableRoute extends js.Object {
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: js.UndefOr[String] = js.native
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  var gatewayId: js.UndefOr[String] = js.native
  /**
    * Identifier of an EC2 instance.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The Ipv6 CIDR block of the route.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * Identifier of a VPC NAT gateway.
    */
  var natGatewayId: js.UndefOr[String] = js.native
  /**
    * Identifier of an EC2 network interface.
    */
  var networkInterfaceId: js.UndefOr[String] = js.native
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  var transitGatewayId: js.UndefOr[String] = js.native
  /**
    * Identifier of a VPC peering connection.
    */
  var vpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object RouteTableRoute {
  @scala.inline
  def apply(): RouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableRoute]
  }
  @scala.inline
  implicit class RouteTableRouteOps[Self <: RouteTableRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
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
    def withIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(js.undefined)
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

