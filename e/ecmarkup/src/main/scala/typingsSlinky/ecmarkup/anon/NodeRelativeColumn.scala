package typingsSlinky.ecmarkup.anon

import org.scalajs.dom.raw.Text
import typingsSlinky.ecmarkup.ecmarkupStrings.contents
import typingsSlinky.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRelativeColumn extends Warning {
  
  var message: String = js.native
  
  var node: Text | org.scalajs.dom.raw.Element = js.native
  
  var nodeRelativeColumn: Double = js.native
  
  var nodeRelativeLine: Double = js.native
  
  var ruleId: String = js.native
  
  var `type`: contents = js.native
}
object NodeRelativeColumn {
  
  @scala.inline
  def apply(
    message: String,
    node: Text | org.scalajs.dom.raw.Element,
    nodeRelativeColumn: Double,
    nodeRelativeLine: Double,
    ruleId: String,
    `type`: contents
  ): NodeRelativeColumn = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRelativeColumn]
  }
  
  @scala.inline
  implicit class NodeRelativeColumnMutableBuilder[Self <: NodeRelativeColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Text | org.scalajs.dom.raw.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeColumn(value: Double): Self = StObject.set(x, "nodeRelativeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRelativeLine(value: Double): Self = StObject.set(x, "nodeRelativeLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeText(value: Text): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: contents): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
