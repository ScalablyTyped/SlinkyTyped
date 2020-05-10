package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerDialogs extends js.Object {
  var deleteConfirm: js.UndefOr[js.Any] = js.native
  var moveConfirm: js.UndefOr[js.Any] = js.native
  var renamePrompt: js.UndefOr[js.Any] = js.native
  var upload: js.UndefOr[js.Any] = js.native
}

object FileManagerDialogs {
  @scala.inline
  def apply(): FileManagerDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerDialogs]
  }
  @scala.inline
  implicit class FileManagerDialogsOps[Self <: FileManagerDialogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteConfirm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveConfirm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withRenamePrompt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamePrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenamePrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamePrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

