package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luaparse.astMod.LabelStatement
  - typingsSlinky.luaparse.astMod.BreakStatement
  - typingsSlinky.luaparse.astMod.GotoStatement
  - typingsSlinky.luaparse.astMod.ReturnStatement
  - typingsSlinky.luaparse.astMod.IfStatement
  - typingsSlinky.luaparse.astMod.WhileStatement
  - typingsSlinky.luaparse.astMod.DoStatement
  - typingsSlinky.luaparse.astMod.RepeatStatement
  - typingsSlinky.luaparse.astMod.LocalStatement
  - typingsSlinky.luaparse.astMod.AssignmentStatement
  - typingsSlinky.luaparse.astMod.CallStatement
  - typingsSlinky.luaparse.astMod.FunctionDeclaration
  - typingsSlinky.luaparse.astMod.ForNumericStatement
  - typingsSlinky.luaparse.astMod.ForGenericStatement
*/
trait Statement extends Node

object Statement {
  @scala.inline
  implicit def apply(value: AssignmentStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: BreakStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: CallStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: DoStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForGenericStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ForNumericStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: GotoStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: IfStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: LabelStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: LocalStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: RepeatStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: ReturnStatement): Statement = value.asInstanceOf[Statement]
  @scala.inline
  implicit def apply(value: WhileStatement): Statement = value.asInstanceOf[Statement]
}

