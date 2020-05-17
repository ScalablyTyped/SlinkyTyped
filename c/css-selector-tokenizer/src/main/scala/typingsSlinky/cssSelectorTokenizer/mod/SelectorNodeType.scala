package typingsSlinky.cssSelectorTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssSelectorTokenizer.mod.ElementNode
  - typingsSlinky.cssSelectorTokenizer.mod.ClassNode
  - typingsSlinky.cssSelectorTokenizer.mod.SpacingNode
  - typingsSlinky.cssSelectorTokenizer.mod.IdNode
  - typingsSlinky.cssSelectorTokenizer.mod.PseudoClassNode
  - typingsSlinky.cssSelectorTokenizer.mod.NestedPseudoClassNode
  - typingsSlinky.cssSelectorTokenizer.mod.UniversalNode
  - typingsSlinky.cssSelectorTokenizer.mod.AttributeNode
  - typingsSlinky.cssSelectorTokenizer.mod.CommentNode
  - typingsSlinky.cssSelectorTokenizer.mod.OperatorNode
  - typingsSlinky.cssSelectorTokenizer.mod.InvalidNode
  - typingsSlinky.cssSelectorTokenizer.mod.PseudoElementNode
*/
trait SelectorNodeType extends AnySelectorNode

object SelectorNodeType {
  @scala.inline
  implicit def apply(value: AttributeNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: ClassNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: CommentNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: ElementNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: IdNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: InvalidNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: NestedPseudoClassNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: OperatorNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: PseudoClassNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: PseudoElementNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: SpacingNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
  @scala.inline
  implicit def apply(value: UniversalNode): SelectorNodeType = value.asInstanceOf[SelectorNodeType]
}

