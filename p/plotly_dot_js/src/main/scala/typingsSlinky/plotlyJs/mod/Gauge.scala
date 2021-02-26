package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialAxis
import typingsSlinky.plotlyJs.anon.PartialGaugeBar
import typingsSlinky.plotlyJs.anon.PartialThreshold
import typingsSlinky.plotlyJs.plotlyJsStrings.angular
import typingsSlinky.plotlyJs.plotlyJsStrings.bullet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gauge extends StObject {
  
  var axis: PartialAxis = js.native
  
  var bar: PartialGaugeBar = js.native
  
  var bgcolor: Color = js.native
  
  var bordercolor: Color = js.native
  
  var borderwidth: Double = js.native
  
  var shape: angular | bullet = js.native
  
  var steps: js.Array[typingsSlinky.plotlyJs.anon.Color] = js.native
  
  var threshold: PartialThreshold = js.native
}
object Gauge {
  
  @scala.inline
  def apply(
    axis: PartialAxis,
    bar: PartialGaugeBar,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[typingsSlinky.plotlyJs.anon.Color],
    threshold: PartialThreshold
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gauge]
  }
  
  @scala.inline
  implicit class GaugeMutableBuilder[Self <: Gauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: PartialAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBar(value: PartialGaugeBar): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[typingsSlinky.plotlyJs.anon.Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: typingsSlinky.plotlyJs.anon.Color*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: PartialThreshold): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
