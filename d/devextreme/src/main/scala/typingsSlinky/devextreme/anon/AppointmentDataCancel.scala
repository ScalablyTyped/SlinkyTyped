package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScheduler
import typingsSlinky.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentDataCancel extends StObject {
  
  var appointmentData: js.UndefOr[js.Any] = js.native
  
  var cancel: js.UndefOr[
    Boolean | typingsSlinky.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.native
  
  var component: js.UndefOr[dxScheduler] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object AppointmentDataCancel {
  
  @scala.inline
  def apply(): AppointmentDataCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDataCancel]
  }
  
  @scala.inline
  implicit class AppointmentDataCancelMutableBuilder[Self <: AppointmentDataCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentData(value: js.Any): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean | typingsSlinky.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
