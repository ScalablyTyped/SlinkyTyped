package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePullRequestApprovalRuleOutput extends js.Object {
  /**
    * The ID of the deleted approval rule.   If the approval rule was deleted in an earlier API call, the response is 200 OK without content. 
    */
  var approvalRuleId: ApprovalRuleId = js.native
}

object DeletePullRequestApprovalRuleOutput {
  @scala.inline
  def apply(approvalRuleId: ApprovalRuleId): DeletePullRequestApprovalRuleOutput = {
    val __obj = js.Dynamic.literal(approvalRuleId = approvalRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleOutput]
  }
  @scala.inline
  implicit class DeletePullRequestApprovalRuleOutputOps[Self <: DeletePullRequestApprovalRuleOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleId(value: ApprovalRuleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

