package typingsSlinky.jsreportChromePdf.mod

import typingsSlinky.jsreportChromePdf.AnonBottom
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.print
import typingsSlinky.jsreportChromePdf.jsreportChromePdfStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/chrome-pdf
// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
@js.native
trait Chrome extends js.Object {
  var displayHeaderFooter: Boolean = js.native
  var footerTemplate: String = js.native
  	// 1-5, 8, 11-13
  var format: String = js.native
  // https://github.com/jsreport/jsreport-chrome-pdf/blob/master/test/chromeTest.js
  var header: String = js.native
  var headerTemplate: String = js.native
  var height: String | Double = js.native
  var landscape: Boolean = js.native
  var margin: AnonBottom = js.native
  var marginBottom: String | Double = js.native
  var marginLeft: String | Double = js.native
  var marginRight: String | Double = js.native
  // https://jsreport.net/learn/chrome-pdf
  var marginTop: String | Double = js.native
  var mediaType: screen | print = js.native
  var pageNumber: Double = js.native
  var pageRanges: String = js.native
  var path: String = js.native
  var preferCSSPageSize: Boolean = js.native
  var printBackground: Boolean = js.native
  var scale: Double = js.native
  var totalPages: Double = js.native
  var url: String = js.native
  var waitForJS: Boolean = js.native
  var waitForNetworkIddle: Boolean = js.native
  var width: String | Double = js.native
}

object Chrome {
  @scala.inline
  def apply(
    displayHeaderFooter: Boolean,
    footerTemplate: String,
    format: String,
    header: String,
    headerTemplate: String,
    height: String | Double,
    landscape: Boolean,
    margin: AnonBottom,
    marginBottom: String | Double,
    marginLeft: String | Double,
    marginRight: String | Double,
    marginTop: String | Double,
    mediaType: screen | print,
    pageNumber: Double,
    pageRanges: String,
    path: String,
    preferCSSPageSize: Boolean,
    printBackground: Boolean,
    scale: Double,
    totalPages: Double,
    url: String,
    waitForJS: Boolean,
    waitForNetworkIddle: Boolean,
    width: String | Double
  ): Chrome = {
    val __obj = js.Dynamic.literal(displayHeaderFooter = displayHeaderFooter.asInstanceOf[js.Any], footerTemplate = footerTemplate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageRanges = pageRanges.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], preferCSSPageSize = preferCSSPageSize.asInstanceOf[js.Any], printBackground = printBackground.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], waitForNetworkIddle = waitForNetworkIddle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chrome]
  }
  @scala.inline
  implicit class ChromeOps[Self <: Chrome] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayHeaderFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBottom(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: screen | print): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageRanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferCSSPageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCSSPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForNetworkIddle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForNetworkIddle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

