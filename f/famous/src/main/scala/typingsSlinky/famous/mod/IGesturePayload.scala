package typingsSlinky.famous.mod

import typingsSlinky.famous.mathMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGesturePayload extends js.Object {
  var center: Vec2 = js.native
  var centerDelta: Vec2 = js.native
  var centerVelocity: Vec2 = js.native
  var current: Double = js.native
  var pointers: js.Array[IGesturePointer] = js.native
  var points: Double = js.native
  var status: String = js.native
  var time: Double = js.native
}

object IGesturePayload {
  @scala.inline
  def apply(
    center: Vec2,
    centerDelta: Vec2,
    centerVelocity: Vec2,
    current: Double,
    pointers: js.Array[IGesturePointer],
    points: Double,
    status: String,
    time: Double
  ): IGesturePayload = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centerDelta = centerDelta.asInstanceOf[js.Any], centerVelocity = centerVelocity.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGesturePayload]
  }
  @scala.inline
  implicit class IGesturePayloadOps[Self <: IGesturePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterDelta(value: Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterVelocity(value: Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointers(value: js.Array[IGesturePointer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

