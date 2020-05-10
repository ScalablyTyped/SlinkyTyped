package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelAnimationStatus extends js.Object {
  /** The animation to which the status applies. */
  var anim: RaphaelAnimation = js.native
  /** The current status of the animation, i.e. the normalized animation time, a value between `0` and `1`. */
  var status: Double = js.native
}

object RaphaelAnimationStatus {
  @scala.inline
  def apply(anim: RaphaelAnimation, status: Double): RaphaelAnimationStatus = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAnimationStatus]
  }
  @scala.inline
  implicit class RaphaelAnimationStatusOps[Self <: RaphaelAnimationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnim(value: RaphaelAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

