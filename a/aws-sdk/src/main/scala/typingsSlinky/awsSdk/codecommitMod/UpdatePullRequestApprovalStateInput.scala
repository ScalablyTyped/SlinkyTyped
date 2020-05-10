package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePullRequestApprovalStateInput extends js.Object {
  /**
    * The approval state to associate with the user on the pull request.
    */
  var approvalState: ApprovalState = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the revision.
    */
  var revisionId: RevisionId = js.native
}

object UpdatePullRequestApprovalStateInput {
  @scala.inline
  def apply(approvalState: ApprovalState, pullRequestId: PullRequestId, revisionId: RevisionId): UpdatePullRequestApprovalStateInput = {
    val __obj = js.Dynamic.literal(approvalState = approvalState.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalStateInput]
  }
  @scala.inline
  implicit class UpdatePullRequestApprovalStateInputOps[Self <: UpdatePullRequestApprovalStateInput] (val x: Self) extends AnyVal {
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
    def withPullRequestId(value: PullRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

