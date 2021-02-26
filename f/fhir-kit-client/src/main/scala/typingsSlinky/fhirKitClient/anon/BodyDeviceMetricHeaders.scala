package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.DeviceMetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyDeviceMetricHeaders extends StObject {
  
  var body: DeviceMetric = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceMetric = js.native
}
object BodyDeviceMetricHeaders {
  
  @scala.inline
  def apply(
    body: DeviceMetric,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceMetric
  ): BodyDeviceMetricHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDeviceMetricHeaders]
  }
  
  @scala.inline
  implicit class BodyDeviceMetricHeadersMutableBuilder[Self <: BodyDeviceMetricHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: DeviceMetric): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.DeviceMetric): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
