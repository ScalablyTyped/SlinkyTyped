package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDataComponent extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.native
  
  var component: js.UndefOr[dxScheduler] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var error: js.UndefOr[js.Error] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object AppointmentDataComponent {
  
  @scala.inline
  def apply(): AppointmentDataComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDataComponent]
  }
  
  @scala.inline
  implicit class AppointmentDataComponentMutableBuilder[Self <: AppointmentDataComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    @scala.inline
    def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
