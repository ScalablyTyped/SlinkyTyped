package typingsSlinky.htmlPdf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.htmlPdf.AnonBottom
import typingsSlinky.htmlPdf.AnonContents
import typingsSlinky.htmlPdf.AnonDetached
import typingsSlinky.htmlPdf.AnonDomain
import typingsSlinky.htmlPdf.AnonHeight
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
  var border: js.UndefOr[String | AnonBottom] = js.native
  // To run Node application as Windows service
  var childProcessOptions: js.UndefOr[AnonDetached] = js.native
  // Export options
  var directory: js.UndefOr[String] = js.native
  var footer: js.UndefOr[AnonHeight] = js.native
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
  var header: js.UndefOr[AnonContents] = js.native
  // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
  var height: js.UndefOr[String] = js.native
  // HTTP Cookies that are used for requests
  var httpCookies: js.UndefOr[js.Array[AnonDomain]] = js.native
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
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: String | AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withChildProcessOptions(value: AnonDetached): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcessOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildProcessOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcessOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: AnonContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpCookies(value: js.Array[AnonDomain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantomArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantomPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDelay(value: manual | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: png | jpeg | pdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

