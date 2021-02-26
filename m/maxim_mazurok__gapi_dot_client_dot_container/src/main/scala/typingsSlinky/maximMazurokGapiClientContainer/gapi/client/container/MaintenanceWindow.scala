package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindow extends StObject {
  
  /** DailyMaintenanceWindow specifies a daily maintenance operation window. */
  var dailyMaintenanceWindow: js.UndefOr[DailyMaintenanceWindow] = js.native
  
  /** Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. */
  var maintenanceExclusions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
    */ typingsSlinky.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow with TopLevel[js.Any]
  ] = js.native
  
  /**
    * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can
    * occur at any time.
    */
  var recurringWindow: js.UndefOr[RecurringTimeWindow] = js.native
}
object MaintenanceWindow {
  
  @scala.inline
  def apply(): MaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindow]
  }
  
  @scala.inline
  implicit class MaintenanceWindowMutableBuilder[Self <: MaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyMaintenanceWindow(value: DailyMaintenanceWindow): Self = StObject.set(x, "dailyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyMaintenanceWindowUndefined: Self = StObject.set(x, "dailyMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setMaintenanceExclusions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.container.gapi.client.container.TimeWindow}
      */ typingsSlinky.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.MaintenanceWindow with TopLevel[js.Any]
    ): Self = StObject.set(x, "maintenanceExclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceExclusionsUndefined: Self = StObject.set(x, "maintenanceExclusions", js.undefined)
    
    @scala.inline
    def setRecurringWindow(value: RecurringTimeWindow): Self = StObject.set(x, "recurringWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringWindowUndefined: Self = StObject.set(x, "recurringWindow", js.undefined)
  }
}
