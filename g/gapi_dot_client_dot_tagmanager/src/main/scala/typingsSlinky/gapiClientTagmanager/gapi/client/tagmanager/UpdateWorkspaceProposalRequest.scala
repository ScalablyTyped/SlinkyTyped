package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkspaceProposalRequest extends js.Object {
  /** When provided, this fingerprint must match the fingerprint of the proposal in storage. */
  var fingerprint: js.UndefOr[String] = js.native
  /** If present, a new comment is added to the workspace proposal history. */
  var newComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.native
  /** If present, the list of reviewers of the workspace proposal is updated. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.native
  /** If present, the status of the workspace proposal is updated. */
  var status: js.UndefOr[String] = js.native
}

object UpdateWorkspaceProposalRequest {
  @scala.inline
  def apply(): UpdateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkspaceProposalRequest]
  }
  @scala.inline
  implicit class UpdateWorkspaceProposalRequestOps[Self <: UpdateWorkspaceProposalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withNewComment(value: WorkspaceProposalHistoryComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newComment")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewers(value: js.Array[WorkspaceProposalUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewers")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

