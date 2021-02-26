package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentCreatedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the created appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AppointmentCreatedEventUIParam {
  
  @scala.inline
  def apply(): AppointmentCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCreatedEventUIParam]
  }
  
  @scala.inline
  implicit class AppointmentCreatedEventUIParamMutableBuilder[Self <: AppointmentCreatedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointment(value: js.Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
