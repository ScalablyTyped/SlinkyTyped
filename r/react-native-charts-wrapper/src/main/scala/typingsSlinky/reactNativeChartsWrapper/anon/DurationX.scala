package typingsSlinky.reactNativeChartsWrapper.anon

import typingsSlinky.reactNativeChartsWrapper.mod.EasingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationX extends StObject {
  
  var durationX: js.UndefOr[Double] = js.native
  
  var durationY: js.UndefOr[Double] = js.native
  
  var easingX: js.UndefOr[EasingType] = js.native
  
  var easingY: js.UndefOr[EasingType] = js.native
}
object DurationX {
  
  @scala.inline
  def apply(): DurationX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationX]
  }
  
  @scala.inline
  implicit class DurationXMutableBuilder[Self <: DurationX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationX(value: Double): Self = StObject.set(x, "durationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationXUndefined: Self = StObject.set(x, "durationX", js.undefined)
    
    @scala.inline
    def setDurationY(value: Double): Self = StObject.set(x, "durationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationYUndefined: Self = StObject.set(x, "durationY", js.undefined)
    
    @scala.inline
    def setEasingX(value: EasingType): Self = StObject.set(x, "easingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingXUndefined: Self = StObject.set(x, "easingX", js.undefined)
    
    @scala.inline
    def setEasingY(value: EasingType): Self = StObject.set(x, "easingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingYUndefined: Self = StObject.set(x, "easingY", js.undefined)
  }
}
