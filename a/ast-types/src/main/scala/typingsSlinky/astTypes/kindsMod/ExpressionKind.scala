package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.astTypesStrings.Ampersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandAmpersand
import typingsSlinky.astTypes.astTypesStrings.AmpersandEqualssign
import typingsSlinky.astTypes.astTypesStrings.Asterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsterisk
import typingsSlinky.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.AsteriskEqualssign
import typingsSlinky.astTypes.astTypesStrings.Equalssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Exclamationmark
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Greaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Lessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansign
import typingsSlinky.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Percentsign
import typingsSlinky.astTypes.astTypesStrings.PercentsignEqualssign
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.PlussignEqualssign
import typingsSlinky.astTypes.astTypesStrings.PlussignPlussign
import typingsSlinky.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.astTypes.astTypesStrings.Slash
import typingsSlinky.astTypes.astTypesStrings.SlashEqualssign
import typingsSlinky.astTypes.astTypesStrings.Tilde
import typingsSlinky.astTypes.astTypesStrings.Verticalline
import typingsSlinky.astTypes.astTypesStrings.VerticallineEqualssign
import typingsSlinky.astTypes.astTypesStrings.VerticallineVerticalline
import typingsSlinky.astTypes.astTypesStrings.^
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.astTypesStrings.`-Equalssign`
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.`^Equalssign`
import typingsSlinky.astTypes.astTypesStrings.delete
import typingsSlinky.astTypes.astTypesStrings.in
import typingsSlinky.astTypes.astTypesStrings.instanceof
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
*/
trait ExpressionKind extends StObject
object ExpressionKind {
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrowFunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  }
  
  @scala.inline
  def AwaitExpression(`type`: typingsSlinky.astTypes.astTypesStrings.AwaitExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  }
  
  @scala.inline
  def BigIntLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | ^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.BinaryExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  }
  
  @scala.inline
  def BindExpression(callee: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.BindExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.CallExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElementKind, `type`: typingsSlinky.astTypes.astTypesStrings.ChainExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBodyKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression]
  }
  
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  }
  
  @scala.inline
  def DirectiveLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.DirectiveLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  }
  
  @scala.inline
  def DoExpression(body: js.Array[StatementKind], `type`: typingsSlinky.astTypes.astTypesStrings.DoExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.FunctionExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.GeneratorExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.Identifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def Import(`type`: typingsSlinky.astTypes.astTypesStrings.Import): typingsSlinky.astTypes.namedTypesMod.namedTypes.Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Import]
  }
  
  @scala.inline
  def ImportExpression(source: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ImportExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression]
  }
  
  @scala.inline
  def JSXElement(openingElement: JSXOpeningElementKind, `type`: typingsSlinky.astTypes.astTypesStrings.JSXElement): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind | JSXEmptyExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXExpressionContainer
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    closingFragment: JSXClosingFragmentKind,
    openingFragment: JSXOpeningFragmentKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXFragment
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.JSXIdentifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXText(`type`: typingsSlinky.astTypes.astTypesStrings.JSXText, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  @scala.inline
  def Literal(`type`: typingsSlinky.astTypes.astTypesStrings.Literal): typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.LogicalExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.MetaProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.NewExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression]
  }
  
  @scala.inline
  def NullLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NullLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral, value: Double): typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  }
  
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalCallExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
  
  @scala.inline
  def OptionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
  
  @scala.inline
  def ParenthesizedExpression(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.ParenthesizedExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.PrivateName): typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral): typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  @scala.inline
  def SequenceExpression(
    expressions: js.Array[ExpressionKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.SequenceExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
  
  @scala.inline
  def Super(`type`: typingsSlinky.astTypes.astTypesStrings.Super): typingsSlinky.astTypes.namedTypesMod.namedTypes.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Super]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSNonNullExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TaggedTemplateExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TemplateLiteral
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typingsSlinky.astTypes.astTypesStrings.ThisExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression]
  }
  
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    `type`: typingsSlinky.astTypes.astTypesStrings.UnaryExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.UpdateExpression
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  }
  
  @scala.inline
  def YieldExpression(`type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression]
  }
}
