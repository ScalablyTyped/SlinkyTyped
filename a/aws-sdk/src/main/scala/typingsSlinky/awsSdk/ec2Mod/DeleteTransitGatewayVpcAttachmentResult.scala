package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayVpcAttachmentResult extends js.Object {
  /**
    * Information about the deleted VPC attachment.
    */
  var TransitGatewayVpcAttachment: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayVpcAttachment] = js.native
}

object DeleteTransitGatewayVpcAttachmentResult {
  @scala.inline
  def apply(): DeleteTransitGatewayVpcAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayVpcAttachmentResult]
  }
  @scala.inline
  implicit class DeleteTransitGatewayVpcAttachmentResultOps[Self <: DeleteTransitGatewayVpcAttachmentResult] (val x: Self) extends AnyVal {
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

