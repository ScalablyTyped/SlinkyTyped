package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentToolTipShowingEventArgs extends CancelEventArgs {
  
  val appointment: BootstrapSchedulerAppointment = js.native
}
object AppointmentToolTipShowingEventArgs {
  
  @scala.inline
  def apply(appointment: BootstrapSchedulerAppointment, cancel: Boolean, sender: Control): AppointmentToolTipShowingEventArgs = {
    val __obj = js.Dynamic.literal(appointment = appointment.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentToolTipShowingEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentToolTipShowingEventArgsMutableBuilder[Self <: AppointmentToolTipShowingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: BootstrapSchedulerAppointment): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
  }
}
