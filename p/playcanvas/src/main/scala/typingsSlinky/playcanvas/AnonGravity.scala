package typingsSlinky.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGravity extends js.Object {
  var gravity: js.Array[Double] = js.native
}

object AnonGravity {
  @scala.inline
  def apply(gravity: js.Array[Double]): AnonGravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGravity]
  }
  @scala.inline
  implicit class AnonGravityOps[Self <: AnonGravity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGravity(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

