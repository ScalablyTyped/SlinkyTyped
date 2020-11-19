package typingsSlinky.estree.mod

import typingsSlinky.estree.anon.Cooked
import typingsSlinky.estree.anon.Flags
import typingsSlinky.estree.estreeBooleans.`true`
import typingsSlinky.estree.estreeStrings.`var`
import typingsSlinky.estree.estreeStrings.const
import typingsSlinky.estree.estreeStrings.constructor
import typingsSlinky.estree.estreeStrings.get
import typingsSlinky.estree.estreeStrings.init
import typingsSlinky.estree.estreeStrings.let
import typingsSlinky.estree.estreeStrings.method
import typingsSlinky.estree.estreeStrings.module
import typingsSlinky.estree.estreeStrings.script
import typingsSlinky.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.Literal
  - typingsSlinky.estree.mod.Program
  - typingsSlinky.estree.mod.Function
  - typingsSlinky.estree.mod.SwitchCase
  - typingsSlinky.estree.mod.CatchClause
  - typingsSlinky.estree.mod.VariableDeclarator
  - typingsSlinky.estree.mod.Statement
  - typingsSlinky.estree.mod.Expression
  - typingsSlinky.estree.mod.Property
  - typingsSlinky.estree.mod.AssignmentProperty
  - typingsSlinky.estree.mod.Super
  - typingsSlinky.estree.mod.TemplateElement
  - typingsSlinky.estree.mod.SpreadElement
  - typingsSlinky.estree.mod.Pattern
  - typingsSlinky.estree.mod.ClassBody
  - typingsSlinky.estree.mod.Class
  - typingsSlinky.estree.mod.MethodDefinition
  - typingsSlinky.estree.mod.ModuleDeclaration
  - typingsSlinky.estree.mod.ModuleSpecifier
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def WithStatement(body: Statement, `object`: Expression, `type`: typingsSlinky.estree.estreeStrings.WithStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SimpleCallExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    optional: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.CallExpression
  ): Node = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: LogicalOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.LogicalExpression
  ): Node = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ImportSpecifier(
    imported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ImportSpecifier
  ): Node = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Program(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: typingsSlinky.estree.estreeStrings.Program
  ): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ThisExpression(`type`: typingsSlinky.estree.estreeStrings.ThisExpression): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def DoWhileStatement(body: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.DoWhileStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[Property | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectExpression
  ): Node = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassExpression): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typingsSlinky.estree.estreeStrings.TemplateLiteral
  ): Node = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ArrayPattern(elements: js.Array[Pattern], `type`: typingsSlinky.estree.estreeStrings.ArrayPattern): Node = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typingsSlinky.estree.estreeStrings.ForStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typingsSlinky.estree.estreeStrings.VariableDeclaration
  ): Node = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectPattern
  ): Node = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ConditionalExpression
  ): Node = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def YieldExpression(delegate: Boolean, `type`: typingsSlinky.estree.estreeStrings.YieldExpression): Node = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Property(
    computed: Boolean,
    key: Expression,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.Property,
    value: Expression | Pattern
  ): Node = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: Expression,
    operator: UpdateOperator,
    prefix: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.UpdateExpression
  ): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ImportExpression(source: Expression, `type`: typingsSlinky.estree.estreeStrings.ImportExpression): Node = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typingsSlinky.estree.estreeStrings.Literal): Node = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ExportNamedDeclaration(
    specifiers: js.Array[ExportSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ExportNamedDeclaration
  ): Node = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): Node = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.AssignmentExpression
  ): Node = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: Literal, `type`: typingsSlinky.estree.estreeStrings.ExportAllDeclaration): Node = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[Statement], `type`: typingsSlinky.estree.estreeStrings.BlockStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def MetaProperty(meta: Identifier, property: Identifier, `type`: typingsSlinky.estree.estreeStrings.MetaProperty): Node = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typingsSlinky.estree.estreeStrings.TaggedTemplateExpression
  ): Node = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: Declaration | Expression,
    `type`: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration
  ): Node = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[Statement], `type`: typingsSlinky.estree.estreeStrings.SwitchCase): Node = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SimpleLiteral(`type`: typingsSlinky.estree.estreeStrings.Literal): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def AssignmentProperty(
    computed: Boolean,
    key: Expression,
    kind: init,
    method: Boolean,
    shorthand: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.Property,
    value: Pattern
  ): Node = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatement, `type`: typingsSlinky.estree.estreeStrings.TryStatement): Node = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typingsSlinky.estree.estreeStrings.UnaryExpression
  ): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.estree.estreeStrings.BreakStatement): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ThrowStatement(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.ThrowStatement): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def MethodDefinition(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): Node = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typingsSlinky.estree.estreeStrings.RestElement): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ImportDeclaration
  ): Node = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def VariableDeclarator(id: Pattern, `type`: typingsSlinky.estree.estreeStrings.VariableDeclarator): Node = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SpreadElement(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.SpreadElement): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typingsSlinky.estree.estreeStrings.AssignmentPattern): Node = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionDeclaration
  ): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionExpression
  ): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typingsSlinky.estree.estreeStrings.DebuggerStatement): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ExpressionStatement(expression: Expression, `type`: typingsSlinky.estree.estreeStrings.ExpressionStatement): Node = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ForInStatement(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ForInStatement
  ): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportNamespaceSpecifier): Node = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Super(`type`: typingsSlinky.estree.estreeStrings.Super): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[Expression], `type`: typingsSlinky.estree.estreeStrings.SequenceExpression): Node = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.estree.estreeStrings.Identifier): Node = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElement, `type`: typingsSlinky.estree.estreeStrings.ChainExpression): Node = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassDeclaration): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typingsSlinky.estree.estreeStrings.ContinueStatement): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def IfStatement(consequent: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.IfStatement): Node = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def AwaitExpression(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.AwaitExpression): Node = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ForOfStatement(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ForOfStatement
  ): Node = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatement, `type`: typingsSlinky.estree.estreeStrings.CatchClause): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: BinaryOperator,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.BinaryExpression
  ): Node = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TemplateElement(tail: Boolean, `type`: typingsSlinky.estree.estreeStrings.TemplateElement, value: Cooked): Node = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[Expression | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ArrayExpression
  ): Node = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ClassBody(body: js.Array[MethodDefinition], `type`: typingsSlinky.estree.estreeStrings.ClassBody): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def MemberExpression(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression,
    `type`: typingsSlinky.estree.estreeStrings.MemberExpression
  ): Node = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def WhileStatement(body: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.WhileStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typingsSlinky.estree.estreeStrings.SwitchStatement
  ): Node = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typingsSlinky.estree.estreeStrings.NewExpression
  ): Node = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.estree.estreeStrings.ReturnStatement): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ExportSpecifier(
    exported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ExportSpecifier
  ): Node = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.ArrowFunctionExpression
  ): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typingsSlinky.estree.estreeStrings.EmptyStatement): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typingsSlinky.estree.estreeStrings.LabeledStatement): Node = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
