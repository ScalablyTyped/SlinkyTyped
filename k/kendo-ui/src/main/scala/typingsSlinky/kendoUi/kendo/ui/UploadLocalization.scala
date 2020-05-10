package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLocalization extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var clearSelectedFiles: js.UndefOr[String] = js.native
  var dropFilesHere: js.UndefOr[String] = js.native
  var headerStatusUploaded: js.UndefOr[String] = js.native
  var headerStatusUploading: js.UndefOr[String] = js.native
  var invalidFileExtension: js.UndefOr[String] = js.native
  var invalidFiles: js.UndefOr[String] = js.native
  var invalidMaxFileSize: js.UndefOr[String] = js.native
  var invalidMinFileSize: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var retry: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var statusFailed: js.UndefOr[String] = js.native
  var statusUploaded: js.UndefOr[String] = js.native
  var statusUploading: js.UndefOr[String] = js.native
  var uploadSelectedFiles: js.UndefOr[String] = js.native
}

object UploadLocalization {
  @scala.inline
  def apply(): UploadLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLocalization]
  }
  @scala.inline
  implicit class UploadLocalizationOps[Self <: UploadLocalization] (val x: Self) extends AnyVal {
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
    def withClearSelectedFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelectedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearSelectedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelectedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withDropFilesHere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropFilesHere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropFilesHere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropFilesHere")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStatusUploaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStatusUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStatusUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStatusUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStatusUploading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStatusUploading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStatusUploading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStatusUploading")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMaxFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMaxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMaxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMinFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMinFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMinFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMinFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusFailed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusUploaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusUploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusUploading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusUploading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusUploading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusUploading")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSelectedFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSelectedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSelectedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSelectedFiles")(js.undefined)
        ret
    }
  }
  
}

