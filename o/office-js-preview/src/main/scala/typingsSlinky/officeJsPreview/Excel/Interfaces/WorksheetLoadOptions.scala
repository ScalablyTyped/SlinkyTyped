package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * An Excel worksheet is a grid of cells. It can contain data, tables, charts, etc.
  To learn more about the worksheet object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-worksheets | Work with worksheets using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait WorksheetLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.native
  
  /**
    *
    * Returns a collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[ChartCollectionLoadOptions] = js.native
  
  /**
    *
    * Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutLoadOptions] = js.native
  
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionLoadOptions] = js.native
  
  /**
    *
    * Specifies if gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.native
  
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[Boolean] = js.native
}
object WorksheetLoadOptions {
  
  @scala.inline
  def apply(): WorksheetLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetLoadOptions]
  }
  
  @scala.inline
  implicit class WorksheetLoadOptionsOps[Self <: WorksheetLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setAutoFilter(value: AutoFilterLoadOptions): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    
    @scala.inline
    def setCharts(value: ChartCollectionLoadOptions): Self = this.set("charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharts: Self = this.set("charts", js.undefined)
    
    @scala.inline
    def setEnableCalculation(value: Boolean): Self = this.set("enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculation: Self = this.set("enableCalculation", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageLayout(value: PageLayoutLoadOptions): Self = this.set("pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLayout: Self = this.set("pageLayout", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setProtection(value: WorksheetProtectionLoadOptions): Self = this.set("protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = this.set("showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridlines: Self = this.set("showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = this.set("showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeadings: Self = this.set("showHeadings", js.undefined)
    
    @scala.inline
    def setStandardHeight(value: Boolean): Self = this.set("standardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardHeight: Self = this.set("standardHeight", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Boolean): Self = this.set("standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardWidth: Self = this.set("standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: Boolean): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    
    @scala.inline
    def setTables(value: TableCollectionLoadOptions): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
