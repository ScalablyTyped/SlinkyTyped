package typingsSlinky.cssSelectorTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssSelectorTokenizer.mod.ItemNode
  - typingsSlinky.cssSelectorTokenizer.mod.NestedItemNode
  - typingsSlinky.cssSelectorTokenizer.mod.StringNode
  - typingsSlinky.cssSelectorTokenizer.mod.CommentNode
  - typingsSlinky.cssSelectorTokenizer.mod.UrlNode
  - typingsSlinky.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType extends AnyValueNode

object ValueNodeType {
  @scala.inline
  implicit def apply(value: CommentNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
  @scala.inline
  implicit def apply(value: InvalidNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
  @scala.inline
  implicit def apply(value: ItemNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
  @scala.inline
  implicit def apply(value: NestedItemNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
  @scala.inline
  implicit def apply(value: StringNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
  @scala.inline
  implicit def apply(value: UrlNode): ValueNodeType = value.asInstanceOf[ValueNodeType]
}

