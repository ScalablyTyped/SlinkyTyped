package typingsSlinky.ecmarkup.anon

import org.scalajs.dom.raw.Text
import typingsSlinky.ecmarkup.ecmarkupStrings.node
import typingsSlinky.ecmarkup.specMod.Warning
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
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeElement(value: org.scalajs.dom.raw.Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeText(value: Text): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Text | org.scalajs.dom.raw.Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: node): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
