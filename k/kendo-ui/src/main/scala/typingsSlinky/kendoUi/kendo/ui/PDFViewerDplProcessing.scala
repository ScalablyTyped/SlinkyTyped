package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerDplProcessing extends js.Object {
  var download: js.UndefOr[PDFViewerDplProcessingDownload] = js.native
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[PDFViewerDplProcessingRead] = js.native
  var upload: js.UndefOr[PDFViewerDplProcessingUpload] = js.native
}

object PDFViewerDplProcessing {
  @scala.inline
  def apply(): PDFViewerDplProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessing]
  }
  @scala.inline
  implicit class PDFViewerDplProcessingOps[Self <: PDFViewerDplProcessing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: PDFViewerDplProcessingDownload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: PDFViewerDplProcessingRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: PDFViewerDplProcessingUpload): Self = {
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

