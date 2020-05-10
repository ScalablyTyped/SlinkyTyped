package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileOptions extends js.Object {
  // deprecated
  var begin: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.native
  // Default is 'POST', supports 'POST' and 'PUT'
  var beginCallback: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.native
  // URL to upload file to
  var binaryStreamOnly: js.UndefOr[Boolean] = js.native
  // An object of headers to be passed to the server
  var fields: js.UndefOr[Fields] = js.native
  // Allow for binary data stream for file to be uploaded without extra headers, Default is 'false'
  var files: js.Array[UploadFileItem] = js.native
  // An array of objects with the file information to be uploaded.
  var headers: js.UndefOr[Headers] = js.native
  // An object of fields to be passed to the server
  var method: js.UndefOr[String] = js.native
  var progress: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.native
  // deprecated
  var progressCallback: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.native
  var toUrl: String = js.native
}

object UploadFileOptions {
  @scala.inline
  def apply(files: js.Array[UploadFileItem], toUrl: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], toUrl = toUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  @scala.inline
  implicit class UploadFileOptionsOps[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[UploadFileItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin(value: /* res */ UploadBeginCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginCallback(value: /* res */ UploadBeginCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withBinaryStreamOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryStreamOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryStreamOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryStreamOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: /* res */ UploadProgressCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCallback(value: /* res */ UploadProgressCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgressCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCallback")(js.undefined)
        ret
    }
  }
  
}

