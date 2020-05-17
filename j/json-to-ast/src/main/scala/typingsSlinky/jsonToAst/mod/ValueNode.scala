package typingsSlinky.jsonToAst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonToAst.mod.ObjectNode
  - typingsSlinky.jsonToAst.mod.ArrayNode
  - typingsSlinky.jsonToAst.mod.LiteralNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  implicit def apply(value: ArrayNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: LiteralNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: ObjectNode): ValueNode = value.asInstanceOf[ValueNode]
}

