package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def ItemNode(name: String, `type`: item): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  
  @scala.inline
  def UrlNode(`type`: url, url: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  
  @scala.inline
  def CommentNode(content: String, `type`: comment): ValueNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  
  @scala.inline
  def NestedItemNode(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  
  @scala.inline
  def StringNode(stringType: String, `type`: string, value: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
}
