package typingsSlinky.pulumiAws.routeTableAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableAssociationArgs extends js.Object {
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: Input[String] = js.native
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: Input[String] = js.native
}

object RouteTableAssociationArgs {
  @scala.inline
  def apply(transitGatewayAttachmentId: Input[String], transitGatewayRouteTableId: Input[String]): RouteTableAssociationArgs = {
    val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationArgs]
  }
  @scala.inline
  implicit class RouteTableAssociationArgsOps[Self <: RouteTableAssociationArgs] (val x: Self) extends AnyVal {
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
    def withTransitGatewayRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

