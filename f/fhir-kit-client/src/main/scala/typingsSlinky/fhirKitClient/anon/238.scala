package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.fhirKitClientStrings.EpisodeOfCare
import typingsSlinky.jsonPatch.mod.OpPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `238` extends StObject {
  
  var JSONPatch: js.Array[OpPatch] = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: EpisodeOfCare = js.native
}
object `238` {
  
  @scala.inline
  def apply(JSONPatch: js.Array[OpPatch], id: String, resourceType: EpisodeOfCare): `238` = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`238`]
  }
  
  @scala.inline
  implicit class `238MutableBuilder`[Self <: `238`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONPatch(value: js.Array[OpPatch]): Self = StObject.set(x, "JSONPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONPatchVarargs(value: OpPatch*): Self = StObject.set(x, "JSONPatch", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: EpisodeOfCare): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
