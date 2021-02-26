package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Organization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyOrganization extends StObject {
  
  var body: Organization = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Organization = js.native
}
object BodyOrganization {
  
  @scala.inline
  def apply(body: Organization, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Organization): BodyOrganization = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOrganization]
  }
  
  @scala.inline
  implicit class BodyOrganizationMutableBuilder[Self <: BodyOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Organization): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Organization): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
