package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalHistoryStatusChange extends js.Object {
  /** The new proposal status after that status change. */
  var newStatus: js.UndefOr[String] = js.native
  /** The old proposal status before the status change. */
  var oldStatus: js.UndefOr[String] = js.native
}

object WorkspaceProposalHistoryStatusChange {
  @scala.inline
  def apply(): WorkspaceProposalHistoryStatusChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalHistoryStatusChange]
  }
  @scala.inline
  implicit class WorkspaceProposalHistoryStatusChangeOps[Self <: WorkspaceProposalHistoryStatusChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOldStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStatus")(js.undefined)
        ret
    }
  }
  
}

