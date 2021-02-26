package typingsSlinky.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubflowOutputs extends StObject {
  
  var links: js.Array[js.Object] = js.native
  
  var subflowOutputs: js.Array[js.Object] = js.native
}
object SubflowOutputs {
  
  @scala.inline
  def apply(links: js.Array[js.Object], subflowOutputs: js.Array[js.Object]): SubflowOutputs = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], subflowOutputs = subflowOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubflowOutputs]
  }
  
  @scala.inline
  implicit class SubflowOutputsMutableBuilder[Self <: SubflowOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setSubflowOutputs(value: js.Array[js.Object]): Self = StObject.set(x, "subflowOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubflowOutputsVarargs(value: js.Object*): Self = StObject.set(x, "subflowOutputs", js.Array(value :_*))
  }
}
