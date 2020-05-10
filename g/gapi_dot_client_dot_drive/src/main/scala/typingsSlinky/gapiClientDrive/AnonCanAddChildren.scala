package typingsSlinky.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanAddChildren extends js.Object {
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can change whether viewers can copy the contents of this file. */
  var canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.native
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current user can copy this file. For a Team Drive item, whether the current user can copy non-folder descendants of this item, or this item
    * itself if it is not a folder.
    */
  var canCopy: js.UndefOr[Boolean] = js.native
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[Boolean] = js.native
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[Boolean] = js.native
  /** Whether the current user can edit this file. */
  var canEdit: js.UndefOr[Boolean] = js.native
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can move this item into a Team Drive. If the item is in a Team Drive, this field is equivalent to canMoveTeamDriveItem. */
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current user can move this Team Drive item by changing its parent. Note that a request to change the parent for this item may still fail
    * depending on the new parent that is being added. Only populated for Team Drive files.
    */
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.native
  /**
    * Whether the current user can read the revisions resource of this file. For a Team Drive item, whether revisions of non-folder descendants of this item,
    * or this item itself if it is not a folder, can be read.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  /** Whether the current user can read the Team Drive to which this file belongs. Only populated for Team Drive files. */
  var canReadTeamDrive: js.UndefOr[Boolean] = js.native
  /** Whether the current user can remove children from this folder. This is always false when the item is not a folder. */
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[Boolean] = js.native
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[Boolean] = js.native
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[Boolean] = js.native
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[Boolean] = js.native
}

object AnonCanAddChildren {
  @scala.inline
  def apply(): AnonCanAddChildren = {
    val __obj = js.Dynamic.literal()
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
    def withoutCanAddChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canAddChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withCanChangeViewersCanCopyContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeViewersCanCopyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanChangeViewersCanCopyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canChangeViewersCanCopyContent")(js.undefined)
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

