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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageLayout object, for use in `pageLayout.set({ ... })`. */
@js.native
trait PageLayoutUpdateData extends StObject {
  
  /**
    *
    * The worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * The worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: js.UndefOr[Double | _empty] = js.native
  
  /**
    *
    * The worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * The worksheet's header margin, in points, for use when printing.
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
  var headersFooters: js.UndefOr[HeaderFooterGroupUpdateData] = js.native
  
  /**
    *
    * The worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * The worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[PageOrientation | Portrait | Landscape] = js.native
  
  /**
    *
    * The worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: js.UndefOr[
    PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
  ] = js.native
  
  /**
    *
    * Specifies if the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: js.UndefOr[PrintComments | NoComments | EndSheet | InPlace] = js.native
  
  /**
    *
    * The worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: js.UndefOr[PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable] = js.native
  
  /**
    *
    * Specifies if the worksheet's gridlines will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the worksheet's headings will be printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: js.UndefOr[PrintOrder | DownThenOver | OverThenDown] = js.native
  
  /**
    *
    * The worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * The worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * The worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: js.UndefOr[PageLayoutZoomOptions] = js.native
}
object PageLayoutUpdateData {
  
  @scala.inline
  def apply(): PageLayoutUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutUpdateData]
  }
  
  @scala.inline
  implicit class PageLayoutUpdateDataMutableBuilder[Self <: PageLayoutUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackAndWhite(value: Boolean): Self = StObject.set(x, "blackAndWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackAndWhiteUndefined: Self = StObject.set(x, "blackAndWhite", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
    
    @scala.inline
    def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
    
    @scala.inline
    def setDraftMode(value: Boolean): Self = StObject.set(x, "draftMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftModeUndefined: Self = StObject.set(x, "draftMode", js.undefined)
    
    @scala.inline
    def setFirstPageNumber(value: Double | _empty): Self = StObject.set(x, "firstPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageNumberUndefined: Self = StObject.set(x, "firstPageNumber", js.undefined)
    
    @scala.inline
    def setFooterMargin(value: Double): Self = StObject.set(x, "footerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterMarginUndefined: Self = StObject.set(x, "footerMargin", js.undefined)
    
    @scala.inline
    def setHeaderMargin(value: Double): Self = StObject.set(x, "headerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderMarginUndefined: Self = StObject.set(x, "headerMargin", js.undefined)
    
    @scala.inline
    def setHeadersFooters(value: HeaderFooterGroupUpdateData): Self = StObject.set(x, "headersFooters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersFootersUndefined: Self = StObject.set(x, "headersFooters", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setOrientation(value: PageOrientation | Portrait | Landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPaperSize(
      value: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman
    ): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    @scala.inline
    def setPrintComments(value: PrintComments | NoComments | EndSheet | InPlace): Self = StObject.set(x, "printComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintCommentsUndefined: Self = StObject.set(x, "printComments", js.undefined)
    
    @scala.inline
    def setPrintErrors(value: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable): Self = StObject.set(x, "printErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintErrorsUndefined: Self = StObject.set(x, "printErrors", js.undefined)
    
    @scala.inline
    def setPrintGridlines(value: Boolean): Self = StObject.set(x, "printGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintGridlinesUndefined: Self = StObject.set(x, "printGridlines", js.undefined)
    
    @scala.inline
    def setPrintHeadings(value: Boolean): Self = StObject.set(x, "printHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintHeadingsUndefined: Self = StObject.set(x, "printHeadings", js.undefined)
    
    @scala.inline
    def setPrintOrder(value: PrintOrder | DownThenOver | OverThenDown): Self = StObject.set(x, "printOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintOrderUndefined: Self = StObject.set(x, "printOrder", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setZoom(value: PageLayoutZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
