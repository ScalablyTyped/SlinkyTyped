package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessages extends js.Object {
  var dialogs: js.UndefOr[FileManagerMessagesDialogs] = js.native
  var previewPane: js.UndefOr[FileManagerMessagesPreviewPane] = js.native
  var toolbar: js.UndefOr[FileManagerMessagesToolbar] = js.native
  var views: js.UndefOr[FileManagerMessagesViews] = js.native
}

object FileManagerMessages {
  @scala.inline
  def apply(): FileManagerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessages]
  }
  @scala.inline
  implicit class FileManagerMessagesOps[Self <: FileManagerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogs(value: FileManagerMessagesDialogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogs")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewPane(value: FileManagerMessagesPreviewPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewPane")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: FileManagerMessagesToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: FileManagerMessagesViews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

