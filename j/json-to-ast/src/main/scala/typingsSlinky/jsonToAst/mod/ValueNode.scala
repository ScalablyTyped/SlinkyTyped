package typingsSlinky.jsonToAst.mod

import typingsSlinky.jsonToAst.jsonToAstStrings.Array
import typingsSlinky.jsonToAst.jsonToAstStrings.Literal
import typingsSlinky.jsonToAst.jsonToAstStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonToAst.mod.ObjectNode
  - typingsSlinky.jsonToAst.mod.ArrayNode
  - typingsSlinky.jsonToAst.mod.LiteralNode
*/
trait ValueNode extends js.Object
object ValueNode {
  
  @scala.inline
  def ObjectNode(children: js.Array[PropertyNode], `type`: Object): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def ArrayNode(children: js.Array[ValueNode], `type`: Array): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def LiteralNode(raw: String, `type`: Literal): ValueNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}
