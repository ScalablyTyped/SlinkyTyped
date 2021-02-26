package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartParallelAxesResizeOptions extends StObject {
  
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[ChartParallelAxesResizeControlledAxisOptions] = js.native
  
  /**
    * (Highstock) Cursor style for the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) Enable or disable resize by drag for the axis.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) Color of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highstock) Dash style of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineDashStyle: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) Width of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Horizontal offset of the control line.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Vertical offset of the control line.
    */
  var y: js.UndefOr[Double] = js.native
}
object ChartParallelAxesResizeOptions {
  
  @scala.inline
  def apply(): ChartParallelAxesResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesResizeOptions]
  }
  
  @scala.inline
  implicit class ChartParallelAxesResizeOptionsMutableBuilder[Self <: ChartParallelAxesResizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlledAxis(value: ChartParallelAxesResizeControlledAxisOptions): Self = StObject.set(x, "controlledAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlledAxisUndefined: Self = StObject.set(x, "controlledAxis", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineDashStyle(value: String): Self = StObject.set(x, "lineDashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashStyleUndefined: Self = StObject.set(x, "lineDashStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
