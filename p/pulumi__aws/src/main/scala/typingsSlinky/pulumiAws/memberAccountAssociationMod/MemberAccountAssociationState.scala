package typingsSlinky.pulumiAws.memberAccountAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccountAssociationState extends js.Object {
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: js.UndefOr[Input[String]] = js.native
}

object MemberAccountAssociationState {
  @scala.inline
  def apply(): MemberAccountAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAccountAssociationState]
  }
  @scala.inline
  implicit class MemberAccountAssociationStateOps[Self <: MemberAccountAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(js.undefined)
        ret
    }
  }
  
}

