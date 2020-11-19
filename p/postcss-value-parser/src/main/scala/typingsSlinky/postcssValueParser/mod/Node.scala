package typingsSlinky.postcssValueParser.mod

import typingsSlinky.postcssValueParser.postcssValueParserStrings.Apostrophe
import typingsSlinky.postcssValueParser.postcssValueParserStrings.Quotationmark
import typingsSlinky.postcssValueParser.postcssValueParserStrings.`unicode-range`
import typingsSlinky.postcssValueParser.postcssValueParserStrings.comment
import typingsSlinky.postcssValueParser.postcssValueParserStrings.div
import typingsSlinky.postcssValueParser.postcssValueParserStrings.function
import typingsSlinky.postcssValueParser.postcssValueParserStrings.space
import typingsSlinky.postcssValueParser.postcssValueParserStrings.string
import typingsSlinky.postcssValueParser.postcssValueParserStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any node parsed from a CSS value
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.postcssValueParser.mod.CommentNode
  - typingsSlinky.postcssValueParser.mod.DivNode
  - typingsSlinky.postcssValueParser.mod.FunctionNode
  - typingsSlinky.postcssValueParser.mod.SpaceNode
  - typingsSlinky.postcssValueParser.mod.StringNode
  - typingsSlinky.postcssValueParser.mod.UnicodeRangeNode
  - typingsSlinky.postcssValueParser.mod.WordNode
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def CommentNode(sourceIndex: Double, `type`: comment, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UnicodeRangeNode(sourceIndex: Double, `type`: `unicode-range`, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SpaceNode(sourceIndex: Double, `type`: space, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def DivNode(after: String, before: String, sourceIndex: Double, `type`: div, value: String): Node = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def StringNode(quote: Quotationmark | Apostrophe, sourceIndex: Double, `type`: string, value: String): Node = {
    val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def FunctionNode(
    after: String,
    before: String,
    nodes: js.Array[Node],
    sourceIndex: Double,
    `type`: function,
    value: String
  ): Node = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def WordNode(sourceIndex: Double, `type`: word, value: String): Node = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
