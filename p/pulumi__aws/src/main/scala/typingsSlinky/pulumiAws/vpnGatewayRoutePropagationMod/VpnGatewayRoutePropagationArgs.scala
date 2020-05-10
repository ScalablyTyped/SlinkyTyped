package typingsSlinky.pulumiAws.vpnGatewayRoutePropagationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayRoutePropagationArgs extends js.Object {
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: Input[String] = js.native
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: Input[String] = js.native
}

object VpnGatewayRoutePropagationArgs {
  @scala.inline
  def apply(routeTableId: Input[String], vpnGatewayId: Input[String]): VpnGatewayRoutePropagationArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnGatewayRoutePropagationArgs]
  }
  @scala.inline
  implicit class VpnGatewayRoutePropagationArgsOps[Self <: VpnGatewayRoutePropagationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

