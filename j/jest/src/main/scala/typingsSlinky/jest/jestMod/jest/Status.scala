package typingsSlinky.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jest.jestStrings.passed
  - typings.jest.jestStrings.failed
  - typings.jest.jestStrings.skipped
  - typings.jest.jestStrings.pending
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.jest.jestStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsSlinky.jest.jestStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsSlinky.jest.jestStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsSlinky.jest.jestStrings.skipped = this.cast("skipped")
}

