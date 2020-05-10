package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesDialogsExportAsDialogLabels extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var saveAsType: js.UndefOr[String] = js.native
}

object PDFViewerMessagesDialogsExportAsDialogLabels {
  @scala.inline
  def apply(): PDFViewerMessagesDialogsExportAsDialogLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialogLabels]
  }
  @scala.inline
  implicit class PDFViewerMessagesDialogsExportAsDialogLabelsOps[Self <: PDFViewerMessagesDialogsExportAsDialogLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsType")(js.undefined)
        ret
    }
  }
  
}

