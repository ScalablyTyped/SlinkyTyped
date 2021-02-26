package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ChargeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyChargeItemHeaders extends StObject {
  
  var body: ChargeItem = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ChargeItem = js.native
}
object BodyChargeItemHeaders {
  
  @scala.inline
  def apply(
    body: ChargeItem,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ChargeItem
  ): BodyChargeItemHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyChargeItemHeaders]
  }
  
  @scala.inline
  implicit class BodyChargeItemHeadersMutableBuilder[Self <: BodyChargeItemHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ChargeItem): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.ChargeItem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
