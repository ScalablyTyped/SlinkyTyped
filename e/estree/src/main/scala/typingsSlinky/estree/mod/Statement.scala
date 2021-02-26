package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.`var`
import typingsSlinky.estree.estreeStrings.const
import typingsSlinky.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ExpressionStatement
  - typingsSlinky.estree.mod.BlockStatement
  - typingsSlinky.estree.mod.EmptyStatement
  - typingsSlinky.estree.mod.DebuggerStatement
  - typingsSlinky.estree.mod.WithStatement
  - typingsSlinky.estree.mod.ReturnStatement
  - typingsSlinky.estree.mod.LabeledStatement
  - typingsSlinky.estree.mod.BreakStatement
  - typingsSlinky.estree.mod.ContinueStatement
  - typingsSlinky.estree.mod.IfStatement
  - typingsSlinky.estree.mod.SwitchStatement
  - typingsSlinky.estree.mod.ThrowStatement
  - typingsSlinky.estree.mod.TryStatement
  - typingsSlinky.estree.mod.WhileStatement
  - typingsSlinky.estree.mod.DoWhileStatement
  - typingsSlinky.estree.mod.ForStatement
  - typingsSlinky.estree.mod.ForInStatement
  - typingsSlinky.estree.mod.ForOfStatement
  - typingsSlinky.estree.mod.Declaration
*/
trait Statement extends Node
object Statement {
  
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
  def ClassDeclaration(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassDeclaration): typingsSlinky.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassDeclaration]
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
  def IfStatement(consequent: Statement, test: Expression, `type`: typingsSlinky.estree.estreeStrings.IfStatement): typingsSlinky.estree.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.IfStatement]
  }
  
  @scala.inline
  def LabeledStatement(body: Statement, label: Identifier, `type`: typingsSlinky.estree.estreeStrings.LabeledStatement): typingsSlinky.estree.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.LabeledStatement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.estree.estreeStrings.ReturnStatement): typingsSlinky.estree.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ReturnStatement]
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
}
