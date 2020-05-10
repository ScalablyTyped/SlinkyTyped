package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSnapDistance extends js.Object {
  var snapDistance: Double = js.native
}

object AnonSnapDistance {
  @scala.inline
  def apply(snapDistance: Double): AnonSnapDistance = {
    val __obj = js.Dynamic.literal(snapDistance = snapDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSnapDistance]
  }
  @scala.inline
  implicit class AnonSnapDistanceOps[Self <: AnonSnapDistance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

