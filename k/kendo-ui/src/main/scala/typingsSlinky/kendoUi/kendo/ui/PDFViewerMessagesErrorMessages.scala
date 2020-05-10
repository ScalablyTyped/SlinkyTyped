package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesErrorMessages extends js.Object {
  var notFound: js.UndefOr[String] = js.native
  var notSupported: js.UndefOr[String] = js.native
  var parseError: js.UndefOr[String] = js.native
}

object PDFViewerMessagesErrorMessages {
  @scala.inline
  def apply(): PDFViewerMessagesErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesErrorMessages]
  }
  @scala.inline
  implicit class PDFViewerMessagesErrorMessagesOps[Self <: PDFViewerMessagesErrorMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.undefined)
        ret
    }
    @scala.inline
    def withNotSupported(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withParseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(js.undefined)
        ret
    }
  }
  
}

