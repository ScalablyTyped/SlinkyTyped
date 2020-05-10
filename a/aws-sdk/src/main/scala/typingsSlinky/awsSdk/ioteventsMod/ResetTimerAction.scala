package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetTimerAction extends js.Object {
  /**
    * The name of the timer to reset.
    */
  var timerName: TimerName = js.native
}

object ResetTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ResetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetTimerAction]
  }
  @scala.inline
  implicit class ResetTimerActionOps[Self <: ResetTimerAction] (val x: Self) extends AnyVal {
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

