package typingsSlinky.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsResourceTypeResourceType extends StObject {
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType = js.native
}
object OptionsResourceTypeResourceType {
  
  @scala.inline
  def apply(resourceType: typingsSlinky.fhirKitClient.mod.ResourceType): OptionsResourceTypeResourceType = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsResourceTypeResourceType]
  }
  
  @scala.inline
  implicit class OptionsResourceTypeResourceTypeMutableBuilder[Self <: OptionsResourceTypeResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
