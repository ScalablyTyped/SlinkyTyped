package typingsSlinky.pulumiAws.userPolicyAttachmentMod

import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.userMod.User
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * The user the policy should be applied to
    */
  val user: js.UndefOr[Input[String | User]] = js.native
}

object UserPolicyAttachmentState {
  @scala.inline
  def apply(): UserPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPolicyAttachmentState]
  }
  @scala.inline
  implicit class UserPolicyAttachmentStateOps[Self <: UserPolicyAttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUser(value: Input[String | User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

