package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditFlags extends js.Object {
  /**
    * Whether the renderer believes it can copy
    */
  var canCopy: Boolean = js.native
  /**
    * Whether the renderer believes it can cut.
    */
  var canCut: Boolean = js.native
  /**
    * Whether the renderer believes it can delete.
    */
  var canDelete: Boolean = js.native
  /**
    * Whether the renderer believes it can paste.
    */
  var canPaste: Boolean = js.native
  /**
    * Whether the renderer believes it can redo.
    */
  var canRedo: Boolean = js.native
  /**
    * Whether the renderer believes it can select all.
    */
  var canSelectAll: Boolean = js.native
  /**
    * Whether the renderer believes it can undo.
    */
  var canUndo: Boolean = js.native
}

object EditFlags {
  @scala.inline
  def apply(
    canCopy: Boolean,
    canCut: Boolean,
    canDelete: Boolean,
    canPaste: Boolean,
    canRedo: Boolean,
    canSelectAll: Boolean,
    canUndo: Boolean
  ): EditFlags = {
    val __obj = js.Dynamic.literal(canCopy = canCopy.asInstanceOf[js.Any], canCut = canCut.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canPaste = canPaste.asInstanceOf[js.Any], canRedo = canRedo.asInstanceOf[js.Any], canSelectAll = canSelectAll.asInstanceOf[js.Any], canUndo = canUndo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditFlags]
  }
  @scala.inline
  implicit class EditFlagsOps[Self <: EditFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanCut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUndo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUndo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

