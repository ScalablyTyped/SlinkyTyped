package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowIdentity extends StObject {
  
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
    * The number of days to wait to run a maintenance window after the scheduled CRON expression date and time.
    */
  var ScheduleOffset: js.UndefOr[MaintenanceWindowOffset] = js.native
  
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
  implicit class MaintenanceWindowIdentityMutableBuilder[Self <: MaintenanceWindowIdentity] (val x: Self) extends AnyVal {
    
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
    def setNextExecutionTime(value: MaintenanceWindowStringDateTime): Self = StObject.set(x, "NextExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextExecutionTimeUndefined: Self = StObject.set(x, "NextExecutionTime", js.undefined)
    
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
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
