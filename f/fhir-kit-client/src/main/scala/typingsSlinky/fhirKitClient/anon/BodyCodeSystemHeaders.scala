package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.CodeSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyCodeSystemHeaders extends StObject {
  
  var body: CodeSystem = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.CodeSystem = js.native
}
object BodyCodeSystemHeaders {
  
  @scala.inline
  def apply(
    body: CodeSystem,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.CodeSystem
  ): BodyCodeSystemHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCodeSystemHeaders]
  }
  
  @scala.inline
  implicit class BodyCodeSystemHeadersMutableBuilder[Self <: BodyCodeSystemHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: CodeSystem): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.CodeSystem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
