package typingsSlinky.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisDependency extends StObject {
  
  var axisDependency: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.AxisDependency] = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  var xValue: Double = js.native
  
  var yValue: Double = js.native
}
object AxisDependency {
  
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, xValue: Double, yValue: Double): AxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDependency]
  }
  
  @scala.inline
  implicit class AxisDependencyMutableBuilder[Self <: AxisDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisDependency(value: typingsSlinky.reactNativeChartsWrapper.mod.AxisDependency): Self = StObject.set(x, "axisDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisDependencyUndefined: Self = StObject.set(x, "axisDependency", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXValue(value: Double): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYValue(value: Double): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
  }
}
