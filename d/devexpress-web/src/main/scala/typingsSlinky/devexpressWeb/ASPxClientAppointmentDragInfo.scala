package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores information about an appointment drag operation.
  */
@js.native
trait ASPxClientAppointmentDragInfo extends StObject {
  
  /**
    * Gets the dragged appointment's identifier.
    */
  var appointmentId: String = js.native
  
  /**
    * Gets the appointment's interval after the drag operation.
    */
  var newInterval: ASPxClientTimeInterval = js.native
  
  /**
    * Gets resources associated with the appointment after the drag operation.
    */
  var newResources: js.Array[String] = js.native
  
  /**
    * Gets the appointment's interval before the drag operation.
    */
  var oldInterval: ASPxClientTimeInterval = js.native
  
  /**
    * Gets resources that were associated with the appointment before the drag operation.
    */
  var oldResources: js.Array[String] = js.native
}
object ASPxClientAppointmentDragInfo {
  
  @scala.inline
  def apply(
    appointmentId: String,
    newInterval: ASPxClientTimeInterval,
    newResources: js.Array[String],
    oldInterval: ASPxClientTimeInterval,
    oldResources: js.Array[String]
  ): ASPxClientAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], newResources = newResources.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any], oldResources = oldResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentDragInfo]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentDragInfoMutableBuilder[Self <: ASPxClientAppointmentDragInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "newInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewResources(value: js.Array[String]): Self = StObject.set(x, "newResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewResourcesVarargs(value: String*): Self = StObject.set(x, "newResources", js.Array(value :_*))
    
    @scala.inline
    def setOldInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "oldInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldResources(value: js.Array[String]): Self = StObject.set(x, "oldResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldResourcesVarargs(value: String*): Self = StObject.set(x, "oldResources", js.Array(value :_*))
  }
}
