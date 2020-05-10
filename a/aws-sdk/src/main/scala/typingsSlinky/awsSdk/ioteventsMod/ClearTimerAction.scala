package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTimerAction extends js.Object {
  /**
    * The name of the timer to clear.
    */
  var timerName: TimerName = js.native
}

object ClearTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ClearTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTimerAction]
  }
  @scala.inline
  implicit class ClearTimerActionOps[Self <: ClearTimerAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimerName(value: TimerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

