package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalHistory extends js.Object {
  /** A user or reviewer comment. */
  var comment: js.UndefOr[WorkspaceProposalHistoryComment] = js.native
  /** The party responsible for the change in history. */
  var createdBy: js.UndefOr[WorkspaceProposalUser] = js.native
  /** When this history event was added to the workspace proposal. */
  var createdTimestamp: js.UndefOr[Timestamp] = js.native
  /** A change in the proposal's status. */
  var statusChange: js.UndefOr[WorkspaceProposalHistoryStatusChange] = js.native
  /** The history type distinguishing between comments and status changes. */
  var `type`: js.UndefOr[String] = js.native
}

object WorkspaceProposalHistory {
  @scala.inline
  def apply(): WorkspaceProposalHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalHistory]
  }
  @scala.inline
  implicit class WorkspaceProposalHistoryOps[Self <: WorkspaceProposalHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: WorkspaceProposalHistoryComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: WorkspaceProposalUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusChange(value: WorkspaceProposalHistoryStatusChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

