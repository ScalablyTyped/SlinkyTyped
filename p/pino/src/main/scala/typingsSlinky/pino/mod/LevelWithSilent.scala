package typingsSlinky.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pino.pinoStrings.silent
  - typingsSlinky.pino.pinoStrings.fatal
  - typingsSlinky.pino.pinoStrings.error
  - typingsSlinky.pino.pinoStrings.warn
  - typingsSlinky.pino.pinoStrings.info
  - typingsSlinky.pino.pinoStrings.debug
  - typingsSlinky.pino.pinoStrings.trace
*/
trait LevelWithSilent extends js.Object

object LevelWithSilent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.pino.pinoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.pino.pinoStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.pino.pinoStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.pino.pinoStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.pino.pinoStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typingsSlinky.pino.pinoStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.pino.pinoStrings.warn = this.cast("warn")
}

