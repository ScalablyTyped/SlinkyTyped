package typingsSlinky.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanChangeTeamDriveBackground extends js.Object {
  /** Whether the current user can add children to folders in this Team Drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change the background of this Team Drive. */
  var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.native
  /** Whether the current user can comment on files in this Team Drive. */
  var canComment: js.UndefOr[Boolean] = js.native
  /** Whether the current user can copy files in this Team Drive. */
  var canCopy: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may still fail if there are untrashed items inside the Team
    * Drive.
    */
  var canDeleteTeamDrive: js.UndefOr[Boolean] = js.native
  /** Whether the current user can download files in this Team Drive. */
  var canDownload: js.UndefOr[Boolean] = js.native
  /** Whether the current user can edit files in this Team Drive */
  var canEdit: js.UndefOr[Boolean] = js.native
  /** Whether the current user can list the children of folders in this Team Drive. */
  var canListChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can add members to this Team Drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.native
  /** Whether the current user can read the revisions resource of files in this Team Drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  /** Whether the current user can remove children from folders in this Team Drive. */
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can rename files or folders in this Team Drive. */
  var canRename: js.UndefOr[Boolean] = js.native
  /** Whether the current user can rename this Team Drive. */
  var canRenameTeamDrive: js.UndefOr[Boolean] = js.native
  /** Whether the current user can share files or folders in this Team Drive. */
  var canShare: js.UndefOr[Boolean] = js.native
}

object CanChangeTeamDriveBackground {
  @scala.inline
  def apply(): CanChangeTeamDriveBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanChangeTeamDriveBackground]
  }
  @scala.inline
  implicit class CanChangeTeamDriveBackgroundOps[Self <: CanChangeTeamDriveBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanAddChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanAddChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withCanChangeTeamDriveBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeTeamDriveBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeTeamDriveBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeTeamDriveBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withCanComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(js.undefined)
        ret
    }
    @scala.inline
    def withCanCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDeleteTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeleteTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDeleteTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeleteTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCanListChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanListChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withCanManageMembers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canManageMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanManageMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canManageMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withCanReadRevisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanReadRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(js.undefined)
        ret
    }
    @scala.inline
    def withCanRemoveChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRemoveChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withCanRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRename")(js.undefined)
        ret
    }
    @scala.inline
    def withCanRenameTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRenameTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanRenameTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRenameTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShare")(js.undefined)
        ret
    }
  }
  
}

