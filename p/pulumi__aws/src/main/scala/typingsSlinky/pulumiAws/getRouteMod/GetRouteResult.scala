package typingsSlinky.pulumiAws.getRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteResult extends js.Object {
  val destinationCidrBlock: String = js.native
  val destinationIpv6CidrBlock: String = js.native
  val egressOnlyGatewayId: String = js.native
  val gatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instanceId: String = js.native
  val natGatewayId: String = js.native
  val networkInterfaceId: String = js.native
  val routeTableId: String = js.native
  val transitGatewayId: String = js.native
  val vpcPeeringConnectionId: String = js.native
}

object GetRouteResult {
  @scala.inline
  def apply(
    destinationCidrBlock: String,
    destinationIpv6CidrBlock: String,
    egressOnlyGatewayId: String,
    gatewayId: String,
    id: String,
    instanceId: String,
    natGatewayId: String,
    networkInterfaceId: String,
    routeTableId: String,
    transitGatewayId: String,
    vpcPeeringConnectionId: String
  ): GetRouteResult = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], destinationIpv6CidrBlock = destinationIpv6CidrBlock.asInstanceOf[js.Any], egressOnlyGatewayId = egressOnlyGatewayId.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], natGatewayId = natGatewayId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteResult]
  }
  @scala.inline
  implicit class GetRouteResultOps[Self <: GetRouteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationIpv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEgressOnlyGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egressOnlyGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNatGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcPeeringConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

