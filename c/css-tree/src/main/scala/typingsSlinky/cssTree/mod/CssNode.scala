package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.Function
import typingsSlinky.cssTree.cssTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssTree.mod.AnPlusB
  - typingsSlinky.cssTree.mod.Atrule
  - typingsSlinky.cssTree.mod.AtrulePrelude
  - typingsSlinky.cssTree.mod.AttributeSelector
  - typingsSlinky.cssTree.mod.Block
  - typingsSlinky.cssTree.mod.Brackets
  - typingsSlinky.cssTree.mod.CDC
  - typingsSlinky.cssTree.mod.CDO
  - typingsSlinky.cssTree.mod.ClassSelector
  - typingsSlinky.cssTree.mod.Combinator
  - typingsSlinky.cssTree.mod.Comment
  - typingsSlinky.cssTree.mod.Declaration
  - typingsSlinky.cssTree.mod.DeclarationList
  - typingsSlinky.cssTree.mod.Dimension
  - typingsSlinky.cssTree.mod.FunctionNode
  - typingsSlinky.cssTree.mod.HexColor
  - typingsSlinky.cssTree.mod.IdSelector
  - typingsSlinky.cssTree.mod.Identifier
  - typingsSlinky.cssTree.mod.MediaFeature
  - typingsSlinky.cssTree.mod.MediaQuery
  - typingsSlinky.cssTree.mod.MediaQueryList
  - typingsSlinky.cssTree.mod.Nth
  - typingsSlinky.cssTree.mod.NumberNode
  - typingsSlinky.cssTree.mod.Operator
  - typingsSlinky.cssTree.mod.Parentheses
  - typingsSlinky.cssTree.mod.Percentage
  - typingsSlinky.cssTree.mod.PseudoClassSelector
  - typingsSlinky.cssTree.mod.PseudoElementSelector
  - typingsSlinky.cssTree.mod.Ratio
  - typingsSlinky.cssTree.mod.Raw
  - typingsSlinky.cssTree.mod.Rule
  - typingsSlinky.cssTree.mod.Selector
  - typingsSlinky.cssTree.mod.SelectorList
  - typingsSlinky.cssTree.mod.StringNode
  - typingsSlinky.cssTree.mod.StyleSheet
  - typingsSlinky.cssTree.mod.TypeSelector
  - typingsSlinky.cssTree.mod.UnicodeRange
  - typingsSlinky.cssTree.mod.Url
  - typingsSlinky.cssTree.mod.Value
  - typingsSlinky.cssTree.mod.WhiteSpace
*/
trait CssNode extends js.Object
object CssNode {
  
  @scala.inline
  def MediaQuery(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQuery): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Selector(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.Selector): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def DeclarationList(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.DeclarationList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def AttributeSelector(name: Identifier, `type`: typingsSlinky.cssTree.cssTreeStrings.AttributeSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def ClassSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.ClassSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def AnPlusB(`type`: typingsSlinky.cssTree.cssTreeStrings.AnPlusB): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def CDO(`type`: typingsSlinky.cssTree.cssTreeStrings.CDO): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Url(`type`: typingsSlinky.cssTree.cssTreeStrings.Url, value: StringNode | Raw): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def FunctionNode(children: List[CssNode], name: String, `type`: Function): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def IdSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.IdSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Combinator(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Combinator): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def PseudoClassSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoClassSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Percentage(`type`: typingsSlinky.cssTree.cssTreeStrings.Percentage, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Parentheses(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.Parentheses): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def TypeSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.TypeSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def UnicodeRange(`type`: typingsSlinky.cssTree.cssTreeStrings.UnicodeRange, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Declaration(
    important: Boolean | String,
    property: String,
    `type`: typingsSlinky.cssTree.cssTreeStrings.Declaration,
    value: Value | Raw
  ): CssNode = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def PseudoElementSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Nth(nth: AnPlusB | Identifier, `type`: typingsSlinky.cssTree.cssTreeStrings.Nth): CssNode = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Atrule(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Atrule): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Dimension(`type`: typingsSlinky.cssTree.cssTreeStrings.Dimension, unit: String, value: String): CssNode = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Comment(`type`: typingsSlinky.cssTree.cssTreeStrings.Comment, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Raw(`type`: typingsSlinky.cssTree.cssTreeStrings.Raw, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def MediaQueryList(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Brackets(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.Brackets): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def StringNode(`type`: typingsSlinky.cssTree.cssTreeStrings.String, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def StyleSheet(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.StyleSheet): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def CDC(`type`: typingsSlinky.cssTree.cssTreeStrings.CDC): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Block(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.Block): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Identifier): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def NumberNode(`type`: Number, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def MediaFeature(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.MediaFeature): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Operator(`type`: typingsSlinky.cssTree.cssTreeStrings.Operator, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Rule(block: Block, prelude: SelectorList | Raw, `type`: typingsSlinky.cssTree.cssTreeStrings.Rule): CssNode = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def HexColor(`type`: typingsSlinky.cssTree.cssTreeStrings.HexColor, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def AtrulePrelude(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.AtrulePrelude): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def SelectorList(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.SelectorList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Ratio(left: String, right: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Ratio): CssNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def Value(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.Value): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  
  @scala.inline
  def WhiteSpace(`type`: typingsSlinky.cssTree.cssTreeStrings.WhiteSpace, value: String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
}
