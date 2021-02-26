package typingsSlinky.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisappearingElementAnimation extends ElementAnimation {
  
  var to: Double = js.native
}
object DisappearingElementAnimation {
  
  @scala.inline
  def apply(duration: Double, to: Double): DisappearingElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisappearingElementAnimation]
  }
  
  @scala.inline
  implicit class DisappearingElementAnimationMutableBuilder[Self <: DisappearingElementAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
