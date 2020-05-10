package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayPeeringAttachmentResult extends js.Object {
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.native
}

object CreateTransitGatewayPeeringAttachmentResult {
  @scala.inline
  def apply(): CreateTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPeeringAttachmentResult]
  }
  @scala.inline
  implicit class CreateTransitGatewayPeeringAttachmentResultOps[Self <: CreateTransitGatewayPeeringAttachmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayPeeringAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayPeeringAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayPeeringAttachment")(js.undefined)
        ret
    }
  }
  
}

