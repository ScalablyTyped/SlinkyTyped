package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerEase extends EasingFunction {
  
  /** Defines the power of the function */
  var power: Double = js.native
}
object PowerEase {
  
  @scala.inline
  def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    power: Double,
    setEasingMode: Double => Unit
  ): PowerEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), power = power.asInstanceOf[js.Any], setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[PowerEase]
  }
  
  @scala.inline
  implicit class PowerEaseMutableBuilder[Self <: PowerEase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
  }
}
