package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorYAxisStackLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts) The animation delay time in milliseconds. Set to `0` renders
    * stackLabel immediately. As `undefined` inherits defer time from the
    * series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.native
}
object NavigatorYAxisStackLabelsAnimationOptions {
  
  @scala.inline
  def apply(): NavigatorYAxisStackLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisStackLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit class NavigatorYAxisStackLabelsAnimationOptionsMutableBuilder[Self <: NavigatorYAxisStackLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
