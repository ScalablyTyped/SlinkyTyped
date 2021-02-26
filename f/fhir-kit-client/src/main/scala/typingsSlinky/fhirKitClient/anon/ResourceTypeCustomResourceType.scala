package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.mod.CustomResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTypeCustomResourceType extends StObject {
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: CustomResourceType = js.native
}
object ResourceTypeCustomResourceType {
  
  @scala.inline
  def apply(id: String, resourceType: CustomResourceType): ResourceTypeCustomResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTypeCustomResourceType]
  }
  
  @scala.inline
  implicit class ResourceTypeCustomResourceTypeMutableBuilder[Self <: ResourceTypeCustomResourceType] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: CustomResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
