package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotLinearregressionAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotLinearregressionAnimationOptions {
  
  @scala.inline
  def apply(): PlotLinearregressionAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressionAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotLinearregressionAnimationOptionsMutableBuilder[Self <: PlotLinearregressionAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
