package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BreakStatement_
  - typingsSlinky.babelTypes.mod.ContinueStatement_
  - typingsSlinky.babelTypes.mod.ReturnStatement_
  - typingsSlinky.babelTypes.mod.ThrowStatement_
*/
trait CompletionStatement extends Node

object CompletionStatement {
  @scala.inline
  implicit def apply(value: BreakStatement_): CompletionStatement = value.asInstanceOf[CompletionStatement]
  @scala.inline
  implicit def apply(value: ContinueStatement_): CompletionStatement = value.asInstanceOf[CompletionStatement]
  @scala.inline
  implicit def apply(value: ReturnStatement_): CompletionStatement = value.asInstanceOf[CompletionStatement]
  @scala.inline
  implicit def apply(value: ThrowStatement_): CompletionStatement = value.asInstanceOf[CompletionStatement]
}

