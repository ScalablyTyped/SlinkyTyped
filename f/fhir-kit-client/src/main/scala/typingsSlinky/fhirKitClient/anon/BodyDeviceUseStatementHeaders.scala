package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.DeviceUseStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyDeviceUseStatementHeaders extends StObject {
  
  var body: DeviceUseStatement = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceUseStatement = js.native
}
object BodyDeviceUseStatementHeaders {
  
  @scala.inline
  def apply(
    body: DeviceUseStatement,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceUseStatement
  ): BodyDeviceUseStatementHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDeviceUseStatementHeaders]
  }
  
  @scala.inline
  implicit class BodyDeviceUseStatementHeadersMutableBuilder[Self <: BodyDeviceUseStatementHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: DeviceUseStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceUseStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
