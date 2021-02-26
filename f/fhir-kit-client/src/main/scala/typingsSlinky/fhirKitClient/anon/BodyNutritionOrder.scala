package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.NutritionOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyNutritionOrder extends StObject {
  
  var body: NutritionOrder = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder = js.native
}
object BodyNutritionOrder {
  
  @scala.inline
  def apply(
    body: NutritionOrder,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder
  ): BodyNutritionOrder = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyNutritionOrder]
  }
  
  @scala.inline
  implicit class BodyNutritionOrderMutableBuilder[Self <: BodyNutritionOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: NutritionOrder): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.NutritionOrder): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
