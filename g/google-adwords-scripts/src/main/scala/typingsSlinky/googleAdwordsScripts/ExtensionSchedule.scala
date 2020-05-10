package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Video
// Non-entity
@js.native
trait ExtensionSchedule extends js.Object {
  def getDayOfWeek(): DayOfWeekString = js.native
  def getEndHour(): Double = js.native
  def getEndMinute(): Double = js.native
  def getStartHour(): Double = js.native
  def getStartMinute(): Double = js.native
}

object ExtensionSchedule {
  @scala.inline
  def apply(
    getDayOfWeek: () => DayOfWeekString,
    getEndHour: () => Double,
    getEndMinute: () => Double,
    getStartHour: () => Double,
    getStartMinute: () => Double
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getEndHour = js.Any.fromFunction0(getEndHour), getEndMinute = js.Any.fromFunction0(getEndMinute), getStartHour = js.Any.fromFunction0(getStartHour), getStartMinute = js.Any.fromFunction0(getStartMinute))
    __obj.asInstanceOf[ExtensionSchedule]
  }
  @scala.inline
  implicit class ExtensionScheduleOps[Self <: ExtensionSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDayOfWeek(value: () => DayOfWeekString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfWeek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndHour(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndHour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndMinute(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndMinute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartHour(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartHour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStartMinute(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartMinute")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

