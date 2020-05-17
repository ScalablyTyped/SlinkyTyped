package typingsSlinky.cssSelectorTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssSelectorTokenizer.mod.ValuesNode
  - typingsSlinky.cssSelectorTokenizer.mod.ValueNode
  - typingsSlinky.cssSelectorTokenizer.mod.ValueNodeType
*/
trait AnyValueNode extends js.Object

object AnyValueNode {
  @scala.inline
  implicit def apply(value: ValueNode): AnyValueNode = value.asInstanceOf[AnyValueNode]
  @scala.inline
  implicit def apply(value: ValueNodeType): AnyValueNode = value.asInstanceOf[AnyValueNode]
  @scala.inline
  implicit def apply(value: ValuesNode): AnyValueNode = value.asInstanceOf[AnyValueNode]
}

