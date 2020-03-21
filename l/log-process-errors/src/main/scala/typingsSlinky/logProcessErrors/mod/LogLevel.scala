package typingsSlinky.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log level
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.debug
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.info
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.warn
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.error
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent
  - typingsSlinky.logProcessErrors.logProcessErrorsStrings.default
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.logProcessErrors.logProcessErrorsStrings.debug = this.cast("debug")
  @scala.inline
  def default: typingsSlinky.logProcessErrors.logProcessErrorsStrings.default = this.cast("default")
  @scala.inline
  def error: typingsSlinky.logProcessErrors.logProcessErrorsStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.logProcessErrors.logProcessErrorsStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.logProcessErrors.logProcessErrorsStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsSlinky.logProcessErrors.logProcessErrorsStrings.warn = this.cast("warn")
}

