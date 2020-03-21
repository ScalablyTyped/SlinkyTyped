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
  def AttributeNode(
    content: String,
    `type`: attribute,
    after: String = null,
    before: String = null,
    name: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def ElementNode(
    name: String,
    `type`: element,
    after: String = null,
    before: String = null,
    namespace: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def ClassNode(name: String, `type`: `class`, after: String = null, before: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def NestedPseudoClassNode(
    name: String,
    nodes: js.Array[SelectorNode],
    `type`: `nested-pseudo-class`,
    after: String = null,
    before: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def SpacingNode(`type`: spacing, value: String, after: String = null, before: String = null, name: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def OperatorNode(
    operator: String,
    `type`: operator,
    after: String = null,
    before: String = null,
    name: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def IdNode(name: String, `type`: id, after: String = null, before: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment, after: String = null, before: String = null, name: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def UniversalNode(
    `type`: universal,
    after: String = null,
    before: String = null,
    name: String = null,
    namespace: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def PseudoElementNode(name: String, `type`: `pseudo-element`, after: String = null, before: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def PseudoClassNode(
    name: String,
    `type`: `pseudo-class`,
    after: String = null,
    before: String = null,
    content: String = null
  ): SelectorNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
  @scala.inline
  def InvalidNode(`type`: invalid, value: String, after: String = null, before: String = null, name: String = null): SelectorNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNodeType]
  }
}

