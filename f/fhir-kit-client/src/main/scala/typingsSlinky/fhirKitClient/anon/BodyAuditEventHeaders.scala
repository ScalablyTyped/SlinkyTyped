package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.AuditEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyAuditEventHeaders extends StObject {
  
  var body: AuditEvent = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.AuditEvent = js.native
}
object BodyAuditEventHeaders {
  
  @scala.inline
  def apply(
    body: AuditEvent,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.AuditEvent
  ): BodyAuditEventHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyAuditEventHeaders]
  }
  
  @scala.inline
  implicit class BodyAuditEventHeadersMutableBuilder[Self <: BodyAuditEventHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: AuditEvent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.AuditEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
