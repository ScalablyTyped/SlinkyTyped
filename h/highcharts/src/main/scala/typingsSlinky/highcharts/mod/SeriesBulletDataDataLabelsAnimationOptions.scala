package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesBulletDataDataLabelsAnimationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) The animation delay time in milliseconds.
    * Set to `0` renders dataLabel immediately. As `undefined` inherits defer
    * time from the series.animation.defer.
    */
  var defer: js.UndefOr[Double] = js.native
}
object SeriesBulletDataDataLabelsAnimationOptions {
  
  @scala.inline
  def apply(): SeriesBulletDataDataLabelsAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBulletDataDataLabelsAnimationOptions]
  }
  
  @scala.inline
  implicit class SeriesBulletDataDataLabelsAnimationOptionsMutableBuilder[Self <: SeriesBulletDataDataLabelsAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
