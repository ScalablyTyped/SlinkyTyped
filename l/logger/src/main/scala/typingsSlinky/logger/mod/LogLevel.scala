package typingsSlinky.logger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.logger.loggerStrings.fatal
  - typingsSlinky.logger.loggerStrings.error
  - typingsSlinky.logger.loggerStrings.warn
  - typingsSlinky.logger.loggerStrings.info
  - typingsSlinky.logger.loggerStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.logger.loggerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.logger.loggerStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.logger.loggerStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.logger.loggerStrings.info = this.cast("info")
  @scala.inline
  def warn: typingsSlinky.logger.loggerStrings.warn = this.cast("warn")
}

