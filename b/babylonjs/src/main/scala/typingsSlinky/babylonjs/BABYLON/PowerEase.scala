package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PowerEaseOps[Self <: PowerEase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

