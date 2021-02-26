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
import org.scalablytyped.runtime.StObject
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
trait Node extends StObject
object Node {
  
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
  def ArrayPattern(elements: js.Array[Pattern], `type`: typingsSlinky.estree.estreeStrings.ArrayPattern): typingsSlinky.estree.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ArrayPattern]
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
  def AssignmentPattern(left: Pattern, right: Expression, `type`: typingsSlinky.estree.estreeStrings.AssignmentPattern): typingsSlinky.estree.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.AssignmentPattern]
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
  ): typingsSlinky.estree.mod.AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.AssignmentProperty]
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
  def BlockStatement(body: js.Array[Statement], `type`: typingsSlinky.estree.estreeStrings.BlockStatement): typingsSlinky.estree.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.BlockStatement]
  }
  
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.estree.estreeStrings.BreakStatement): typingsSlinky.estree.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.BreakStatement]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatement, `type`: typingsSlinky.estree.estreeStrings.CatchClause): typingsSlinky.estree.mod.CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.CatchClause]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElement, `type`: typingsSlinky.estree.estreeStrings.ChainExpression): typingsSlinky.estree.mod.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ChainExpression]
  }
  
  @scala.inline
  def ClassBody(body: js.Array[MethodDefinition], `type`: typingsSlinky.estree.estreeStrings.ClassBody): typingsSlinky.estree.mod.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassBody]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassDeclaration): typingsSlinky.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassDeclaration]
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
  def ContinueStatement(`type`: typingsSlinky.estree.estreeStrings.ContinueStatement): typingsSlinky.estree.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ContinueStatement]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typingsSlinky.estree.estreeStrings.DebuggerStatement): typingsSlinky.estree.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.DebuggerStatement]
  }
  
  @scala.inline
  def DoWhileStatement(body: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.DoWhileStatement): typingsSlinky.estree.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.DoWhileStatement]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typingsSlinky.estree.estreeStrings.EmptyStatement): typingsSlinky.estree.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.EmptyStatement]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: Literal, `type`: typingsSlinky.estree.estreeStrings.ExportAllDeclaration): typingsSlinky.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: Declaration | Expression,
    `type`: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration
  ): typingsSlinky.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration(
    specifiers: js.Array[ExportSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ExportNamedDeclaration
  ): typingsSlinky.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ExportSpecifier(
    exported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ExportSpecifier
  ): typingsSlinky.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportSpecifier]
  }
  
  @scala.inline
  def ExpressionStatement(expression: Expression, `type`: typingsSlinky.estree.estreeStrings.ExpressionStatement): typingsSlinky.estree.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExpressionStatement]
  }
  
  @scala.inline
  def ForInStatement(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ForInStatement
  ): typingsSlinky.estree.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ForInStatement]
  }
  
  @scala.inline
  def ForOfStatement(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: Expression,
    `type`: typingsSlinky.estree.estreeStrings.ForOfStatement
  ): typingsSlinky.estree.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ForOfStatement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typingsSlinky.estree.estreeStrings.ForStatement): typingsSlinky.estree.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ForStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionDeclaration
  ): typingsSlinky.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.FunctionDeclaration]
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
  def IfStatement(consequent: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.IfStatement): typingsSlinky.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.IfStatement]
  }
  
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ImportDeclaration
  ): typingsSlinky.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportDeclaration]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): typingsSlinky.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportExpression(source: Expression, `type`: typingsSlinky.estree.estreeStrings.ImportExpression): typingsSlinky.estree.mod.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportExpression]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportNamespaceSpecifier): typingsSlinky.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(
    imported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ImportSpecifier
  ): typingsSlinky.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportSpecifier]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typingsSlinky.estree.estreeStrings.LabeledStatement): typingsSlinky.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.LabeledStatement]
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
  def MethodDefinition(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): typingsSlinky.estree.mod.MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.MethodDefinition]
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
  def ObjectPattern(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typingsSlinky.estree.estreeStrings.ObjectPattern
  ): typingsSlinky.estree.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ObjectPattern]
  }
  
  @scala.inline
  def Program(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: typingsSlinky.estree.estreeStrings.Program
  ): typingsSlinky.estree.mod.Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.Program]
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
  ): typingsSlinky.estree.mod.Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.Property]
  }
  
  @scala.inline
  def RegExpLiteral(regex: Flags, `type`: typingsSlinky.estree.estreeStrings.Literal): typingsSlinky.estree.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.RegExpLiteral]
  }
  
  @scala.inline
  def RestElement(argument: Pattern, `type`: typingsSlinky.estree.estreeStrings.RestElement): typingsSlinky.estree.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.RestElement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.estree.estreeStrings.ReturnStatement): typingsSlinky.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ReturnStatement]
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
  def SpreadElement(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.SpreadElement): typingsSlinky.estree.mod.SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SpreadElement]
  }
  
  @scala.inline
  def Super(`type`: typingsSlinky.estree.estreeStrings.Super): typingsSlinky.estree.mod.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.Super]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[Statement], `type`: typingsSlinky.estree.estreeStrings.SwitchCase): typingsSlinky.estree.mod.SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SwitchCase]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typingsSlinky.estree.estreeStrings.SwitchStatement
  ): typingsSlinky.estree.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.SwitchStatement]
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
  def TemplateElement(tail: Boolean, `type`: typingsSlinky.estree.estreeStrings.TemplateElement, value: Cooked): typingsSlinky.estree.mod.TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.TemplateElement]
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
  def ThrowStatement(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.ThrowStatement): typingsSlinky.estree.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ThrowStatement]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatement, `type`: typingsSlinky.estree.estreeStrings.TryStatement): typingsSlinky.estree.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.TryStatement]
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
  def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typingsSlinky.estree.estreeStrings.VariableDeclaration
  ): typingsSlinky.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarator(id: Pattern, `type`: typingsSlinky.estree.estreeStrings.VariableDeclarator): typingsSlinky.estree.mod.VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.VariableDeclarator]
  }
  
  @scala.inline
  def WhileStatement(body: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.WhileStatement): typingsSlinky.estree.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.WhileStatement]
  }
  
  @scala.inline
  def WithStatement(body: Statement, `object`: Expression, `type`: typingsSlinky.estree.estreeStrings.WithStatement): typingsSlinky.estree.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.WithStatement]
  }
  
  @scala.inline
  def YieldExpression(delegate: Boolean, `type`: typingsSlinky.estree.estreeStrings.YieldExpression): typingsSlinky.estree.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.YieldExpression]
  }
}
