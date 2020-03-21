package typingsSlinky.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bunyan.bunyanStrings.trace
  - typingsSlinky.bunyan.bunyanStrings.debug
  - typingsSlinky.bunyan.bunyanStrings.info
  - typingsSlinky.bunyan.bunyanStrings.warn
  - typingsSlinky.bunyan.bunyanStrings.error
  - typingsSlinky.bunyan.bunyanStrings.fatal
*/
trait LogLevelString extends js.Object

object LogLevelString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.bunyan.bunyanStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.bunyan.bunyanStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.bunyan.bunyanStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.bunyan.bunyanStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsSlinky.bunyan.bunyanStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.bunyan.bunyanStrings.warn = this.cast("warn")
}

