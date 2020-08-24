package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.values
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
  def ItemNode(name: String, `type`: item): AnyValueNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def UrlNode(`type`: url, url: String): AnyValueNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment): AnyValueNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def ValuesNode(nodes: js.Array[ValueNode], `type`: values): AnyValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): AnyValueNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def NestedItemNode(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): AnyValueNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def StringNode(stringType: String, `type`: string, value: String): AnyValueNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
  @scala.inline
  def ValueNode(nodes: js.Array[ValueNodeType], `type`: value): AnyValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyValueNode]
  }
}

