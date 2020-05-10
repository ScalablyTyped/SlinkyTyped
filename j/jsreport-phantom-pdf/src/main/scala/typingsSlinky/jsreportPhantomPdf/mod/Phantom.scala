package typingsSlinky.jsreportPhantomPdf.mod

import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phantom extends js.Object {
  var blockJavaScript: Boolean = js.native
  var customPhantomJS: Boolean = js.native
  var fitToPage: Boolean = js.native
  var footer: String = js.native
  var footerHeight: String = js.native
  var format: String = js.native
  var header: String = js.native
  var headerHeight: String = js.native
  var height: String = js.native
  var margin: String | Margin = js.native
  var orientation: portrait | landscape = js.native
  var phantomjsVersion: String = js.native
  var resourceTimeout: Double = js.native
  var waitForJS: Boolean = js.native
  var width: String = js.native
}

object Phantom {
  @scala.inline
  def apply(
    blockJavaScript: Boolean,
    customPhantomJS: Boolean,
    fitToPage: Boolean,
    footer: String,
    footerHeight: String,
    format: String,
    header: String,
    headerHeight: String,
    height: String,
    margin: String | Margin,
    orientation: portrait | landscape,
    phantomjsVersion: String,
    resourceTimeout: Double,
    waitForJS: Boolean,
    width: String
  ): Phantom = {
    val __obj = js.Dynamic.literal(blockJavaScript = blockJavaScript.asInstanceOf[js.Any], customPhantomJS = customPhantomJS.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], phantomjsVersion = phantomjsVersion.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phantom]
  }
  @scala.inline
  implicit class PhantomOps[Self <: Phantom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockJavaScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockJavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomPhantomJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPhantomJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(value.asInstanceOf[js.Any])
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
    def withHeaderHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: String | Margin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhantomjsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomjsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

