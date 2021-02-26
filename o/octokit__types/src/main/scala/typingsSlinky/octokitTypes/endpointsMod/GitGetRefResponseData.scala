package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.ShaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitGetRefResponseData extends StObject {
  
  var node_id: String = js.native
  
  var `object`: ShaType = js.native
  
  var ref: String = js.native
  
  var url: String = js.native
}
object GitGetRefResponseData {
  
  @scala.inline
  def apply(node_id: String, `object`: ShaType, ref: String, url: String): GitGetRefResponseData = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetRefResponseData]
  }
  
  @scala.inline
  implicit class GitGetRefResponseDataMutableBuilder[Self <: GitGetRefResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ShaType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
