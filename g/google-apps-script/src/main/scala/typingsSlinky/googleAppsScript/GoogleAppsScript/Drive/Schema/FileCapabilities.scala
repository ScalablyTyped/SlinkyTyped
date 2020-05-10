package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCapabilities extends js.Object {
  var canAddChildren: js.UndefOr[Boolean] = js.native
  var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var canChangeRestrictedDownload: js.UndefOr[Boolean] = js.native
  var canComment: js.UndefOr[Boolean] = js.native
  var canCopy: js.UndefOr[Boolean] = js.native
  var canDelete: js.UndefOr[Boolean] = js.native
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  var canDownload: js.UndefOr[Boolean] = js.native
  var canEdit: js.UndefOr[Boolean] = js.native
  var canListChildren: js.UndefOr[Boolean] = js.native
  var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.native
  var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.native
  var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.native
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.native
  var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.native
  var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.native
  var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.native
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.native
  var canReadDrive: js.UndefOr[Boolean] = js.native
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  var canReadTeamDrive: js.UndefOr[Boolean] = js.native
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  var canRename: js.UndefOr[Boolean] = js.native
  var canShare: js.UndefOr[Boolean] = js.native
  var canTrash: js.UndefOr[Boolean] = js.native
  var canTrashChildren: js.UndefOr[Boolean] = js.native
  var canUntrash: js.UndefOr[Boolean] = js.native
}

object FileCapabilities {
  @scala.inline
  def apply(): FileCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileCapabilities]
  }
  @scala.inline
  implicit class FileCapabilitiesOps[Self <: FileCapabilities] (val x: Self) extends AnyVal {
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
    def withCanChangeCopyRequiresWriterPermission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeCopyRequiresWriterPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeCopyRequiresWriterPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeCopyRequiresWriterPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withCanChangeRestrictedDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeRestrictedDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeRestrictedDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeRestrictedDownload")(js.undefined)
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
    def withCanDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(js.undefined)
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
    def withCanMoveChildrenOutOfDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenOutOfDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveChildrenOutOfDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenOutOfDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenOutOfTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveChildrenOutOfTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenOutOfTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveChildrenWithinDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenWithinDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveChildrenWithinDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenWithinDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveChildrenWithinTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenWithinTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveChildrenWithinTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveChildrenWithinTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveItemIntoTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemIntoTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveItemIntoTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemIntoTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveItemOutOfDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemOutOfDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveItemOutOfDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemOutOfDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveItemOutOfTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemOutOfTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveItemOutOfTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemOutOfTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveItemWithinDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemWithinDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveItemWithinDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemWithinDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveItemWithinTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemWithinTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveItemWithinTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemWithinTeamDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withCanMoveTeamDriveItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveTeamDriveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanMoveTeamDriveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveTeamDriveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withCanReadDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanReadDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadDrive")(js.undefined)
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
    def withCanReadTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanReadTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadTeamDrive")(js.undefined)
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
    def withCanTrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanTrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTrash")(js.undefined)
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
    @scala.inline
    def withCanUntrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUntrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanUntrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUntrash")(js.undefined)
        ret
    }
  }
  
}

