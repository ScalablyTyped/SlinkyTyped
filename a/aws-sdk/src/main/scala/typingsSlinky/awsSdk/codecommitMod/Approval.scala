package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Approval extends js.Object {
  /**
    * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
    */
  var approvalState: js.UndefOr[ApprovalState] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: js.UndefOr[Arn] = js.native
}

object Approval {
  @scala.inline
  def apply(): Approval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Approval]
  }
  @scala.inline
  implicit class ApprovalOps[Self <: Approval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalState(value: ApprovalState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalState")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userArn")(js.undefined)
        ret
    }
  }
  
}

