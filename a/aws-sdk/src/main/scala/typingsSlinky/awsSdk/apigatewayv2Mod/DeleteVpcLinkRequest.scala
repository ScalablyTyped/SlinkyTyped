package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVpcLinkRequest extends js.Object {
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: string = js.native
}

object DeleteVpcLinkRequest {
  @scala.inline
  def apply(VpcLinkId: string): DeleteVpcLinkRequest = {
    val __obj = js.Dynamic.literal(VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcLinkRequest]
  }
  @scala.inline
  implicit class DeleteVpcLinkRequestOps[Self <: DeleteVpcLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcLinkId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcLinkId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

