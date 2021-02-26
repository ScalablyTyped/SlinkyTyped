package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotStochasticAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotStochasticAnimationOptions {
  
  @scala.inline
  def apply(): PlotStochasticAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotStochasticAnimationOptionsMutableBuilder[Self <: PlotStochasticAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
