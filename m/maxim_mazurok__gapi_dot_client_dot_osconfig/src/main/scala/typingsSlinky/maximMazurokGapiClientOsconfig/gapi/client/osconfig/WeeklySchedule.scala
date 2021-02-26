package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklySchedule extends StObject {
  
  /** Required. Day of the week. */
  var dayOfWeek: js.UndefOr[String] = js.native
}
object WeeklySchedule {
  
  @scala.inline
  def apply(): WeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklySchedule]
  }
  
  @scala.inline
  implicit class WeeklyScheduleMutableBuilder[Self <: WeeklySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
  }
}
