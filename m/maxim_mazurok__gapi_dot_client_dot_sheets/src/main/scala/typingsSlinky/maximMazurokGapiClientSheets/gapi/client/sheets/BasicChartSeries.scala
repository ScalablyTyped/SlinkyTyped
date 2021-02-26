package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicChartSeries extends StObject {
  
  /** The color for elements (such as bars, lines, and points) associated with this series. If empty, a default color is used. */
  var color: js.UndefOr[Color] = js.native
  
  /** The color for elements (such as bars, lines, and points) associated with this series. If empty, a default color is used. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The line style of this series. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO charts are also supported if the series chart type is AREA or LINE. */
  var lineStyle: js.UndefOr[LineStyle] = js.native
  
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.native
  
  /**
    * The minor axis that will specify the range of values for this series. For example, if charting stocks over time, the "Volume" series may want to be pinned to the right with the
    * prices pinned to the left, because the scale of trading volume is different than the scale of prices. It is an error to specify an axis that isn't a valid minor axis for the chart's
    * type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  
  /** The type of this series. Valid only if the chartType is COMBO. Different types will change the way the series is visualized. Only LINE, AREA, and COLUMN are supported. */
  var `type`: js.UndefOr[String] = js.native
}
object BasicChartSeries {
  
  @scala.inline
  def apply(): BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSeries]
  }
  
  @scala.inline
  implicit class BasicChartSeriesMutableBuilder[Self <: BasicChartSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLineStyle(value: LineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setSeries(value: ChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
