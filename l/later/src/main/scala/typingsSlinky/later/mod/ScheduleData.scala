package typingsSlinky.later.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleData extends js.Object {
  /**
    * A code to identify any errors in the composite schedule and exceptions.
    * The number tells you the position of the error within the schedule.
    */
  var error: Double = js.native
  /**
    * A list of exceptions to the composite recurrence information.
    */
  var exceptions: js.Array[Recurrence] = js.native
  /**
    * A list of recurrence information as a composite schedule.
    */
  var schedules: js.Array[Recurrence] = js.native
}

object ScheduleData {
  @scala.inline
  def apply(error: Double, exceptions: js.Array[Recurrence], schedules: js.Array[Recurrence]): ScheduleData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleData]
  }
  @scala.inline
  implicit class ScheduleDataOps[Self <: ScheduleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptions(value: js.Array[Recurrence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedules(value: js.Array[Recurrence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

