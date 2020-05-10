package typingsSlinky.math3d

import typingsSlinky.math3d.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAngle extends js.Object {
  var angle: Double = js.native
  var axis: Vector3 = js.native
}

object AnonAngle {
  @scala.inline
  def apply(angle: Double, axis: Vector3): AnonAngle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngle]
  }
  @scala.inline
  implicit class AnonAngleOps[Self <: AnonAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

