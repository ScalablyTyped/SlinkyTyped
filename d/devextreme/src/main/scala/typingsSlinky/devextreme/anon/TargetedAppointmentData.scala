package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetedAppointmentData extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.native
  
  var appointmentElement: js.UndefOr[dxElement] = js.native
  
  var component: js.UndefOr[dxScheduler] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var targetedAppointmentData: js.UndefOr[js.Any] = js.native
}
object TargetedAppointmentData {
  
  @scala.inline
  def apply(): TargetedAppointmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedAppointmentData]
  }
  
  @scala.inline
  implicit class TargetedAppointmentDataMutableBuilder[Self <: TargetedAppointmentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    @scala.inline
    def setAppointmentElement(value: dxElement): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentElementUndefined: Self = StObject.set(x, "appointmentElement", js.undefined)
    
    @scala.inline
    def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setTargetedAppointmentData(value: js.Any): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
  }
}
