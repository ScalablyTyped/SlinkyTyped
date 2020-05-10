package typingsSlinky.pulumiAws.groupPolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iamGroupMod.Group
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyAttachmentState extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: js.UndefOr[Input[String | Group]] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
}

object GroupPolicyAttachmentState {
  @scala.inline
  def apply(): GroupPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupPolicyAttachmentState]
  }
  @scala.inline
  implicit class GroupPolicyAttachmentStateOps[Self <: GroupPolicyAttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Input[String | Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyArn")(js.undefined)
        ret
    }
  }
  
}

