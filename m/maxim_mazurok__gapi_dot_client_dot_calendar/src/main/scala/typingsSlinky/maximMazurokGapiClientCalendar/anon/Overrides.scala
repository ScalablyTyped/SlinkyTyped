package typingsSlinky.maximMazurokGapiClientCalendar.anon

import typingsSlinky.maximMazurokGapiClientCalendar.gapi.client.calendar.EventReminder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overrides extends StObject {
  
  /**
    * If the event doesn't use the default reminders, this lists the reminders specific to the event, or, if not set, indicates that no reminders are set for this event. The maximum
    * number of override reminders is 5.
    */
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
  
  /** Whether the default reminders of the calendar apply to the event. */
  var useDefault: js.UndefOr[Boolean] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesMutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[EventReminder]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: EventReminder*): Self = StObject.set(x, "overrides", js.Array(value :_*))
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
