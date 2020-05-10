package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceWindowRequest extends js.Object {
  /**
    * Whether targets must be registered with the maintenance window before tasks can be defined for those targets.
    */
  var AllowUnassociatedTargets: js.UndefOr[MaintenanceWindowAllowUnassociatedTargets] = js.native
  /**
    * The number of hours before the end of the maintenance window that Systems Manager stops scheduling new tasks for execution.
    */
  var Cutoff: js.UndefOr[MaintenanceWindowCutoff] = js.native
  /**
    * An optional description for the update request.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  /**
    * The duration of the maintenance window in hours.
    */
  var Duration: js.UndefOr[MaintenanceWindowDurationHours] = js.native
  /**
    * Whether the maintenance window is enabled.
    */
  var Enabled: js.UndefOr[MaintenanceWindowEnabled] = js.native
  /**
    * The date and time, in ISO-8601 Extended format, for when you want the maintenance window to become inactive. EndDate allows you to set a date and time in the future when the maintenance window will no longer run.
    */
  var EndDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The name of the maintenance window.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  /**
    * If True, then all fields that are required by the CreateMaintenanceWindow action are also required for this API request. Optional fields that are not specified are set to null. 
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The schedule of the maintenance window in the form of a cron or rate expression.
    */
  var Schedule: js.UndefOr[MaintenanceWindowSchedule] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var ScheduleTimezone: js.UndefOr[MaintenanceWindowTimezone] = js.native
  /**
    * The time zone that the scheduled maintenance window executions are based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "etc/UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.
    */
  var StartDate: js.UndefOr[MaintenanceWindowStringDateTime] = js.native
  /**
    * The ID of the maintenance window to update.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object UpdateMaintenanceWindowRequest {
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): UpdateMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceWindowRequest]
  }
  @scala.inline
  implicit class UpdateMaintenanceWindowRequestOps[Self <: UpdateMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindowId(value: MaintenanceWindowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUnassociatedTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnassociatedTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUnassociatedTargets")(js.undefined)
        ret
    }
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
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(js.undefined)
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
  }
  
}

