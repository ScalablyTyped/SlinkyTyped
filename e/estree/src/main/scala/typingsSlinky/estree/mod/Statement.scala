package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit def apply(value: BlockStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: BreakStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ContinueStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: DebuggerStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: Declaration): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: DoWhileStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: EmptyStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ExpressionStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForInStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForOfStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: IfStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: LabeledStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ReturnStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: SwitchStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ThrowStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: TryStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: WhileStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: WithStatement): Statement = value.asInstanceOf[Statement]
}

