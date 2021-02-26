package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyValueSetHeaders extends StObject {
  
  var body: ValueSet = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ValueSet = js.native
}
object BodyValueSetHeaders {
  
  @scala.inline
  def apply(
    body: ValueSet,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ValueSet
  ): BodyValueSetHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyValueSetHeaders]
  }
  
  @scala.inline
  implicit class BodyValueSetHeadersMutableBuilder[Self <: BodyValueSetHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ValueSet): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.ValueSet): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
