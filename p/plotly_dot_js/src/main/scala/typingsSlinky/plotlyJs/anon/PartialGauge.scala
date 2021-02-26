package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Axis
import typingsSlinky.plotlyJs.mod.GaugeBar
import typingsSlinky.plotlyJs.mod.Threshold
import typingsSlinky.plotlyJs.plotlyJsStrings.angular
import typingsSlinky.plotlyJs.plotlyJsStrings.bullet
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
@js.native
trait PartialGauge extends StObject {
  
  var axis: js.UndefOr[Partial[Axis]] = js.native
  
  var bar: js.UndefOr[Partial[GaugeBar]] = js.native
  
  var bgcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var bordercolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var shape: js.UndefOr[angular | bullet] = js.native
  
  var steps: js.UndefOr[js.Array[Color]] = js.native
  
  var threshold: js.UndefOr[Partial[Threshold]] = js.native
}
object PartialGauge {
  
  @scala.inline
  def apply(): PartialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGauge]
  }
  
  @scala.inline
  implicit class PartialGaugeMutableBuilder[Self <: PartialGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Partial[Axis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setBar(value: Partial[GaugeBar]): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setBgcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Color*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: Partial[Threshold]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
