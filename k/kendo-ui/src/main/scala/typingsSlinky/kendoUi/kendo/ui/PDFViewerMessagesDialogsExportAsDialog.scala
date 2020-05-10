package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesDialogsExportAsDialog extends js.Object {
  var defaultFileName: js.UndefOr[String] = js.native
  var labels: js.UndefOr[PDFViewerMessagesDialogsExportAsDialogLabels] = js.native
  var pdf: js.UndefOr[String] = js.native
  var png: js.UndefOr[String] = js.native
  var svg: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PDFViewerMessagesDialogsExportAsDialog {
  @scala.inline
  def apply(): PDFViewerMessagesDialogsExportAsDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialog]
  }
  @scala.inline
  implicit class PDFViewerMessagesDialogsExportAsDialogOps[Self <: PDFViewerMessagesDialogsExportAsDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: PDFViewerMessagesDialogsExportAsDialogLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("png")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("png")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

