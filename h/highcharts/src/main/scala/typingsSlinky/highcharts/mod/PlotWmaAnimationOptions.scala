package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotWmaAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotWmaAnimationOptions {
  
  @scala.inline
  def apply(): PlotWmaAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWmaAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotWmaAnimationOptionsMutableBuilder[Self <: PlotWmaAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
