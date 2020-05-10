package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowIdentity extends js.Object {
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.native
  /**
    * A description of the maintenance window.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.native
  /**
    * Indicates whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become inactive.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * The next time the maintenance window will actually run, taking into account any specified times for the maintenance window to become active or inactive.
    */
  var NextExecutionTime: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when the maintenance window is scheduled to become active.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The ID of the maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.native
}

object MaintenanceWindowIdentity {
  @scala.inline
  def apply(): MaintenanceWindowIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowIdentity]
  }
  @scala.inline
  implicit class MaintenanceWindowIdentityOps[Self <: MaintenanceWindowIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCutoff(value: MaintenanceWindowCutoff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: MaintenanceWindowDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: MaintenanceWindowDurationHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: MaintenanceWindowEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: MaintenanceWindowStringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: MaintenanceWindowName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNextExecutionTime(value: MaintenanceWindowStringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextExecutionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextExecutionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextExecutionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: MaintenanceWindowSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleTimezone(value: MaintenanceWindowTimezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleTimezone")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: MaintenanceWindowStringDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(js.undefined)
        ret
    }
  }
  
}

