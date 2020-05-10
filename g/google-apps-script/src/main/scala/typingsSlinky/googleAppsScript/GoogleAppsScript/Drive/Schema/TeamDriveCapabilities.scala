package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamDriveCapabilities extends js.Object {
  var canAddChildren: js.UndefOr[Boolean] = js.native
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.native
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.native
  var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.native
  var canChangeTeamMembersOnlyRestriction: js.UndefOr[Boolean] = js.native
  var canComment: js.UndefOr[Boolean] = js.native
  var canCopy: js.UndefOr[Boolean] = js.native
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  var canDeleteTeamDrive: js.UndefOr[Boolean] = js.native
  var canDownload: js.UndefOr[Boolean] = js.native
  var canEdit: js.UndefOr[Boolean] = js.native
  var canListChildren: js.UndefOr[Boolean] = js.native
  var canManageMembers: js.UndefOr[Boolean] = js.native
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  var canRename: js.UndefOr[Boolean] = js.native
  var canRenameTeamDrive: js.UndefOr[Boolean] = js.native
  var canShare: js.UndefOr[Boolean] = js.native
  var canTrashChildren: js.UndefOr[Boolean] = js.native
}

object TeamDriveCapabilities {
  @scala.inline
  def apply(): TeamDriveCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamDriveCapabilities]
  }
  @scala.inline
  implicit class TeamDriveCapabilitiesOps[Self <: TeamDriveCapabilities] (val x: Self) extends AnyVal {
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
    def withCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeCopyRequiresWriterPermissionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeCopyRequiresWriterPermissionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeCopyRequiresWriterPermissionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeDomainUsersOnlyRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeDomainUsersOnlyRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeDomainUsersOnlyRestriction")(js.undefined)
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
    def withCanChangeTeamMembersOnlyRestriction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeTeamMembersOnlyRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeTeamMembersOnlyRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeTeamMembersOnlyRestriction")(js.undefined)
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
    def withCanDeleteChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeleteChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDeleteChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDeleteChildren")(js.undefined)
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
    @scala.inline
    def withCanTrashChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTrashChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanTrashChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTrashChildren")(js.undefined)
        ret
    }
  }
  
}

