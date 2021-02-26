package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMappointAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotMappointAnimationOptions {
  
  @scala.inline
  def apply(): PlotMappointAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMappointAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotMappointAnimationOptionsMutableBuilder[Self <: PlotMappointAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
