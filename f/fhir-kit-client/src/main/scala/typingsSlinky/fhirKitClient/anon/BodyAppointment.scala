package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Appointment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyAppointment extends StObject {
  
  var body: Appointment = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Appointment = js.native
}
object BodyAppointment {
  
  @scala.inline
  def apply(
    body: Appointment,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Appointment
  ): BodyAppointment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyAppointment]
  }
  
  @scala.inline
  implicit class BodyAppointmentMutableBuilder[Self <: BodyAppointment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Appointment): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Appointment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
