package typingsSlinky.jqueryFileupload

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFileUploadChangeObject extends js.Object {
  var fileInput: js.UndefOr[JQuery] = js.native
  var fileInputClone: js.UndefOr[JQuery] = js.native
  var files: js.Array[File] = js.native
  var form: js.UndefOr[JQuery] = js.native
  var originalFiles: js.Array[File] = js.native
}

object JQueryFileUploadChangeObject {
  @scala.inline
  def apply(files: js.Array[File], originalFiles: js.Array[File]): JQueryFileUploadChangeObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalFiles = originalFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChangeObject]
  }
  @scala.inline
  implicit class JQueryFileUploadChangeObjectOps[Self <: JQueryFileUploadChangeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalFiles(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInput(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInputClone(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInputClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInputClone")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
  }
  
}

