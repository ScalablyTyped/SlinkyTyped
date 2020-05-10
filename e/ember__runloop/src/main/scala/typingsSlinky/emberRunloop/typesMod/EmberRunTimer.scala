package typingsSlinky.emberRunloop.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmberRunTimer extends js.Object {
  var __ember_run_timer_brand__ : Boolean = js.native
}

object EmberRunTimer {
  @scala.inline
  def apply(__ember_run_timer_brand__ : Boolean): EmberRunTimer = {
    val __obj = js.Dynamic.literal(__ember_run_timer_brand__ = __ember_run_timer_brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmberRunTimer]
  }
  @scala.inline
  implicit class EmberRunTimerOps[Self <: EmberRunTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__ember_run_timer_brand__(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__ember_run_timer_brand__")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

