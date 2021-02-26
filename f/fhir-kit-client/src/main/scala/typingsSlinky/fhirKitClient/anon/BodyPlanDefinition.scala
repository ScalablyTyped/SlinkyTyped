package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.PlanDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyPlanDefinition extends StObject {
  
  var body: PlanDefinition = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.PlanDefinition = js.native
}
object BodyPlanDefinition {
  
  @scala.inline
  def apply(
    body: PlanDefinition,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.PlanDefinition
  ): BodyPlanDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyPlanDefinition]
  }
  
  @scala.inline
  implicit class BodyPlanDefinitionMutableBuilder[Self <: BodyPlanDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PlanDefinition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.PlanDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
