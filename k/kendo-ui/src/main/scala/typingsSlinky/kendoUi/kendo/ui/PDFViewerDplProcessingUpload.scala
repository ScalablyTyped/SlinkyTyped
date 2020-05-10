package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerDplProcessingUpload extends js.Object {
  var saveField: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object PDFViewerDplProcessingUpload {
  @scala.inline
  def apply(): PDFViewerDplProcessingUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingUpload]
  }
  @scala.inline
  implicit class PDFViewerDplProcessingUploadOps[Self <: PDFViewerDplProcessingUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveField")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

