package typingsSlinky.chrome.chrome.documentScan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScanCallbackArg extends js.Object {
  /** The data image URLs in a form that can be passed as the "src" value to an image tag. */
  var dataUrls: js.Array[String] = js.native
  /** The MIME type of dataUrls. */
  var mimeType: String = js.native
}

object DocumentScanCallbackArg {
  @scala.inline
  def apply(dataUrls: js.Array[String], mimeType: String): DocumentScanCallbackArg = {
    val __obj = js.Dynamic.literal(dataUrls = dataUrls.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentScanCallbackArg]
  }
  @scala.inline
  implicit class DocumentScanCallbackArgOps[Self <: DocumentScanCallbackArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

