package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadOptions extends js.Object {
  var chunkedMode: js.UndefOr[Boolean] = js.native
  var fileKey: js.UndefOr[String] = js.native
  var fileName: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Any] = js.native
}

object FileUploadOptions {
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkedMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFileKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileKey")(js.undefined)
        ret
    }
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
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

