package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyMeasure extends StObject {
  
  var body: Measure = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Measure = js.native
}
object BodyMeasure {
  
  @scala.inline
  def apply(body: Measure, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Measure): BodyMeasure = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyMeasure]
  }
  
  @scala.inline
  implicit class BodyMeasureMutableBuilder[Self <: BodyMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Measure): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Measure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
