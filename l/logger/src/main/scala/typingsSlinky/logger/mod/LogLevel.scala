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
  def debug: typingsSlinky.logger.loggerStrings.debug = "debug".asInstanceOf[typingsSlinky.logger.loggerStrings.debug]
  @scala.inline
  def error: typingsSlinky.logger.loggerStrings.error = "error".asInstanceOf[typingsSlinky.logger.loggerStrings.error]
  @scala.inline
  def fatal: typingsSlinky.logger.loggerStrings.fatal = "fatal".asInstanceOf[typingsSlinky.logger.loggerStrings.fatal]
  @scala.inline
  def info: typingsSlinky.logger.loggerStrings.info = "info".asInstanceOf[typingsSlinky.logger.loggerStrings.info]
  @scala.inline
  def warn: typingsSlinky.logger.loggerStrings.warn = "warn".asInstanceOf[typingsSlinky.logger.loggerStrings.warn]
}

