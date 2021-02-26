package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotGanttAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotGanttAnimationOptions {
  
  @scala.inline
  def apply(): PlotGanttAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGanttAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotGanttAnimationOptionsMutableBuilder[Self <: PlotGanttAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
