package typingsSlinky.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarChartProps extends PieRadarChartBase {
  
  var data: js.UndefOr[RadarData] = js.native
  
  var drawWeb: js.UndefOr[Boolean] = js.native
  
  var skipWebLineCount: js.UndefOr[Double] = js.native
  
  var webAlpha: js.UndefOr[Double] = js.native
  
  var webColor: js.UndefOr[Color] = js.native
  
  var webColorInner: js.UndefOr[Color] = js.native
  
  var webLineWidth: js.UndefOr[Double] = js.native
  
  var webLineWidthInner: js.UndefOr[Double] = js.native
  
  var yAxis: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.yAxis] = js.native
}
object RadarChartProps {
  
  @scala.inline
  def apply(): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartProps]
  }
  
  @scala.inline
  implicit class RadarChartPropsMutableBuilder[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: RadarData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDrawWeb(value: Boolean): Self = StObject.set(x, "drawWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawWebUndefined: Self = StObject.set(x, "drawWeb", js.undefined)
    
    @scala.inline
    def setSkipWebLineCount(value: Double): Self = StObject.set(x, "skipWebLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipWebLineCountUndefined: Self = StObject.set(x, "skipWebLineCount", js.undefined)
    
    @scala.inline
    def setWebAlpha(value: Double): Self = StObject.set(x, "webAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAlphaUndefined: Self = StObject.set(x, "webAlpha", js.undefined)
    
    @scala.inline
    def setWebColor(value: Color): Self = StObject.set(x, "webColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebColorInner(value: Color): Self = StObject.set(x, "webColorInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebColorInnerUndefined: Self = StObject.set(x, "webColorInner", js.undefined)
    
    @scala.inline
    def setWebColorUndefined: Self = StObject.set(x, "webColor", js.undefined)
    
    @scala.inline
    def setWebLineWidth(value: Double): Self = StObject.set(x, "webLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebLineWidthInner(value: Double): Self = StObject.set(x, "webLineWidthInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebLineWidthInnerUndefined: Self = StObject.set(x, "webLineWidthInner", js.undefined)
    
    @scala.inline
    def setWebLineWidthUndefined: Self = StObject.set(x, "webLineWidth", js.undefined)
    
    @scala.inline
    def setYAxis(value: yAxis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
