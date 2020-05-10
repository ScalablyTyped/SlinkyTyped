package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinchGestureHandlerEventExtra extends js.Object {
  var focalX: Double = js.native
  var focalY: Double = js.native
  var scale: Double = js.native
  var velocity: Double = js.native
}

object PinchGestureHandlerEventExtra {
  @scala.inline
  def apply(focalX: Double, focalY: Double, scale: Double, velocity: Double): PinchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(focalX = focalX.asInstanceOf[js.Any], focalY = focalY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class PinchGestureHandlerEventExtraOps[Self <: PinchGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocalX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocalY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

