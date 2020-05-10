package typingsSlinky.gapiDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanAddChildren extends js.Object {
  var canAddChildren: Boolean = js.native
  var canChangeRestrictedDownload: Boolean = js.native
  var canComment: Boolean = js.native
  var canCopy: Boolean = js.native
  var canDelete: Boolean = js.native
  var canDownload: Boolean = js.native
  var canEdit: Boolean = js.native
  var canListChildren: Boolean = js.native
  var canMoveItemIntoTeamDrive: Boolean = js.native
  var canMoveTeamDriveItem: Boolean = js.native
  var canReadRevisions: Boolean = js.native
  var canReadTeamDrive: Boolean = js.native
  var canRemoveChildren: Boolean = js.native
  var canRename: Boolean = js.native
  var canShare: Boolean = js.native
  var canTrash: Boolean = js.native
  var canUntrash: Boolean = js.native
}

object AnonCanAddChildren {
  @scala.inline
  def apply(
    canAddChildren: Boolean,
    canChangeRestrictedDownload: Boolean,
    canComment: Boolean,
    canCopy: Boolean,
    canDelete: Boolean,
    canDownload: Boolean,
    canEdit: Boolean,
    canListChildren: Boolean,
    canMoveItemIntoTeamDrive: Boolean,
    canMoveTeamDriveItem: Boolean,
    canReadRevisions: Boolean,
    canReadTeamDrive: Boolean,
    canRemoveChildren: Boolean,
    canRename: Boolean,
    canShare: Boolean,
    canTrash: Boolean,
    canUntrash: Boolean
  ): AnonCanAddChildren = {
    val __obj = js.Dynamic.literal(canAddChildren = canAddChildren.asInstanceOf[js.Any], canChangeRestrictedDownload = canChangeRestrictedDownload.asInstanceOf[js.Any], canComment = canComment.asInstanceOf[js.Any], canCopy = canCopy.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canDownload = canDownload.asInstanceOf[js.Any], canEdit = canEdit.asInstanceOf[js.Any], canListChildren = canListChildren.asInstanceOf[js.Any], canMoveItemIntoTeamDrive = canMoveItemIntoTeamDrive.asInstanceOf[js.Any], canMoveTeamDriveItem = canMoveTeamDriveItem.asInstanceOf[js.Any], canReadRevisions = canReadRevisions.asInstanceOf[js.Any], canReadTeamDrive = canReadTeamDrive.asInstanceOf[js.Any], canRemoveChildren = canRemoveChildren.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], canShare = canShare.asInstanceOf[js.Any], canTrash = canTrash.asInstanceOf[js.Any], canUntrash = canUntrash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanAddChildren]
  }
  @scala.inline
  implicit class AnonCanAddChildrenOps[Self <: AnonCanAddChildren] (val x: Self) extends AnyVal {
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
    def withCanChangeRestrictedDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeRestrictedDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanListChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canListChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanMoveItemIntoTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveItemIntoTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanMoveTeamDriveItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMoveTeamDriveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanReadRevisions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanReadTeamDrive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canReadTeamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRemoveChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRemoveChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanTrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canTrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUntrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUntrash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

