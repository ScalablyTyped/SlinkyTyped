package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferredMaintenanceWindow extends StObject {
  
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[js.Date] = js.native
}
object DeferredMaintenanceWindow {
  
  @scala.inline
  def apply(): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
  
  @scala.inline
  implicit class DeferredMaintenanceWindowMutableBuilder[Self <: DeferredMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferMaintenanceEndTime(value: js.Date): Self = StObject.set(x, "DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferMaintenanceEndTimeUndefined: Self = StObject.set(x, "DeferMaintenanceEndTime", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceIdentifier(value: String): Self = StObject.set(x, "DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferMaintenanceIdentifierUndefined: Self = StObject.set(x, "DeferMaintenanceIdentifier", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceStartTime(value: js.Date): Self = StObject.set(x, "DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferMaintenanceStartTimeUndefined: Self = StObject.set(x, "DeferMaintenanceStartTime", js.undefined)
  }
}
