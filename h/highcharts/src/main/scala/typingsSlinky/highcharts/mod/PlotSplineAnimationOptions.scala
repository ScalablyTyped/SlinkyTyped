package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSplineAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotSplineAnimationOptions {
  
  @scala.inline
  def apply(): PlotSplineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSplineAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotSplineAnimationOptionsMutableBuilder[Self <: PlotSplineAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
