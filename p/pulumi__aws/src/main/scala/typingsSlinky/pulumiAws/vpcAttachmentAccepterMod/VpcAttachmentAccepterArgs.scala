package typingsSlinky.pulumiAws.vpcAttachmentAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcAttachmentAccepterArgs extends js.Object {
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway Attachment to manage.
    */
  val transitGatewayAttachmentId: Input[String] = js.native
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.native
}

object VpcAttachmentAccepterArgs {
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String]): VpcAttachmentAccepterArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentAccepterArgs]
  }
  @scala.inline
  implicit class VpcAttachmentAccepterArgsOps[Self <: VpcAttachmentAccepterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayAttachmentId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayAttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTableAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayDefaultRouteTableAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTableAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTablePropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayDefaultRouteTablePropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayDefaultRouteTablePropagation")(js.undefined)
        ret
    }
  }
  
}

