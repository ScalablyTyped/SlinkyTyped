package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableTransitGatewayRouteTablePropagationResult extends js.Object {
  /**
    * Information about route propagation.
    */
  var Propagation: js.UndefOr[TransitGatewayPropagation] = js.native
}

object EnableTransitGatewayRouteTablePropagationResult {
  @scala.inline
  def apply(): EnableTransitGatewayRouteTablePropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationResult]
  }
  @scala.inline
  implicit class EnableTransitGatewayRouteTablePropagationResultOps[Self <: EnableTransitGatewayRouteTablePropagationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropagation(value: TransitGatewayPropagation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Propagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Propagation")(js.undefined)
        ret
    }
  }
  
}

