package typingsSlinky.bunyan.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bunyan.bunyanStrings.trace
  - typings.bunyan.bunyanStrings.debug
  - typings.bunyan.bunyanStrings.info
  - typings.bunyan.bunyanStrings.warn
  - typings.bunyan.bunyanStrings.error
  - typings.bunyan.bunyanStrings.fatal
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

