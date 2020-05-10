package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessages extends js.Object {
  var defaultFileName: js.UndefOr[String] = js.native
  var dialogs: js.UndefOr[PDFViewerMessagesDialogs] = js.native
  var errorMessages: js.UndefOr[PDFViewerMessagesErrorMessages] = js.native
  var toolbar: js.UndefOr[PDFViewerMessagesToolbar] = js.native
}

object PDFViewerMessages {
  @scala.inline
  def apply(): PDFViewerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessages]
  }
  @scala.inline
  implicit class PDFViewerMessagesOps[Self <: PDFViewerMessages] (val x: Self) extends AnyVal {
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
    def withDialogs(value: PDFViewerMessagesDialogs): Self = {
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
    def withErrorMessages(value: PDFViewerMessagesErrorMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: PDFViewerMessagesToolbar): Self = {
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
  }
  
}

