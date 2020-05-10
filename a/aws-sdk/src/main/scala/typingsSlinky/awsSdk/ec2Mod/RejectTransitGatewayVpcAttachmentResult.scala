package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.native
}

object RejectTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(): RejectTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayVpcAttachmentResult]
  }
  @scala.inline
  implicit class RejectTransitGatewayVpcAttachmentResultOps[Self <: RejectTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayVpcAttachment(value: TransitGatewayVpcAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayVpcAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayVpcAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayVpcAttachment")(js.undefined)
        ret
    }
  }
  
}

