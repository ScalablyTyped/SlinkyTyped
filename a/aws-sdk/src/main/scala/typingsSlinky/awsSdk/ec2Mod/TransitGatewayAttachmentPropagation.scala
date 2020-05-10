package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayAttachmentPropagation extends js.Object {
  /**
    * The state of the propagation route table.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.native
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}

object TransitGatewayAttachmentPropagation {
  @scala.inline
  def apply(): TransitGatewayAttachmentPropagation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachmentPropagation]
  }
  @scala.inline
  implicit class TransitGatewayAttachmentPropagationOps[Self <: TransitGatewayAttachmentPropagation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: TransitGatewayPropagationState): Self = {
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
    def withTransitGatewayRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRouteTableId")(js.undefined)
        ret
    }
  }
  
}

