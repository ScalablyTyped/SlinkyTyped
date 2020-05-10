package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasSchedules extends js.Object {
  def getSchedules(): ExtensionSchedule = js.native
  def setSchedules(schedules: ExtensionScheduleInput): Unit = js.native
}

object hasSchedules {
  @scala.inline
  def apply(getSchedules: () => ExtensionSchedule, setSchedules: ExtensionScheduleInput => Unit): hasSchedules = {
    val __obj = js.Dynamic.literal(getSchedules = js.Any.fromFunction0(getSchedules), setSchedules = js.Any.fromFunction1(setSchedules))
    __obj.asInstanceOf[hasSchedules]
  }
  @scala.inline
  implicit class hasSchedulesOps[Self <: hasSchedules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSchedules(value: () => ExtensionSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSchedules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSchedules(value: ExtensionScheduleInput => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSchedules")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

