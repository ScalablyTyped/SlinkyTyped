package typingsSlinky.consoleLogLevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.trace
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.debug
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.info
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.warn
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.error
  - typingsSlinky.consoleLogLevel.consoleLogLevelStrings.fatal
*/
trait LogLevelNames extends js.Object

object LogLevelNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.consoleLogLevel.consoleLogLevelStrings.warn = this.cast("warn")
}

