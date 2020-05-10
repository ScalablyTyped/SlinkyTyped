package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.AnonExpand
import typingsSlinky.officeJsPreview.Excel.Interfaces.PageLayoutData
import typingsSlinky.officeJsPreview.Excel.Interfaces.PageLayoutLoadOptions
import typingsSlinky.officeJsPreview.Excel.Interfaces.PageLayoutUpdateData
import typingsSlinky.officeJsPreview.OfficeExtension.ClientObject
import typingsSlinky.officeJsPreview.OfficeExtension.UpdateOptions
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A3
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A4Small
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.A5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AsDisplayed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.B4
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.B5
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Blank
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Centimeters
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
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inches
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
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Points
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Portrait
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Quatro
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Statement
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Tabloid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents layout and print settings that are not dependent any printer-specific implementation. These settings include margins, orientation, page numbering, title rows, and print area.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PageLayout")
@js.native
class PageLayout () extends ClientObject {
  /**
    *
    * Gets or sets the worksheet's black and white print option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var blackAndWhite: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's bottom page margin to use for printing in points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's center horizontally flag. This flag determines whether the worksheet will be centered horizontally when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerHorizontally: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's center vertically flag. This flag determines whether the worksheet will be centered vertically when it's printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var centerVertically: Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageLayout: RequestContext = js.native
  /**
    *
    * Gets or sets the worksheet's draft mode option. If true the sheet will be printed without graphics.
    *
    * [Api set: ExcelApi 1.9]
    */
  var draftMode: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's first page number to print. Null value represents "auto" page numbering.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPageNumber: Double | _empty = js.native
  /**
    *
    * Gets or sets the worksheet's footer margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var footerMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's header margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var headerMargin: Double = js.native
  /**
    *
    * Header and footer configuration for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  val headersFooters: HeaderFooterGroup = js.native
  /**
    *
    * Gets or sets the worksheet's left margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's orientation of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: PageOrientation | Portrait | Landscape = js.native
  /**
    *
    * Gets or sets the worksheet's paper size of the page.
    *
    * [Api set: ExcelApi 1.9]
    */
  var paperSize: PaperType | Letter | LetterSmall | Tabloid | Ledger | Legal | Statement | Executive | A3 | A4 | A4Small | A5 | B4 | B5 | Folio | Quatro | Paper10x14 | Paper11x17 | Note | Envelope9 | Envelope10 | Envelope11 | Envelope12 | Envelope14 | Csheet | Dsheet | Esheet | EnvelopeDL | EnvelopeC5 | EnvelopeC3 | EnvelopeC4 | EnvelopeC6 | EnvelopeC65 | EnvelopeB4 | EnvelopeB5 | EnvelopeB6 | EnvelopeItaly | EnvelopeMonarch | EnvelopePersonal | FanfoldUS | FanfoldStdGerman | FanfoldLegalGerman = js.native
  /**
    *
    * Gets or sets whether the worksheet's comments should be displayed when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printComments: PrintComments | NoComments | EndSheet | InPlace = js.native
  /**
    *
    * Gets or sets the worksheet's print errors option.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printErrors: PrintErrorType | AsDisplayed | Blank | Dash | NotAvailable = js.native
  /**
    *
    * Gets or sets the worksheet's print gridlines flag. This flag determines whether gridlines will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printGridlines: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's print headings flag. This flag determines whether headings will be printed or not.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printHeadings: Boolean = js.native
  /**
    *
    * Gets or sets the worksheet's page print order option. This specifies the order to use for processing the page number printed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var printOrder: PrintOrder | DownThenOver | OverThenDown = js.native
  /**
    *
    * Gets or sets the worksheet's right margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's top margin, in points, for use when printing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: Double = js.native
  /**
    *
    * Gets or sets the worksheet's print zoom options.
    The `PageLayoutZoomOptions` object must be set as a JSON object (use `x.zoom = {...}` instead of `x.zoom.scale = ...`).
    *
    * [Api set: ExcelApi 1.9]
    */
  var zoom: PageLayoutZoomOptions = js.native
  /**
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, an ItemNotFound error will be thrown.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintArea(): RangeAreas = js.native
  /**
    * Gets the RangeAreas object, comprising one or more rectangular ranges, that represents the print area for the worksheet. If there is no print area, a null object will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintAreaOrNullObject(): RangeAreas = js.native
  /**
    * Gets the range object representing the title columns.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumns(): Range = js.native
  /**
    * Gets the range object representing the title columns. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleColumnsOrNullObject(): Range = js.native
  /**
    * Gets the range object representing the title rows.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRows(): Range = js.native
  /**
    * Gets the range object representing the title rows. If not set, this will return a null object.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getPrintTitleRowsOrNullObject(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageLayout = js.native
  def load(options: PageLayoutLoadOptions): PageLayout = js.native
  def load(propertyNamesAndPaths: AnonExpand): PageLayout = js.native
  def load(propertyNames: String): PageLayout = js.native
  def load(propertyNames: js.Array[String]): PageLayout = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PageLayout): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageLayoutUpdateData): Unit = js.native
  def set(properties: PageLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PageLayout): Unit = js.native
  def setPrintArea(printArea: String): Unit = js.native
  /**
    * Sets the worksheet's print area.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printArea The range, or RangeAreas of the content to print.
    */
  def setPrintArea(printArea: Range): Unit = js.native
  def setPrintArea(printArea: RangeAreas): Unit = js.native
  /**
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  def setPrintMargins(unit: PrintMarginUnit, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Centimeters(unit: Centimeters, marginOptions: PageLayoutMarginOptions): Unit = js.native
  @JSName("setPrintMargins")
  def setPrintMargins_Inches(unit: Inches, marginOptions: PageLayoutMarginOptions): Unit = js.native
  /**
    * Sets the worksheet's page margins with units.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param unit Measurement unit for the margins provided.
    * @param marginOptions Margin values to set, margins not provided will remain unchanged.
    */
  @JSName("setPrintMargins")
  def setPrintMargins_Points(unit: Points, marginOptions: PageLayoutMarginOptions): Unit = js.native
  def setPrintTitleColumns(printTitleColumns: String): Unit = js.native
  /**
    * Sets the columns that contain the cells to be repeated at the left of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleColumns The columns to be repeated to the left of each page, range must span the entire column to be valid.
    */
  def setPrintTitleColumns(printTitleColumns: Range): Unit = js.native
  def setPrintTitleRows(printTitleRows: String): Unit = js.native
  /**
    * Sets the rows that contain the cells to be repeated at the top of each page of the worksheet for printing.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param printTitleRows The rows to be repeated at the top of each page, range must span the entire row to be valid.
    */
  def setPrintTitleRows(printTitleRows: Range): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageLayoutData = js.native
}

