package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceEase extends EasingFunction {
  /** Defines the number of bounces */
  var bounces: Double = js.native
  /** Defines the amplitude of the bounce */
  var bounciness: Double = js.native
}

object BounceEase {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    bounces: Double,
    bounciness: Double,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): BounceEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], bounces = bounces.asInstanceOf[js.Any], bounciness = bounciness.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[BounceEase]
  }
  @scala.inline
  implicit class BounceEaseOps[Self <: BounceEase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounciness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounciness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

