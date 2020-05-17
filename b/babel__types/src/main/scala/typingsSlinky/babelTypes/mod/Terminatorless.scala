package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BreakStatement_
  - typingsSlinky.babelTypes.mod.ContinueStatement_
  - typingsSlinky.babelTypes.mod.ReturnStatement_
  - typingsSlinky.babelTypes.mod.ThrowStatement_
  - typingsSlinky.babelTypes.mod.YieldExpression_
  - typingsSlinky.babelTypes.mod.AwaitExpression_
*/
trait Terminatorless extends Node

object Terminatorless {
  @scala.inline
  implicit def apply(value: AwaitExpression_): Terminatorless = value.asInstanceOf[Terminatorless]
  @scala.inline
  implicit def apply(value: BreakStatement_): Terminatorless = value.asInstanceOf[Terminatorless]
  @scala.inline
  implicit def apply(value: ContinueStatement_): Terminatorless = value.asInstanceOf[Terminatorless]
  @scala.inline
  implicit def apply(value: ReturnStatement_): Terminatorless = value.asInstanceOf[Terminatorless]
  @scala.inline
  implicit def apply(value: ThrowStatement_): Terminatorless = value.asInstanceOf[Terminatorless]
  @scala.inline
  implicit def apply(value: YieldExpression_): Terminatorless = value.asInstanceOf[Terminatorless]
}

