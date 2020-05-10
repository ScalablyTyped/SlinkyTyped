package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schedule for disks where the schedueled operations are performed.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicySchedule extends js.Object {
  var dailySchedule: js.UndefOr[SchemaResourcePolicyDailyCycle] = js.native
  var hourlySchedule: js.UndefOr[SchemaResourcePolicyHourlyCycle] = js.native
  var weeklySchedule: js.UndefOr[SchemaResourcePolicyWeeklyCycle] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicySchedule {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySchedule]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicyScheduleOps[Self <: SchemaResourcePolicySnapshotSchedulePolicySchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailySchedule(value: SchemaResourcePolicyDailyCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailySchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailySchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailySchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withHourlySchedule(value: SchemaResourcePolicyHourlyCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlySchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlySchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlySchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklySchedule(value: SchemaResourcePolicyWeeklyCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklySchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklySchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklySchedule")(js.undefined)
        ret
    }
  }
  
}

