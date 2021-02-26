package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.fhirKitClientStrings.CapabilityStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdStringOptions extends StObject {
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: CapabilityStatement = js.native
}
object IdStringOptions {
  
  @scala.inline
  def apply(id: String, resourceType: CapabilityStatement): IdStringOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdStringOptions]
  }
  
  @scala.inline
  implicit class IdStringOptionsMutableBuilder[Self <: IdStringOptions] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: CapabilityStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
