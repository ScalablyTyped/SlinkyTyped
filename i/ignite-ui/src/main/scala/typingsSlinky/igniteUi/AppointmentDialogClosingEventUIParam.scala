package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDialogClosingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the appointment dialog.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets whether we are creating or updating an appointment.
    */
  var isAppointmentNew: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object AppointmentDialogClosingEventUIParam {
  
  @scala.inline
  def apply(): AppointmentDialogClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDialogClosingEventUIParam]
  }
  
  @scala.inline
  implicit class AppointmentDialogClosingEventUIParamMutableBuilder[Self <: AppointmentDialogClosingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setIsAppointmentNew(value: Boolean): Self = StObject.set(x, "isAppointmentNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppointmentNewUndefined: Self = StObject.set(x, "isAppointmentNew", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
