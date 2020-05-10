package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePullRequestApprovalRuleInput extends js.Object {
  /**
    * The name of the approval rule you want to delete.
    */
  var approvalRuleName: ApprovalRuleName = js.native
  /**
    * The system-generated ID of the pull request that contains the approval rule you want to delete.
    */
  var pullRequestId: PullRequestId = js.native
}

object DeletePullRequestApprovalRuleInput {
  @scala.inline
  def apply(approvalRuleName: ApprovalRuleName, pullRequestId: PullRequestId): DeletePullRequestApprovalRuleInput = {
    val __obj = js.Dynamic.literal(approvalRuleName = approvalRuleName.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleInput]
  }
  @scala.inline
  implicit class DeletePullRequestApprovalRuleInputOps[Self <: DeletePullRequestApprovalRuleInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRuleName(value: ApprovalRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequestId(value: PullRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

