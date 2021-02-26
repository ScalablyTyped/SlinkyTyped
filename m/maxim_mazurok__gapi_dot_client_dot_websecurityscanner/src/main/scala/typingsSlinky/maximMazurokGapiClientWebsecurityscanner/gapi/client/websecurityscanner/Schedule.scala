package typingsSlinky.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
  /** Required. The duration of time between executions in days. */
  var intervalDurationDays: js.UndefOr[Double] = js.native
  
  /**
    * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means
    * the scan will be scheduled to start immediately.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntervalDurationDays(value: Double): Self = StObject.set(x, "intervalDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalDurationDaysUndefined: Self = StObject.set(x, "intervalDurationDays", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
  }
}
