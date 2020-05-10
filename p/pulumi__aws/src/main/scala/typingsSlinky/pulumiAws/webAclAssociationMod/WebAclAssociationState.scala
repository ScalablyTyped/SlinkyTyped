package typingsSlinky.pulumiAws.webAclAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclAssociationState extends js.Object {
  /**
    * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: js.UndefOr[Input[String]] = js.native
}

object WebAclAssociationState {
  @scala.inline
  def apply(): WebAclAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclAssociationState]
  }
  @scala.inline
  implicit class WebAclAssociationStateOps[Self <: WebAclAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withWebAclId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAclId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclId")(js.undefined)
        ret
    }
  }
  
}

