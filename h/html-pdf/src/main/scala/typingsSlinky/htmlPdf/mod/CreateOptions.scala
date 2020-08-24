package typingsSlinky.htmlPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlPdf.anon.Bottom
import typingsSlinky.htmlPdf.anon.Contents
import typingsSlinky.htmlPdf.anon.Detached
import typingsSlinky.htmlPdf.anon.Domain
import typingsSlinky.htmlPdf.anon.Height
import typingsSlinky.htmlPdf.htmlPdfStrings.A3
import typingsSlinky.htmlPdf.htmlPdfStrings.A4
import typingsSlinky.htmlPdf.htmlPdfStrings.A5
import typingsSlinky.htmlPdf.htmlPdfStrings.Legal
import typingsSlinky.htmlPdf.htmlPdfStrings.Letter
import typingsSlinky.htmlPdf.htmlPdfStrings.Tabloid
import typingsSlinky.htmlPdf.htmlPdfStrings.jpeg
import typingsSlinky.htmlPdf.htmlPdfStrings.landscape
import typingsSlinky.htmlPdf.htmlPdfStrings.manual
import typingsSlinky.htmlPdf.htmlPdfStrings.pdf
import typingsSlinky.htmlPdf.htmlPdfStrings.png
import typingsSlinky.htmlPdf.htmlPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends js.Object {
  // Rendering options
  var base: js.UndefOr[String] = js.native
  // Page options
  var border: js.UndefOr[String | Bottom] = js.native
  // To run Node application as Windows service
  var childProcessOptions: js.UndefOr[Detached] = js.native
  // Export options
  var directory: js.UndefOr[String] = js.native
  var footer: js.UndefOr[Height] = js.native
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
  var header: js.UndefOr[Contents] = js.native
  // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
  var height: js.UndefOr[String] = js.native
  // HTTP Cookies that are used for requests
  var httpCookies: js.UndefOr[js.Array[Domain]] = js.native
  // HTTP Headers that are used for requests
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var paginationOffset: js.UndefOr[Double] = js.native
  var phantomArgs: js.UndefOr[js.Array[String]] = js.native
  // Script options
  var phantomPath: js.UndefOr[String] = js.native
  var quality: js.UndefOr[String] = js.native
  // Time we should wait after window load
  var renderDelay: js.UndefOr[manual | Double] = js.native
  var script: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  // File options
  var `type`: js.UndefOr[png | jpeg | pdf] = js.native
  var width: js.UndefOr[String] = js.native
  // Zooming option, can be used to scale images if `options.type` is not pdf
  var zoomFactor: js.UndefOr[String] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBorder(value: String | Bottom): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setChildProcessOptions(value: Detached): Self = this.set("childProcessOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildProcessOptions: Self = this.set("childProcessOptions", js.undefined)
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setFooter(value: Height): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeader(value: Contents): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHttpCookiesVarargs(value: Domain*): Self = this.set("httpCookies", js.Array(value :_*))
    @scala.inline
    def setHttpCookies(value: js.Array[Domain]): Self = this.set("httpCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpCookies: Self = this.set("httpCookies", js.undefined)
    @scala.inline
    def setHttpHeaders(value: StringDictionary[String]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPaginationOffset(value: Double): Self = this.set("paginationOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationOffset: Self = this.set("paginationOffset", js.undefined)
    @scala.inline
    def setPhantomArgsVarargs(value: String*): Self = this.set("phantomArgs", js.Array(value :_*))
    @scala.inline
    def setPhantomArgs(value: js.Array[String]): Self = this.set("phantomArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantomArgs: Self = this.set("phantomArgs", js.undefined)
    @scala.inline
    def setPhantomPath(value: String): Self = this.set("phantomPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantomPath: Self = this.set("phantomPath", js.undefined)
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRenderDelay(value: manual | Double): Self = this.set("renderDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderDelay: Self = this.set("renderDelay", js.undefined)
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: png | jpeg | pdf): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoomFactor(value: String): Self = this.set("zoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFactor: Self = this.set("zoomFactor", js.undefined)
  }
  
}

