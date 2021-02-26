package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.SheetVisibility
import typingsSlinky.officeJs.officeJsStrings.Hidden
import typingsSlinky.officeJs.officeJsStrings.VeryHidden
import typingsSlinky.officeJs.officeJsStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Worksheet object, for use in `worksheet.set({ ... })`. */
@js.native
trait WorksheetUpdateData extends StObject {
  
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
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutUpdateData] = js.native
  
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.native
  
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
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Double] = js.native
  
  /**
    *
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[String] = js.native
  
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.native
}
object WorksheetUpdateData {
  
  @scala.inline
  def apply(): WorksheetUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetUpdateDataMutableBuilder[Self <: WorksheetUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableCalculation(value: Boolean): Self = StObject.set(x, "enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCalculationUndefined: Self = StObject.set(x, "enableCalculation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageLayout(value: PageLayoutUpdateData): Self = StObject.set(x, "pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayoutUndefined: Self = StObject.set(x, "pageLayout", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = StObject.set(x, "showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridlinesUndefined: Self = StObject.set(x, "showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = StObject.set(x, "showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadingsUndefined: Self = StObject.set(x, "showHeadings", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Double): Self = StObject.set(x, "standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardWidthUndefined: Self = StObject.set(x, "standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: String): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    @scala.inline
    def setVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
