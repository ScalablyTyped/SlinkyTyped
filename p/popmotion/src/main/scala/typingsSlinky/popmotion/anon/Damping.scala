package typingsSlinky.popmotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Damping extends js.Object {
  var damping: Double = js.native
  var stiffness: Double = js.native
}

object Damping {
  @scala.inline
  def apply(damping: Double, stiffness: Double): Damping = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damping]
  }
  @scala.inline
  implicit class DampingOps[Self <: Damping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

