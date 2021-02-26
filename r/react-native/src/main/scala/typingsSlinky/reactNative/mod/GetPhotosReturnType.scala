package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Hasnextpage
import typingsSlinky.reactNative.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhotosReturnType extends StObject {
  
  var edges: js.Array[Node] = js.native
  
  var page_info: Hasnextpage = js.native
}
object GetPhotosReturnType {
  
  @scala.inline
  def apply(edges: js.Array[Node], page_info: Hasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosReturnType]
  }
  
  @scala.inline
  implicit class GetPhotosReturnTypeMutableBuilder[Self <: GetPhotosReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[Node]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: Node*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setPage_info(value: Hasnextpage): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
  }
}
