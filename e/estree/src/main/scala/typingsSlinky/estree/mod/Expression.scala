package typingsSlinky.estree.mod

import typingsSlinky.estree.anon.Flags
import typingsSlinky.estree.estreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ThisExpression
  - typingsSlinky.estree.mod.ArrayExpression
  - typingsSlinky.estree.mod.ObjectExpression
  - typingsSlinky.estree.mod.FunctionExpression
  - typingsSlinky.estree.mod.ArrowFunctionExpression
  - typingsSlinky.estree.mod.YieldExpression
  - typingsSlinky.estree.mod.Literal
  - typingsSlinky.estree.mod.UnaryExpression
  - typingsSlinky.estree.mod.UpdateExpression
  - typingsSlinky.estree.mod.BinaryExpression
  - typingsSlinky.estree.mod.AssignmentExpression
  - typingsSlinky.estree.mod.LogicalExpression
  - typingsSlinky.estree.mod.MemberExpression
  - typingsSlinky.estree.mod.ConditionalExpression
  - typingsSlinky.estree.mod.CallExpression
  - typingsSlinky.estree.mod.NewExpression
  - typingsSlinky.estree.mod.SequenceExpression
  - typingsSlinky.estree.mod.TemplateLiteral
  - typingsSlinky.estree.mod.TaggedTemplateExpression
  - typingsSlinky.estree.mod.ClassExpression
  - typingsSlinky.estree.mod.MetaProperty
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.AwaitExpression
  - typingsSlinky.estree.mod.ImportExpression
  - typingsSlinky.estree.mod.ChainExpression
*/
trait Expression extends Node
object Expression {
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[Expression | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ArrayExpression
  ): typingsSlinky.estree.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ArrayExpression]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.ArrowFunctionExpression
  ): typingsSlinky.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.AssignmentExpression
  ): typingsSlinky.estree.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.AssignmentExpression]
  }
  
  @scala.inline
  def AwaitExpression(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.AwaitExpression): typingsSlinky.estree.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.AwaitExpression]
  }
  
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: BinaryOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.BinaryExpression
  ): typingsSlinky.estree.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.BinaryExpression]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElement, `type`: typingsSlinky.estree.estreeStrings.ChainExpression): typingsSlinky.estree.mod.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ChainExpression]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassExpression): typingsSlinky.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ConditionalExpression
  ): typingsSlinky.estree.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ConditionalExpression]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionExpression
  ): typingsSlinky.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.FunctionExpression]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.estree.estreeStrings.Identifier): typingsSlinky.estree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.Identifier]
  }
  
  @scala.inline
  def ImportExpression(source: Expression, `type`: typingsSlinky.estree.estreeStrings.ImportExpression): typingsSlinky.estree.mod.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportExpression]
  }
  
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: LogicalOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.LogicalExpression
  ): typingsSlinky.estree.mod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typingsSlinky.estree.estreeStrings.MemberExpression
  ): typingsSlinky.estree.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.MemberExpression]
  }
  
  @scala.inline
  def MetaProperty(meta: Identifier, property: Identifier, `type`: typingsSlinky.estree.estreeStrings.MetaProperty): typingsSlinky.estree.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.MetaProperty]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typingsSlinky.estree.estreeStrings.NewExpression
  ): typingsSlinky.estree.mod.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.NewExpression]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[Property | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectExpression
  ): typingsSlinky.estree.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ObjectExpression]
  }
  
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typingsSlinky.estree.estreeStrings.Literal): typingsSlinky.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.RegExpLiteral]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[Expression], `type`: typingsSlinky.estree.estreeStrings.SequenceExpression): typingsSlinky.estree.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SequenceExpression]
  }
  
  @scala.inline
  def SimpleCallExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.CallExpression
  ): typingsSlinky.estree.mod.SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SimpleCallExpression]
  }
  
  @scala.inline
  def SimpleLiteral(`type`: typingsSlinky.estree.estreeStrings.Literal): typingsSlinky.estree.mod.SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SimpleLiteral]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typingsSlinky.estree.estreeStrings.TaggedTemplateExpression
  ): typingsSlinky.estree.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typingsSlinky.estree.estreeStrings.TemplateLiteral
  ): typingsSlinky.estree.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typingsSlinky.estree.estreeStrings.ThisExpression): typingsSlinky.estree.mod.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ThisExpression]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typingsSlinky.estree.estreeStrings.UnaryExpression
  ): typingsSlinky.estree.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.UnaryExpression]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.UpdateExpression
  ): typingsSlinky.estree.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.UpdateExpression]
  }
  
  @scala.inline
  def YieldExpression(delegate: Boolean, `type`: typingsSlinky.estree.estreeStrings.YieldExpression): typingsSlinky.estree.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.YieldExpression]
  }
}
