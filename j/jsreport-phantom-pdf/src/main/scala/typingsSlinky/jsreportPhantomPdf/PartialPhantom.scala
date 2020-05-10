package typingsSlinky.jsreportPhantomPdf

import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typingsSlinky.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import typingsSlinky.jsreportPhantomPdf.mod.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Phantom> */
@js.native
trait PartialPhantom extends js.Object {
  var blockJavaScript: js.UndefOr[Boolean] = js.native
  var customPhantomJS: js.UndefOr[Boolean] = js.native
  var fitToPage: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[String] = js.native
  var footerHeight: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var headerHeight: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String | Margin] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var phantomjsVersion: js.UndefOr[String] = js.native
  var resourceTimeout: js.UndefOr[Double] = js.native
  var waitForJS: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
}

object PartialPhantom {
  @scala.inline
  def apply(): PartialPhantom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPhantom]
  }
  @scala.inline
  implicit class PartialPhantomOps[Self <: PartialPhantom] (val x: Self) extends AnyVal {
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
    def withoutBlockJavaScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockJavaScript")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomPhantomJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPhantomJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomPhantomJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customPhantomJS")(js.undefined)
        ret
    }
    @scala.inline
    def withFitToPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
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
    def withFooterHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withHeader(value: String): Self = {
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
    def withHeaderHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
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
    def withMargin(value: String | Margin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
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
    def withPhantomjsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomjsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomjsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomjsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForJS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForJS")(js.undefined)
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
  }
  
}

