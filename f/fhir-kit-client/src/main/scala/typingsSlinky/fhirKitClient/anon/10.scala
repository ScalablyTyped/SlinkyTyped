package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.fhirKitClientStrings.Consent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: Consent = js.native
}
object `10` {
  
  @scala.inline
  def apply(id: String, resourceType: Consent): `10` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: Consent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
