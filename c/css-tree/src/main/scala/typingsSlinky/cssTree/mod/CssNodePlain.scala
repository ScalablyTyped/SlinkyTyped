package typingsSlinky.cssTree.mod

import typingsSlinky.cssTree.cssTreeStrings.Function
import typingsSlinky.cssTree.cssTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssTree.mod.AnPlusB
  - typingsSlinky.cssTree.mod.AtrulePlain
  - typingsSlinky.cssTree.mod.AtrulePreludePlain
  - typingsSlinky.cssTree.mod.AttributeSelector
  - typingsSlinky.cssTree.mod.BlockPlain
  - typingsSlinky.cssTree.mod.BracketsPlain
  - typingsSlinky.cssTree.mod.CDC
  - typingsSlinky.cssTree.mod.CDO
  - typingsSlinky.cssTree.mod.ClassSelector
  - typingsSlinky.cssTree.mod.Combinator
  - typingsSlinky.cssTree.mod.Comment
  - typingsSlinky.cssTree.mod.DeclarationPlain
  - typingsSlinky.cssTree.mod.DeclarationListPlain
  - typingsSlinky.cssTree.mod.Dimension
  - typingsSlinky.cssTree.mod.FunctionNodePlain
  - typingsSlinky.cssTree.mod.HexColor
  - typingsSlinky.cssTree.mod.IdSelector
  - typingsSlinky.cssTree.mod.Identifier
  - typingsSlinky.cssTree.mod.MediaFeature
  - typingsSlinky.cssTree.mod.MediaQueryPlain
  - typingsSlinky.cssTree.mod.MediaQueryListPlain
  - typingsSlinky.cssTree.mod.NthPlain
  - typingsSlinky.cssTree.mod.NumberNode
  - typingsSlinky.cssTree.mod.Operator
  - typingsSlinky.cssTree.mod.ParenthesesPlain
  - typingsSlinky.cssTree.mod.Percentage
  - typingsSlinky.cssTree.mod.PseudoClassSelectorPlain
  - typingsSlinky.cssTree.mod.PseudoElementSelectorPlain
  - typingsSlinky.cssTree.mod.Ratio
  - typingsSlinky.cssTree.mod.Raw
  - typingsSlinky.cssTree.mod.RulePlain
  - typingsSlinky.cssTree.mod.SelectorPlain
  - typingsSlinky.cssTree.mod.SelectorListPlain
  - typingsSlinky.cssTree.mod.StringNode
  - typingsSlinky.cssTree.mod.StyleSheetPlain
  - typingsSlinky.cssTree.mod.TypeSelector
  - typingsSlinky.cssTree.mod.UnicodeRange
  - typingsSlinky.cssTree.mod.Url
  - typingsSlinky.cssTree.mod.ValuePlain
  - typingsSlinky.cssTree.mod.WhiteSpace
*/
trait CssNodePlain extends js.Object

object CssNodePlain {
  @scala.inline
  def BracketsPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Brackets): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationPlain(
    important: Boolean | String,
    property: String,
    `type`: typingsSlinky.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationListPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.DeclarationList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NthPlain(nth: AnPlusB | Identifier, `type`: typingsSlinky.cssTree.cssTreeStrings.Nth): CssNodePlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AttributeSelector(name: Identifier, `type`: typingsSlinky.cssTree.cssTreeStrings.AttributeSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ClassSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.ClassSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AnPlusB(`type`: typingsSlinky.cssTree.cssTreeStrings.AnPlusB): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePlain(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Atrule): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDO(`type`: typingsSlinky.cssTree.cssTreeStrings.CDO): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Url(`type`: typingsSlinky.cssTree.cssTreeStrings.Url, value: StringNode | Raw): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def IdSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.IdSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Combinator(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Combinator): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Percentage(`type`: typingsSlinky.cssTree.cssTreeStrings.Percentage, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def TypeSelector(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.TypeSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ValuePlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Value): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def UnicodeRange(`type`: typingsSlinky.cssTree.cssTreeStrings.UnicodeRange, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryListPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQueryList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ParenthesesPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Parentheses): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Selector): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Dimension(`type`: typingsSlinky.cssTree.cssTreeStrings.Dimension, unit: String, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BlockPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.Block): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Comment(`type`: typingsSlinky.cssTree.cssTreeStrings.Comment, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Raw(`type`: typingsSlinky.cssTree.cssTreeStrings.Raw, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def RulePlain(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: typingsSlinky.cssTree.cssTreeStrings.Rule
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StringNode(`type`: typingsSlinky.cssTree.cssTreeStrings.String, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.MediaQuery): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoElementSelectorPlain(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoElementSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDC(`type`: typingsSlinky.cssTree.cssTreeStrings.CDC): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoClassSelectorPlain(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.PseudoClassSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Identifier): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaFeature(name: String, `type`: typingsSlinky.cssTree.cssTreeStrings.MediaFeature): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorListPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.SelectorList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Operator(`type`: typingsSlinky.cssTree.cssTreeStrings.Operator, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def FunctionNodePlain(children: js.Array[CssNodePlain], name: String, `type`: Function): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePreludePlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.AtrulePrelude): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def HexColor(`type`: typingsSlinky.cssTree.cssTreeStrings.HexColor, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StyleSheetPlain(children: js.Array[CssNodePlain], `type`: typingsSlinky.cssTree.cssTreeStrings.StyleSheet): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Ratio(left: String, right: String, `type`: typingsSlinky.cssTree.cssTreeStrings.Ratio): CssNodePlain = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def WhiteSpace(`type`: typingsSlinky.cssTree.cssTreeStrings.WhiteSpace, value: String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
}

