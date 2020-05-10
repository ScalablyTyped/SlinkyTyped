package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.PageLayoutZoomOptions
import typingsSlinky.officeJsPreview.Excel.PageOrientation
import typingsSlinky.officeJsPreview.Excel.PaperType
import typingsSlinky.officeJsPreview.Excel.PrintComments
import typingsSlinky.officeJsPreview.Excel.PrintErrorType
import typingsSlinky.officeJsPreview.Excel.PrintOrder
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A4Small
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AsDisplayed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.B4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.B5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Blank
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Csheet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DownThenOver
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dsheet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EndSheet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Envelope10
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Envelope11
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Envelope12
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Envelope14
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Envelope9
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeB4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeB5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeB6
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeC3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeC4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeC5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeC6
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeC65
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeDL
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeItaly
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopeMonarch
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EnvelopePersonal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Esheet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Executive
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FanfoldLegalGerman
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FanfoldStdGerman
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FanfoldUS
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Folio
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InPlace
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Landscape
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Ledger
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Legal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Letter
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LetterSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NoComments
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.NotAvailable
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Note
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OverThenDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Paper10x14
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Paper11x17
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Portrait
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Quatro
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Statement
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tabloid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pageLayout.toJSON()`. */
@js.native
trait PageLayoutData extends js.Object {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.native
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupData] = js.native
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.native
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.native
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.native
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.native
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.native
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.native
}

object PageLayoutData {
  @scala.inline
  def apply(): PageLayoutData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutData]
  }
  @scala.inline
  implicit class PageLayoutDataOps[Self <: PageLayoutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlackAndWhite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackAndWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackAndWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackAndWhite")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterHorizontally(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterHorizontally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerHorizontally")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterVertically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withDraftMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraftMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageNumber(value: Double | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersFooters(value: HeaderFooterGroupData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersFooters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersFooters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersFooters")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: PageOrientation | Portrait | Landscape): Self = {
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
    def withPaperSize(
      value: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintComments(value: PrintComments | NoComments | EndSheet | InPlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printComments")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintErrors(value: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printHeadings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintOrder(value: PrintOrder | DownThenOver | OverThenDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: PageLayoutZoomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

