package typingsSlinky.babylonWalk.mod

import typingsSlinky.babelTypes.mod.ArrayExpression_
import typingsSlinky.babelTypes.mod.AssignmentExpression_
import typingsSlinky.babelTypes.mod.BinaryExpression_
import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.BooleanLiteral_
import typingsSlinky.babelTypes.mod.BreakStatement_
import typingsSlinky.babelTypes.mod.CallExpression_
import typingsSlinky.babelTypes.mod.CatchClause_
import typingsSlinky.babelTypes.mod.ConditionalExpression_
import typingsSlinky.babelTypes.mod.ContinueStatement_
import typingsSlinky.babelTypes.mod.DebuggerStatement_
import typingsSlinky.babelTypes.mod.DirectiveLiteral_
import typingsSlinky.babelTypes.mod.Directive_
import typingsSlinky.babelTypes.mod.DoWhileStatement_
import typingsSlinky.babelTypes.mod.EmptyStatement_
import typingsSlinky.babelTypes.mod.ExpressionStatement_
import typingsSlinky.babelTypes.mod.File_
import typingsSlinky.babelTypes.mod.ForInStatement_
import typingsSlinky.babelTypes.mod.ForStatement_
import typingsSlinky.babelTypes.mod.FunctionDeclaration_
import typingsSlinky.babelTypes.mod.FunctionExpression_
import typingsSlinky.babelTypes.mod.Identifier_
import typingsSlinky.babelTypes.mod.IfStatement_
import typingsSlinky.babelTypes.mod.LabeledStatement_
import typingsSlinky.babelTypes.mod.LogicalExpression_
import typingsSlinky.babelTypes.mod.MemberExpression_
import typingsSlinky.babelTypes.mod.NewExpression_
import typingsSlinky.babelTypes.mod.NullLiteral_
import typingsSlinky.babelTypes.mod.NumericLiteral_
import typingsSlinky.babelTypes.mod.ObjectExpression_
import typingsSlinky.babelTypes.mod.ObjectMethod_
import typingsSlinky.babelTypes.mod.ObjectProperty_
import typingsSlinky.babelTypes.mod.Program_
import typingsSlinky.babelTypes.mod.RegExpLiteral_
import typingsSlinky.babelTypes.mod.RestElement_
import typingsSlinky.babelTypes.mod.ReturnStatement_
import typingsSlinky.babelTypes.mod.SequenceExpression_
import typingsSlinky.babelTypes.mod.StringLiteral_
import typingsSlinky.babelTypes.mod.SwitchCase_
import typingsSlinky.babelTypes.mod.SwitchStatement_
import typingsSlinky.babelTypes.mod.ThisExpression_
import typingsSlinky.babelTypes.mod.ThrowStatement_
import typingsSlinky.babelTypes.mod.TryStatement_
import typingsSlinky.babelTypes.mod.UnaryExpression_
import typingsSlinky.babelTypes.mod.UpdateExpression_
import typingsSlinky.babelTypes.mod.VariableDeclaration_
import typingsSlinky.babelTypes.mod.VariableDeclarator_
import typingsSlinky.babelTypes.mod.WhileStatement_
import typingsSlinky.babelTypes.mod.WithStatement_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ArrayExpression_
  - typingsSlinky.babelTypes.mod.AssignmentExpression_
  - typingsSlinky.babelTypes.mod.BinaryExpression_
  - typingsSlinky.babelTypes.mod.Directive_
  - typingsSlinky.babelTypes.mod.DirectiveLiteral_
  - typingsSlinky.babelTypes.mod.BlockStatement_
  - typingsSlinky.babelTypes.mod.BreakStatement_
  - typingsSlinky.babelTypes.mod.CallExpression_
  - typingsSlinky.babelTypes.mod.CatchClause_
  - typingsSlinky.babelTypes.mod.ConditionalExpression_
  - typingsSlinky.babelTypes.mod.ContinueStatement_
  - typingsSlinky.babelTypes.mod.DebuggerStatement_
  - typingsSlinky.babelTypes.mod.DoWhileStatement_
  - typingsSlinky.babelTypes.mod.EmptyStatement_
  - typingsSlinky.babelTypes.mod.ExpressionStatement_
  - typingsSlinky.babelTypes.mod.File_
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForStatement_
  - typingsSlinky.babelTypes.mod.FunctionDeclaration_
  - typingsSlinky.babelTypes.mod.FunctionExpression_
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.IfStatement_
  - typingsSlinky.babelTypes.mod.LabeledStatement_
  - typingsSlinky.babelTypes.mod.StringLiteral_
  - typingsSlinky.babelTypes.mod.NumericLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.RegExpLiteral_
  - typingsSlinky.babelTypes.mod.LogicalExpression_
  - typingsSlinky.babelTypes.mod.MemberExpression_
  - typingsSlinky.babelTypes.mod.NewExpression_
  - typingsSlinky.babelTypes.mod.Program_
  - typingsSlinky.babelTypes.mod.ObjectExpression_
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.ObjectProperty_
  - typingsSlinky.babelTypes.mod.RestElement_
  - typingsSlinky.babelTypes.mod.ReturnStatement_
  - typingsSlinky.babelTypes.mod.SequenceExpression_
  - typingsSlinky.babelTypes.mod.SwitchCase_
  - typingsSlinky.babelTypes.mod.SwitchStatement_
  - typingsSlinky.babelTypes.mod.ThisExpression_
  - typingsSlinky.babelTypes.mod.ThrowStatement_
  - typingsSlinky.babelTypes.mod.TryStatement_
  - typingsSlinky.babelTypes.mod.UnaryExpression_
  - typingsSlinky.babelTypes.mod.UpdateExpression_
  - typingsSlinky.babelTypes.mod.VariableDeclaration_
  - typingsSlinky.babelTypes.mod.VariableDeclarator_
  - typingsSlinky.babelTypes.mod.WhileStatement_
  - typingsSlinky.babelTypes.mod.WithStatement_
*/
trait coreTypes extends NodeTypes

object coreTypes {
  @scala.inline
  implicit def apply(value: ArrayExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: AssignmentExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: BinaryExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: BlockStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: BooleanLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: BreakStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: CallExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: CatchClause_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ConditionalExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ContinueStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: DebuggerStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: DirectiveLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: Directive_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: DoWhileStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: EmptyStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ExpressionStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: File_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ForInStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ForStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: FunctionDeclaration_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: FunctionExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: Identifier_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: IfStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: LabeledStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: LogicalExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: MemberExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: NewExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: NullLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: NumericLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ObjectExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ObjectMethod_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ObjectProperty_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: Program_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: RegExpLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: RestElement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ReturnStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: SequenceExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: StringLiteral_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: SwitchCase_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: SwitchStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ThisExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: ThrowStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: TryStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: UnaryExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: UpdateExpression_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: VariableDeclaration_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: VariableDeclarator_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: WhileStatement_): coreTypes = value.asInstanceOf[coreTypes]
  @scala.inline
  implicit def apply(value: WithStatement_): coreTypes = value.asInstanceOf[coreTypes]
}

