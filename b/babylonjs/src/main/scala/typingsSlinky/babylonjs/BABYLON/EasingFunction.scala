package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EasingFunction extends IEasingFunction {
  var _easingMode: js.Any = js.native
  /**
    * @hidden
    */
  def easeInCore(gradient: Double): Double = js.native
  /**
    * Gets the current easing mode.
    * @returns the easing mode
    */
  def getEasingMode(): Double = js.native
  /**
    * Sets the easing mode of the current function.
    * @param easingMode Defines the willing mode (EASINGMODE_EASEIN, EASINGMODE_EASEOUT or EASINGMODE_EASEINOUT)
    */
  def setEasingMode(easingMode: Double): Unit = js.native
}

object EasingFunction {
  @scala.inline
  def apply(
    _easingMode: js.Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: () => Double,
    setEasingMode: Double => Unit
  ): EasingFunction = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = js.Any.fromFunction0(getEasingMode), setEasingMode = js.Any.fromFunction1(setEasingMode))
    __obj.asInstanceOf[EasingFunction]
  }
  @scala.inline
  implicit class EasingFunctionOps[Self <: EasingFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_easingMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_easingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInCore(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInCore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEasingMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasingMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEasingMode(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

