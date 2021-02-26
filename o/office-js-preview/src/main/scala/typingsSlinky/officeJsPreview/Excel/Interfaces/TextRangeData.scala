package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textRange.toJSON()`. */
@js.native
trait TextRangeData extends StObject {
  
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontData] = js.native
  
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.native
}
object TextRangeData {
  
  @scala.inline
  def apply(): TextRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeData]
  }
  
  @scala.inline
  implicit class TextRangeDataMutableBuilder[Self <: TextRangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: ShapeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
