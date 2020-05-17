package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gravity extends js.Object {
  var gravity: js.Array[Double] = js.native
}

object Gravity {
  @scala.inline
  def apply(gravity: js.Array[Double]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  @scala.inline
  implicit class GravityOps[Self <: Gravity] (val x: Self) extends AnyVal {
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

