package typingsSlinky.pulumiAws.groupPolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.iamGroupMod.Group
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyAttachmentArgs extends js.Object {
  /**
    * The group the policy should be applied to
    */
  val group: Input[String | Group] = js.native
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
}

object GroupPolicyAttachmentArgs {
  @scala.inline
  def apply(group: Input[String | Group], policyArn: Input[ARN]): GroupPolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyAttachmentArgs]
  }
  @scala.inline
  implicit class GroupPolicyAttachmentArgsOps[Self <: GroupPolicyAttachmentArgs] (val x: Self) extends AnyVal {
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
    def withPolicyArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

