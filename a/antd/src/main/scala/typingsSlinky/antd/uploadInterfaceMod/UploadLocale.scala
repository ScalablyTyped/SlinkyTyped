package typingsSlinky.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLocale extends js.Object {
  var downloadFile: js.UndefOr[String] = js.native
  var previewFile: js.UndefOr[String] = js.native
  var removeFile: js.UndefOr[String] = js.native
  var uploadError: js.UndefOr[String] = js.native
  var uploading: js.UndefOr[String] = js.native
}

object UploadLocale {
  @scala.inline
  def apply(): UploadLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLocale]
  }
  @scala.inline
  implicit class UploadLocaleOps[Self <: UploadLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadError")(js.undefined)
        ret
    }
    @scala.inline
    def withUploading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploading")(js.undefined)
        ret
    }
  }
  
}

