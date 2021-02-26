package typingsSlinky.ecmarkup.anon

import org.scalajs.dom.raw.Text
import typingsSlinky.ecmarkup.ecmarkupStrings.node
import typingsSlinky.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends Warning {
  
  var message: String = js.native
  
  var node: Text | org.scalajs.dom.raw.Element = js.native
  
  var ruleId: String = js.native
  
  var `type`: node = js.native
}
object Node {
  
  @scala.inline
  def apply(message: String, node: Text | org.scalajs.dom.raw.Element, ruleId: String, `type`: node): Node = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Text | org.scalajs.dom.raw.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeText(value: Text): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
