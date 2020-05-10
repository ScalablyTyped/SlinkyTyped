package typingsSlinky.offlineJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelay extends js.Object {
  var delay: Double = js.native
  var initialDelay: Double = js.native
}

object AnonDelay {
  @scala.inline
  def apply(delay: Double, initialDelay: Double): AnonDelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
  @scala.inline
  implicit class AnonDelayOps[Self <: AnonDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

