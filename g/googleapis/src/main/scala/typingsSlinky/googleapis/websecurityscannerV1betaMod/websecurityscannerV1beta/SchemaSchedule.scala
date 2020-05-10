package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan schedule configuration.
  */
@js.native
trait SchemaSchedule extends js.Object {
  /**
    * Required. The duration of time between executions in days.
    */
  var intervalDurationDays: js.UndefOr[Double] = js.native
  /**
    * A timestamp indicates when the next run will be scheduled. The value is
    * refreshed by the server after each run. If unspecified, it will default
    * to current server time, which means the scan will be scheduled to start
    * immediately.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object SchemaSchedule {
  @scala.inline
  def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  @scala.inline
  implicit class SchemaScheduleOps[Self <: SchemaSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntervalDurationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalDurationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalDurationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalDurationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(js.undefined)
        ret
    }
  }
  
}

