package typingsSlinky.chromeApps.chrome.documentScan

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScanOptions extends js.Object {
  /** The number of scanned images allowed (defaults to 1).  */
  var maxImages: js.UndefOr[integer] = js.native
  /** The MIME types that are accepted by the caller.  */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
}

object DocumentScanOptions {
  @scala.inline
  def apply(): DocumentScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentScanOptions]
  }
  @scala.inline
  implicit class DocumentScanOptionsOps[Self <: DocumentScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxImages(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImages")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(js.undefined)
        ret
    }
  }
  
}

