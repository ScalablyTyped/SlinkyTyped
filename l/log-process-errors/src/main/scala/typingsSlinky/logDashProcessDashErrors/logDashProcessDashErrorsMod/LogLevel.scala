package typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log level
  */
/* Rewritten from type alias, can be one of: 
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.debug
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.info
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warn
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.error
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.silent
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.debug = this.cast("debug")
  @scala.inline
  def default: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default = this.cast("default")
  @scala.inline
  def error: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsSlinky.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warn = this.cast("warn")
}

