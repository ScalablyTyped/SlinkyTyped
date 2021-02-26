package typingsSlinky.officeJsPreview.Office

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.olkAppointmentTimeChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentTimeChangedEventArgs extends StObject {
  
  /**
    * Gets the appointment end date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var end: js.Date = js.native
  
  /**
    * Gets the appointment start date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var start: js.Date = js.native
  
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkAppointmentTimeChanged = js.native
}
object AppointmentTimeChangedEventArgs {
  
  @scala.inline
  def apply(end: js.Date, start: js.Date, `type`: olkAppointmentTimeChanged): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentTimeChangedEventArgsMutableBuilder[Self <: AppointmentTimeChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkAppointmentTimeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
