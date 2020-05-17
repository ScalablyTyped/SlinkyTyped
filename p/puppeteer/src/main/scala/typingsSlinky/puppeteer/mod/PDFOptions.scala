package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFOptions extends js.Object {
  /**
    * Display header and footer.
    * @default false
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * HTML template for the print footer. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /**
    * Paper format. If set, takes priority over width or height options.
    * @default 'Letter'
    */
  var format: js.UndefOr[PDFFormat] = js.native
  /**
    * HTML template for the print header. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Paper height. */
  var height: js.UndefOr[LayoutDimension] = js.native
  /**
    * Paper orientation.
    * @default false
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /** Paper margins, defaults to none. */
  var margin: js.UndefOr[Bottom] = js.native
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'.
    * @default '' which means print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.native
  /**
    * The file path to save the PDF to.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the PDF won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Give any CSS @page size declared in the page priority over what is declared in width and
    * height or format options.
    * @default false which will scale the content to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.native
  /**
    * Print background graphics.
    * @default false
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * Scale of the webpage rendering.
    * @default 1
    */
  var scale: js.UndefOr[Double] = js.native
  /** Paper width. */
  var width: js.UndefOr[LayoutDimension] = js.native
}

object PDFOptions {
  @scala.inline
  def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  @scala.inline
  implicit class PDFOptionsOps[Self <: PDFOptions] (val x: Self) extends AnyVal {
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
    def withoutDisplayHeaderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayHeaderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: PDFFormat): Self = {
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
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: LayoutDimension): Self = {
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
    def withLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Bottom): Self = {
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
    def withPageRanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferCSSPageSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCSSPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferCSSPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferCSSPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: LayoutDimension): Self = {
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

