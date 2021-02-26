package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Observation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyObservation extends StObject {
  
  var body: Observation = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Observation = js.native
}
object BodyObservation {
  
  @scala.inline
  def apply(body: Observation, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Observation): BodyObservation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyObservation]
  }
  
  @scala.inline
  implicit class BodyObservationMutableBuilder[Self <: BodyObservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Observation): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Observation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
