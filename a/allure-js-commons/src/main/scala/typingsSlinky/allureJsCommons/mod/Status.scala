package typingsSlinky.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.allureJsCommons.allureJsCommonsStrings.passed
  - typingsSlinky.allureJsCommons.allureJsCommonsStrings.pending
  - typingsSlinky.allureJsCommons.allureJsCommonsStrings.skipped
  - typingsSlinky.allureJsCommons.allureJsCommonsStrings.failed
  - typingsSlinky.allureJsCommons.allureJsCommonsStrings.broken
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def broken: typingsSlinky.allureJsCommons.allureJsCommonsStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsSlinky.allureJsCommons.allureJsCommonsStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsSlinky.allureJsCommons.allureJsCommonsStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsSlinky.allureJsCommons.allureJsCommonsStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsSlinky.allureJsCommons.allureJsCommonsStrings.skipped = this.cast("skipped")
}

