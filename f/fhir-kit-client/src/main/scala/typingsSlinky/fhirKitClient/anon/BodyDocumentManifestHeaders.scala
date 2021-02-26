package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.DocumentManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyDocumentManifestHeaders extends StObject {
  
  var body: DocumentManifest = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DocumentManifest = js.native
}
object BodyDocumentManifestHeaders {
  
  @scala.inline
  def apply(
    body: DocumentManifest,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DocumentManifest
  ): BodyDocumentManifestHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDocumentManifestHeaders]
  }
  
  @scala.inline
  implicit class BodyDocumentManifestHeadersMutableBuilder[Self <: BodyDocumentManifestHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: DocumentManifest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.DocumentManifest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
