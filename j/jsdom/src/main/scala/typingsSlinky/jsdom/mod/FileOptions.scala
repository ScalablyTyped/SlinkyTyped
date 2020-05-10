package typingsSlinky.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends BaseOptions {
  /**
  		 * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
  		 * Values that are not "text/html" or an XML mime type will throw. It will default to "application/xhtml+xml" if
  		 * the given filename ends in .xhtml or .xml; otherwise it will continue to default to "text/html".
  		 */
  var contentType: js.UndefOr[String] = js.native
  /**
  		 * url sets the value returned by window.location, document.URL, and document.documentURI,
  		 * and affects things like resolution of relative URLs within the document
  		 * and the same-origin restrictions and referrer used while fetching subresources.
  		 * It will default to a file URL corresponding to the given filename, instead of to "about:blank".
  		 */
  var url: js.UndefOr[String] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

