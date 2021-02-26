package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.dom.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndNode extends StObject {
  
  var endNode: node = js.native
  
  var startNode: node = js.native
}
object EndNode {
  
  @scala.inline
  def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
  
  @scala.inline
  implicit class EndNodeMutableBuilder[Self <: EndNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndNode(value: node): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNode(value: node): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
  }
}
