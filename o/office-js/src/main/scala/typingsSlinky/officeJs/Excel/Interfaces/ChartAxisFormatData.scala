package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAxisFormat.toJSON()`. */
@js.native
trait ChartAxisFormatData extends StObject {
  
  /**
    *
    * Specifies the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.native
  
  /**
    *
    * Specifies chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}
object ChartAxisFormatData {
  
  @scala.inline
  def apply(): ChartAxisFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisFormatData]
  }
  
  @scala.inline
  implicit class ChartAxisFormatDataMutableBuilder[Self <: ChartAxisFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
