package typingsSlinky.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Statement extends _Node
object _Statement {
  
  @scala.inline
  def AssignmentStatement(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier]
  ): typingsSlinky.luaparse.astMod.AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.AssignmentStatement]
  }
  
  @scala.inline
  def CallStatement(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typingsSlinky.luaparse.luaparseStrings.CallStatement
  ): typingsSlinky.luaparse.astMod.CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.CallStatement]
  }
  
  @scala.inline
  def DoStatement(body: js.Array[Statement], `type`: typingsSlinky.luaparse.luaparseStrings.DoStatement): typingsSlinky.luaparse.astMod.DoStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.DoStatement]
  }
  
  @scala.inline
  def ForGenericStatement(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier]
  ): typingsSlinky.luaparse.astMod.ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.ForGenericStatement]
  }
  
  @scala.inline
  def ForNumericStatement(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier
  ): typingsSlinky.luaparse.astMod.ForNumericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.ForNumericStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typingsSlinky.luaparse.luaparseStrings.FunctionDeclaration
  ): typingsSlinky.luaparse.astMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.FunctionDeclaration]
  }
  
  @scala.inline
  def GotoStatement(label: Identifier, `type`: typingsSlinky.luaparse.luaparseStrings.GotoStatement): typingsSlinky.luaparse.astMod.GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.GotoStatement]
  }
  
  @scala.inline
  def IfStatement(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typingsSlinky.luaparse.luaparseStrings.IfStatement
  ): typingsSlinky.luaparse.astMod.IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.IfStatement]
  }
  
  @scala.inline
  def LabelStatement(label: Identifier, `type`: typingsSlinky.luaparse.luaparseStrings.LabelStatement): typingsSlinky.luaparse.astMod.LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.LabelStatement]
  }
  
  @scala.inline
  def LocalStatement(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier]
  ): typingsSlinky.luaparse.astMod.LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.LocalStatement]
  }
  
  @scala.inline
  def RepeatStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.RepeatStatement
  ): typingsSlinky.luaparse.astMod.RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.RepeatStatement]
  }
  
  @scala.inline
  def ReturnStatement(arguments: js.Array[Expression], `type`: typingsSlinky.luaparse.luaparseStrings.ReturnStatement): typingsSlinky.luaparse.astMod.ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.ReturnStatement]
  }
  
  @scala.inline
  def WhileStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.WhileStatement
  ): typingsSlinky.luaparse.astMod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.luaparse.astMod.WhileStatement]
  }
}
