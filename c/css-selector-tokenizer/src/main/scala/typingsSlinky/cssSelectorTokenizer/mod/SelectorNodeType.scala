package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`class`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-pseudo-class`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-class`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.attribute
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.element
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.id
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.operator
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.spacing
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.universal
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
  def AttributeNode(content: String, `type`: attribute): SelectorNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def ElementNode(name: String, `type`: element): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def ClassNode(name: String, `type`: `class`): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def NestedPseudoClassNode(name: String, nodes: js.Array[SelectorNode], `type`: `nested-pseudo-class`): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def SpacingNode(`type`: spacing, value: String): SelectorNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def OperatorNode(operator: String, `type`: operator): SelectorNodeType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def IdNode(name: String, `type`: id): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment): SelectorNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def UniversalNode(`type`: universal): SelectorNodeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def PseudoElementNode(name: String, `type`: `pseudo-element`): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def PseudoClassNode(name: String, `type`: `pseudo-class`): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): SelectorNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
}

