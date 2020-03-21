package typingsSlinky.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestTestResult.jestTestResultStrings.passed
  - typingsSlinky.jestTestResult.jestTestResultStrings.failed
  - typingsSlinky.jestTestResult.jestTestResultStrings.skipped
  - typingsSlinky.jestTestResult.jestTestResultStrings.pending
  - typingsSlinky.jestTestResult.jestTestResultStrings.todo
  - typingsSlinky.jestTestResult.jestTestResultStrings.disabled
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.jestTestResult.jestTestResultStrings.disabled = this.cast("disabled")
  @scala.inline
  def failed: typingsSlinky.jestTestResult.jestTestResultStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsSlinky.jestTestResult.jestTestResultStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsSlinky.jestTestResult.jestTestResultStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsSlinky.jestTestResult.jestTestResultStrings.skipped = this.cast("skipped")
  @scala.inline
  def todo: typingsSlinky.jestTestResult.jestTestResultStrings.todo = this.cast("todo")
}

