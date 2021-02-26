package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAxisTitleFormat.toJSON()`. */
@js.native
trait ChartAxisTitleFormatData extends StObject {
  
  /**
    *
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.native
  
  /**
    *
    * Specifies the chart axis title's font attributes, such as font name, font size, color, etc. of chart axis title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.native
}
object ChartAxisTitleFormatData {
  
  @scala.inline
  def apply(): ChartAxisTitleFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisTitleFormatData]
  }
  
  @scala.inline
  implicit class ChartAxisTitleFormatDataMutableBuilder[Self <: ChartAxisTitleFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
