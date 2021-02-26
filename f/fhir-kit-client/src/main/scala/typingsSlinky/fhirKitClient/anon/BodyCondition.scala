package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyCondition extends StObject {
  
  var body: Condition = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Condition = js.native
}
object BodyCondition {
  
  @scala.inline
  def apply(body: Condition, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Condition): BodyCondition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCondition]
  }
  
  @scala.inline
  implicit class BodyConditionMutableBuilder[Self <: BodyCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Condition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Condition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
