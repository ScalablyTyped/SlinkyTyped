package typingsSlinky.pulumiAws.vpnGatewayRoutePropagationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnGatewayRoutePropagationState extends js.Object {
  /**
    * The id of the `aws.ec2.RouteTable` to propagate routes into.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the `aws.ec2.VpnGateway` to propagate routes from.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object VpnGatewayRoutePropagationState {
  @scala.inline
  def apply(): VpnGatewayRoutePropagationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayRoutePropagationState]
  }
  @scala.inline
  implicit class VpnGatewayRoutePropagationStateOps[Self <: VpnGatewayRoutePropagationState] (val x: Self) extends AnyVal {
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
    def withoutRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpnGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(js.undefined)
        ret
    }
  }
  
}

