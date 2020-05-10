package typingsSlinky.cordovaPluginFileTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional parameters for download method. */
@js.native
trait FileDownloadOptions extends js.Object {
  /** A map of header name/header values. */
  var headers: js.UndefOr[js.Object] = js.native
}

object FileDownloadOptions {
  @scala.inline
  def apply(): FileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileDownloadOptions]
  }
  @scala.inline
  implicit class FileDownloadOptionsOps[Self <: FileDownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Object): Self = {
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
  }
  
}

