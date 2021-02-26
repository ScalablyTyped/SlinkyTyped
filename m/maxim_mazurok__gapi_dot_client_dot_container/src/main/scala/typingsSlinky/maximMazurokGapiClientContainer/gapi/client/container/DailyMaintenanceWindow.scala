package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyMaintenanceWindow extends StObject {
  
  /**
    * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario. Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format "PTnHnMnS".
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Time within the maintenance window to start the maintenance operations. Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format "HH:MM", where HH : [00-23]
    * and MM : [00-59] GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}
object DailyMaintenanceWindow {
  
  @scala.inline
  def apply(): DailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyMaintenanceWindow]
  }
  
  @scala.inline
  implicit class DailyMaintenanceWindowMutableBuilder[Self <: DailyMaintenanceWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
