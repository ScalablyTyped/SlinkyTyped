package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ImplementationGuide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyImplementationGuide extends StObject {
  
  var body: ImplementationGuide = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide = js.native
}
object BodyImplementationGuide {
  
  @scala.inline
  def apply(
    body: ImplementationGuide,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide
  ): BodyImplementationGuide = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyImplementationGuide]
  }
  
  @scala.inline
  implicit class BodyImplementationGuideMutableBuilder[Self <: BodyImplementationGuide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ImplementationGuide): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
