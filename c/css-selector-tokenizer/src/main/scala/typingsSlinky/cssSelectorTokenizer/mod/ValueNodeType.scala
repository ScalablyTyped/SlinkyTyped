package typingsSlinky.cssSelectorTokenizer.mod

import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typingsSlinky.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import org.scalablytyped.runtime.StObject
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
  def CommentNode(content: String, `type`: comment): typingsSlinky.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.CommentNode]
  }
  
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): typingsSlinky.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  @scala.inline
  def ItemNode(name: String, `type`: item): typingsSlinky.cssSelectorTokenizer.mod.ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.ItemNode]
  }
  
  @scala.inline
  def NestedItemNode(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): typingsSlinky.cssSelectorTokenizer.mod.NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.NestedItemNode]
  }
  
  @scala.inline
  def StringNode(stringType: String, `type`: string, value: String): typingsSlinky.cssSelectorTokenizer.mod.StringNode = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.StringNode]
  }
  
  @scala.inline
  def UrlNode(`type`: url, url: String): typingsSlinky.cssSelectorTokenizer.mod.UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.UrlNode]
  }
}
