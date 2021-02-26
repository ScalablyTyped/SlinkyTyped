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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def AttributeNode(content: String, `type`: attribute): typingsSlinky.cssSelectorTokenizer.mod.AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.AttributeNode]
  }
  
  @scala.inline
  def ClassNode(name: String, `type`: `class`): typingsSlinky.cssSelectorTokenizer.mod.ClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.ClassNode]
  }
  
  @scala.inline
  def CommentNode(content: String, `type`: comment): typingsSlinky.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.CommentNode]
  }
  
  @scala.inline
  def ElementNode(name: String, `type`: element): typingsSlinky.cssSelectorTokenizer.mod.ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.ElementNode]
  }
  
  @scala.inline
  def IdNode(name: String, `type`: id): typingsSlinky.cssSelectorTokenizer.mod.IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.IdNode]
  }
  
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): typingsSlinky.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  @scala.inline
  def NestedPseudoClassNode(name: String, nodes: js.Array[SelectorNode], `type`: `nested-pseudo-class`): typingsSlinky.cssSelectorTokenizer.mod.NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.NestedPseudoClassNode]
  }
  
  @scala.inline
  def OperatorNode(operator: String, `type`: operator): typingsSlinky.cssSelectorTokenizer.mod.OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.OperatorNode]
  }
  
  @scala.inline
  def PseudoClassNode(name: String, `type`: `pseudo-class`): typingsSlinky.cssSelectorTokenizer.mod.PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.PseudoClassNode]
  }
  
  @scala.inline
  def PseudoElementNode(name: String, `type`: `pseudo-element`): typingsSlinky.cssSelectorTokenizer.mod.PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.PseudoElementNode]
  }
  
  @scala.inline
  def SpacingNode(`type`: spacing, value: String): typingsSlinky.cssSelectorTokenizer.mod.SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.SpacingNode]
  }
  
  @scala.inline
  def UniversalNode(`type`: universal): typingsSlinky.cssSelectorTokenizer.mod.UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.cssSelectorTokenizer.mod.UniversalNode]
  }
}
