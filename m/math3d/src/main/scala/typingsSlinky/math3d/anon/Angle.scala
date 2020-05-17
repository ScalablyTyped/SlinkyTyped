package typingsSlinky.math3d.anon

import typingsSlinky.math3d.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Angle extends js.Object {
  var angle: Double = js.native
  var axis: Vector3 = js.native
}

object Angle {
  @scala.inline
  def apply(angle: Double, axis: Vector3): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
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

