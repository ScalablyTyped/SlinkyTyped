package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single series of data in a chart. For example, if charting stock prices
  * over time, multiple series may exist, one for the &quot;Open Price&quot;,
  * &quot;High Price&quot;, &quot;Low Price&quot; and &quot;Close Price&quot;.
  */
@js.native
trait SchemaBasicChartSeries extends StObject {
  
  /**
    * The color for elements (i.e. bars, lines, points) associated with this
    * series.  If empty, a default color is used.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The line style of this series. Valid only if the chartType is AREA, LINE,
    * or SCATTER. COMBO charts are also supported if the series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[SchemaLineStyle] = js.native
  
  /**
    * The data being visualized in this chart series.
    */
  var series: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * The minor axis that will specify the range of values for this series. For
    * example, if charting stocks over time, the &quot;Volume&quot; series may
    * want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices. It is an error to specify an axis that isn&#39;t a valid minor
    * axis for the chart&#39;s type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  
  /**
    * The type of this series. Valid only if the chartType is COMBO. Different
    * types will change the way the series is visualized. Only LINE, AREA, and
    * COLUMN are supported.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaBasicChartSeries {
  
  @scala.inline
  def apply(): SchemaBasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartSeries]
  }
  
  @scala.inline
  implicit class SchemaBasicChartSeriesMutableBuilder[Self <: SchemaBasicChartSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLineStyle(value: SchemaLineStyle): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setSeries(value: SchemaChartData): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
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
