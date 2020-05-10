package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreviewFile extends js.Object {
  var previewFile: String = js.native
  var removeFile: String = js.native
  var uploadError: String = js.native
  var uploading: String = js.native
}

object AnonPreviewFile {
  @scala.inline
  def apply(previewFile: String, removeFile: String, uploadError: String, uploading: String): AnonPreviewFile = {
    val __obj = js.Dynamic.literal(previewFile = previewFile.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], uploadError = uploadError.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviewFile]
  }
  @scala.inline
  implicit class AnonPreviewFileOps[Self <: AnonPreviewFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

