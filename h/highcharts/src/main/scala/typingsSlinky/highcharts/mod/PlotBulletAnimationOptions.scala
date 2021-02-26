package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotBulletAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.native
}
object PlotBulletAnimationOptions {
  
  @scala.inline
  def apply(): PlotBulletAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBulletAnimationOptions]
  }
  
  @scala.inline
  implicit class PlotBulletAnimationOptionsMutableBuilder[Self <: PlotBulletAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
