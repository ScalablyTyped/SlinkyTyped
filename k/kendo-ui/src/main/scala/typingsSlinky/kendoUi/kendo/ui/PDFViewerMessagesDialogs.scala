package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesDialogs extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var exportAsDialog: js.UndefOr[PDFViewerMessagesDialogsExportAsDialog] = js.native
  var okText: js.UndefOr[String] = js.native
  var save: js.UndefOr[String] = js.native
}

object PDFViewerMessagesDialogs {
  @scala.inline
  def apply(): PDFViewerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogs]
  }
  @scala.inline
  implicit class PDFViewerMessagesDialogsOps[Self <: PDFViewerMessagesDialogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAsDialog(value: PDFViewerMessagesDialogsExportAsDialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAsDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAsDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAsDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withOkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
  }
  
}

