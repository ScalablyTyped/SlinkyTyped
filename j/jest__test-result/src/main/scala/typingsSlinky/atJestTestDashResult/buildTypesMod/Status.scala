package typingsSlinky.atJestTestDashResult.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJestTestDashResult.atJestTestDashResultStrings.passed
  - typings.atJestTestDashResult.atJestTestDashResultStrings.failed
  - typings.atJestTestDashResult.atJestTestDashResultStrings.skipped
  - typings.atJestTestDashResult.atJestTestDashResultStrings.pending
  - typings.atJestTestDashResult.atJestTestDashResultStrings.todo
  - typings.atJestTestDashResult.atJestTestDashResultStrings.disabled
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.disabled = this.cast("disabled")
  @scala.inline
  def failed: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.skipped = this.cast("skipped")
  @scala.inline
  def todo: typingsSlinky.atJestTestDashResult.atJestTestDashResultStrings.todo = this.cast("todo")
}

