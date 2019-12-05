package typingsSlinky.cssDashTree.cssDashTreeMod

import typingsSlinky.cssDashTree.cssDashTreeStrings.Function
import typingsSlinky.cssDashTree.cssDashTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssDashTree.cssDashTreeMod.AnPlusB
  - typings.cssDashTree.cssDashTreeMod.AtrulePlain
  - typings.cssDashTree.cssDashTreeMod.AtrulePreludePlain
  - typings.cssDashTree.cssDashTreeMod.AttributeSelector
  - typings.cssDashTree.cssDashTreeMod.BlockPlain
  - typings.cssDashTree.cssDashTreeMod.BracketsPlain
  - typings.cssDashTree.cssDashTreeMod.CDC
  - typings.cssDashTree.cssDashTreeMod.CDO
  - typings.cssDashTree.cssDashTreeMod.ClassSelector
  - typings.cssDashTree.cssDashTreeMod.Combinator
  - typings.cssDashTree.cssDashTreeMod.Comment
  - typings.cssDashTree.cssDashTreeMod.DeclarationPlain
  - typings.cssDashTree.cssDashTreeMod.DeclarationListPlain
  - typings.cssDashTree.cssDashTreeMod.Dimension
  - typings.cssDashTree.cssDashTreeMod.FunctionNodePlain
  - typings.cssDashTree.cssDashTreeMod.HexColor
  - typings.cssDashTree.cssDashTreeMod.IdSelector
  - typings.cssDashTree.cssDashTreeMod.Identifier
  - typings.cssDashTree.cssDashTreeMod.MediaFeature
  - typings.cssDashTree.cssDashTreeMod.MediaQueryPlain
  - typings.cssDashTree.cssDashTreeMod.MediaQueryListPlain
  - typings.cssDashTree.cssDashTreeMod.NthPlain
  - typings.cssDashTree.cssDashTreeMod.NumberNode
  - typings.cssDashTree.cssDashTreeMod.Operator
  - typings.cssDashTree.cssDashTreeMod.ParenthesesPlain
  - typings.cssDashTree.cssDashTreeMod.Percentage
  - typings.cssDashTree.cssDashTreeMod.PseudoClassSelectorPlain
  - typings.cssDashTree.cssDashTreeMod.PseudoElementSelectorPlain
  - typings.cssDashTree.cssDashTreeMod.Ratio
  - typings.cssDashTree.cssDashTreeMod.Raw
  - typings.cssDashTree.cssDashTreeMod.RulePlain
  - typings.cssDashTree.cssDashTreeMod.SelectorPlain
  - typings.cssDashTree.cssDashTreeMod.SelectorListPlain
  - typings.cssDashTree.cssDashTreeMod.StringNode
  - typings.cssDashTree.cssDashTreeMod.StyleSheetPlain
  - typings.cssDashTree.cssDashTreeMod.TypeSelector
  - typings.cssDashTree.cssDashTreeMod.UnicodeRange
  - typings.cssDashTree.cssDashTreeMod.Url
  - typings.cssDashTree.cssDashTreeMod.ValuePlain
  - typings.cssDashTree.cssDashTreeMod.WhiteSpace
*/
trait CssNodePlain extends js.Object

object CssNodePlain {
  @scala.inline
  def NthPlain(
    nth: AnPlusB | Identifier,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorListPlain = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoClassSelectorPlain(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.PseudoClassSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.MediaQueryList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Operator(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Operator,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoElementSelectorPlain(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.PseudoElementSelector,
    children: js.Array[CssNodePlain] = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDC(`type`: typingsSlinky.cssDashTree.cssDashTreeStrings.CDC, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationPlain(
    important: Boolean | String,
    property: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Declaration,
    value: ValuePlain | Raw,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ClassSelector(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.ClassSelector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDO(`type`: typingsSlinky.cssDashTree.cssDashTreeStrings.CDO, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def WhiteSpace(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.WhiteSpace,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Combinator(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Combinator,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def IdSelector(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.IdSelector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def TypeSelector(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.TypeSelector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BracketsPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Brackets,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Ratio(
    left: String,
    right: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Ratio,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.MediaQuery,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Selector,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaFeature(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.MediaFeature,
    loc: CssLocation = null,
    value: Identifier | NumberNode | Dimension | Ratio = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def HexColor(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.HexColor,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ValuePlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Value,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def UnicodeRange(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.UnicodeRange,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def FunctionNodePlain(children: js.Array[CssNodePlain], name: String, `type`: Function, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Percentage(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Percentage,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Dimension(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Dimension,
    unit: String,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ParenthesesPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Parentheses,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePreludePlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.AtrulePrelude,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Url(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Url,
    value: StringNode | Raw,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Identifier,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BlockPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Block,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Raw(`type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Raw, value: String, loc: CssLocation = null): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def RulePlain(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Rule,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Comment(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Comment,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AttributeSelector(
    name: Identifier,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.AttributeSelector,
    flags: String = null,
    loc: CssLocation = null,
    matcher: String = null,
    value: StringNode | Identifier = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StringNode(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.String,
    value: String,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StyleSheetPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorListPlain(
    children: js.Array[CssNodePlain],
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.SelectorList,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePlain(
    name: String,
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.Atrule,
    block: BlockPlain = null,
    loc: CssLocation = null,
    prelude: AtrulePreludePlain | Raw = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AnPlusB(
    `type`: typingsSlinky.cssDashTree.cssDashTreeStrings.AnPlusB,
    a: String = null,
    b: String = null,
    loc: CssLocation = null
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
}

