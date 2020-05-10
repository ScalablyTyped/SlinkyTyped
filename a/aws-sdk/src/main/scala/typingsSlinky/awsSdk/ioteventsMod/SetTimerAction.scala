package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimerAction extends js.Object {
  /**
    * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables ($variable.&lt;variable-name&gt;), and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the duration. The range of the duration is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration is rounded down to the nearest whole number. 
    */
  var durationExpression: js.UndefOr[VariableValue] = js.native
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy.
    */
  var seconds: js.UndefOr[Seconds] = js.native
  /**
    * The name of the timer.
    */
  var timerName: TimerName = js.native
}

object SetTimerAction {
  @scala.inline
  def apply(timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimerAction]
  }
  @scala.inline
  implicit class SetTimerActionOps[Self <: SetTimerAction] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDurationExpression(value: VariableValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds(value: Seconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(js.undefined)
        ret
    }
  }
  
}

