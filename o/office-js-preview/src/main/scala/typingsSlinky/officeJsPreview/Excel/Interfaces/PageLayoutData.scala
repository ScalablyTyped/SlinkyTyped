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
trait PageLayoutData extends js.Object {
  /**
    *
    * The worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.undefined
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headersFooters: js.UndefOr[HeaderFooterGroupData] = js.undefined
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.undefined
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.undefined
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.undefined
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.undefined
  /**
    *
    * Specifies if the worksheet's gridlines will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the worksheet's headings will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.undefined
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.undefined
}

object PageLayoutData {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[Boolean] = js.undefined,
    bottomMargin: js.UndefOr[Double] = js.undefined,
    centerHorizontally: js.UndefOr[Boolean] = js.undefined,
    centerVertically: js.UndefOr[Boolean] = js.undefined,
    draftMode: js.UndefOr[Boolean] = js.undefined,
    firstPageNumber: Double | _empty = null,
    footerMargin: js.UndefOr[Double] = js.undefined,
    headerMargin: js.UndefOr[Double] = js.undefined,
    headersFooters: HeaderFooterGroupData = null,
    leftMargin: js.UndefOr[Double] = js.undefined,
    orientation: PageOrientation | Portrait | Landscape = null,
    paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = null,
    printComments: PrintComments | NoComments | EndSheet | InPlace = null,
    printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = null,
    printGridlines: js.UndefOr[Boolean] = js.undefined,
    printHeadings: js.UndefOr[Boolean] = js.undefined,
    printOrder: PrintOrder | DownThenOver | OverThenDown = null,
    rightMargin: js.UndefOr[Double] = js.undefined,
    topMargin: js.UndefOr[Double] = js.undefined,
    zoom: PageLayoutZoomOptions = null
  ): PageLayoutData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerHorizontally)) __obj.updateDynamic("centerHorizontally")(centerHorizontally.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerVertically)) __obj.updateDynamic("centerVertically")(centerVertically.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draftMode)) __obj.updateDynamic("draftMode")(draftMode.get.asInstanceOf[js.Any])
    if (firstPageNumber != null) __obj.updateDynamic("firstPageNumber")(firstPageNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(footerMargin)) __obj.updateDynamic("footerMargin")(footerMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerMargin)) __obj.updateDynamic("headerMargin")(headerMargin.get.asInstanceOf[js.Any])
    if (headersFooters != null) __obj.updateDynamic("headersFooters")(headersFooters.asInstanceOf[js.Any])
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (printComments != null) __obj.updateDynamic("printComments")(printComments.asInstanceOf[js.Any])
    if (printErrors != null) __obj.updateDynamic("printErrors")(printErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(printGridlines)) __obj.updateDynamic("printGridlines")(printGridlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(printHeadings)) __obj.updateDynamic("printHeadings")(printHeadings.get.asInstanceOf[js.Any])
    if (printOrder != null) __obj.updateDynamic("printOrder")(printOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin.get.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutData]
  }
}

