package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentsSelectionEventArgs extends EventArgs {
  
  val appointmentIds: js.Array[String] = js.native
}
object AppointmentsSelectionEventArgs {
  
  @scala.inline
  def apply(appointmentIds: js.Array[String], sender: Control): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentsSelectionEventArgsOps[Self <: AppointmentsSelectionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointmentIdsVarargs(value: String*): Self = this.set("appointmentIds", js.Array(value :_*))
    
    @scala.inline
    def setAppointmentIds(value: js.Array[String]): Self = this.set("appointmentIds", value.asInstanceOf[js.Any])
  }
}
