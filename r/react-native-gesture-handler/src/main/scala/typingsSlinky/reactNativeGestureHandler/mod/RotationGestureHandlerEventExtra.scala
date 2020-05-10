package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationGestureHandlerEventExtra extends js.Object {
  var anchorX: Double = js.native
  var anchorY: Double = js.native
  var rotation: Double = js.native
  var velocity: Double = js.native
}

object RotationGestureHandlerEventExtra {
  @scala.inline
  def apply(anchorX: Double, anchorY: Double, rotation: Double, velocity: Double): RotationGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class RotationGestureHandlerEventExtraOps[Self <: RotationGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
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

