package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ConditionalRangeBorderLineStyle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalRangeBorder object, for use in `conditionalRangeBorder.set({ ... })`. */
@js.native
trait ConditionalRangeBorderUpdateData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.native
}
object ConditionalRangeBorderUpdateData {
  
  @scala.inline
  def apply(): ConditionalRangeBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalRangeBorderUpdateDataMutableBuilder[Self <: ConditionalRangeBorderUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
