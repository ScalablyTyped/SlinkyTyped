package typingsSlinky.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.record
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.warn
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.error
*/
trait EXPIRY_STRATEGY extends js.Object

object EXPIRY_STRATEGY {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.pollyjsCore.pollyjsCoreStrings.error = this.cast("error")
  @scala.inline
  def record: typingsSlinky.pollyjsCore.pollyjsCoreStrings.record = this.cast("record")
  @scala.inline
  def warn: typingsSlinky.pollyjsCore.pollyjsCoreStrings.warn = this.cast("warn")
}

