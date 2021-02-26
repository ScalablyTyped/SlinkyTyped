package typingsSlinky.ink.anon

import typingsSlinky.ink.domMod.NodeNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeName extends StObject {
  
  var nodeName: NodeNames = js.native
}
object NodeName {
  
  @scala.inline
  def apply(nodeName: NodeNames): NodeName = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
  
  @scala.inline
  implicit class NodeNameMutableBuilder[Self <: NodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeName(value: NodeNames): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
