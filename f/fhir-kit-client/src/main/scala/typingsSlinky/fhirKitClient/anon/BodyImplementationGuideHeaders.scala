package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ImplementationGuide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyImplementationGuideHeaders extends StObject {
  
  var body: ImplementationGuide = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide = js.native
}
object BodyImplementationGuideHeaders {
  
  @scala.inline
  def apply(
    body: ImplementationGuide,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide
  ): BodyImplementationGuideHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyImplementationGuideHeaders]
  }
  
  @scala.inline
  implicit class BodyImplementationGuideHeadersMutableBuilder[Self <: BodyImplementationGuideHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ImplementationGuide): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
