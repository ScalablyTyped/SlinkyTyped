package typingsSlinky.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxisTitle object, for use in `chartAxisTitle.set({ ... })`. */
@js.native
trait ChartAxisTitleUpdateData extends StObject {
  
  /**
    *
    * Specifies the formatting of chart axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatUpdateData] = js.native
  
  /**
    *
    * Specifies the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies the angle to which the text is oriented for the chart axis title. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.12]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the axis title is visibile.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartAxisTitleUpdateData {
  
  @scala.inline
  def apply(): ChartAxisTitleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisTitleUpdateData]
  }
  
  @scala.inline
  implicit class ChartAxisTitleUpdateDataMutableBuilder[Self <: ChartAxisTitleUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ChartAxisTitleFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
