package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMaintenanceWindowRequest extends StObject {
  
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
    * The number of days to wait after the date and time specified by a CRON expression before running the maintenance window. For example, the following cron expression schedules a maintenance window to run the third Tuesday of every month at 11:30 PM.  cron(0 30 23 ? * TUE#3 *)  If the schedule offset is 2, the maintenance window won't run until two days later.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.native
  
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
  implicit class UpdateMaintenanceWindowRequestMutableBuilder[Self <: UpdateMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnassociatedTargets(value: MaintenanceWindowAllowUnassociatedTargets): Self = StObject.set(x, "AllowUnassociatedTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnassociatedTargetsUndefined: Self = StObject.set(x, "AllowUnassociatedTargets", js.undefined)
    
    @scala.inline
    def setCutoff(value: MaintenanceWindowCutoff): Self = StObject.set(x, "Cutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoffUndefined: Self = StObject.set(x, "Cutoff", js.undefined)
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDuration(value: MaintenanceWindowDurationHours): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setEnabled(value: MaintenanceWindowEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEndDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "Replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "Replace", js.undefined)
    
    @scala.inline
    def setSchedule(value: MaintenanceWindowSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOffset(value: MaintenanceWindowOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    @scala.inline
    def setScheduleTimezone(value: MaintenanceWindowTimezone): Self = StObject.set(x, "ScheduleTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimezoneUndefined: Self = StObject.set(x, "ScheduleTimezone", js.undefined)
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setStartDate(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
