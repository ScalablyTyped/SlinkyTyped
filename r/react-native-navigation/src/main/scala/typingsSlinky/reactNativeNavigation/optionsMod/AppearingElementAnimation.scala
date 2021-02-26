package typingsSlinky.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppearingElementAnimation extends ElementAnimation {
  
  var from: Double = js.native
}
object AppearingElementAnimation {
  
  @scala.inline
  def apply(duration: Double, from: Double): AppearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearingElementAnimation]
  }
  
  @scala.inline
  implicit class AppearingElementAnimationMutableBuilder[Self <: AppearingElementAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
