package typingsSlinky.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentHoverEventArgs extends js.Object {
  
  /** Returns the hovered appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns the object of appointmentHover event.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object AppointmentHoverEventArgs {
  
  @scala.inline
  def apply(): AppointmentHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentHoverEventArgs]
  }
  
  @scala.inline
  implicit class AppointmentHoverEventArgsOps[Self <: AppointmentHoverEventArgs] (val x: Self) extends AnyVal {
    
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
    def setAppointment(value: js.Any): Self = this.set("appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
