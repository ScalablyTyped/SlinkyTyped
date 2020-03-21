package typingsSlinky.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.natsHemera.natsHemeraStrings.fatal
  - typingsSlinky.natsHemera.natsHemeraStrings.error
  - typingsSlinky.natsHemera.natsHemeraStrings.warn
  - typingsSlinky.natsHemera.natsHemeraStrings.info
  - typingsSlinky.natsHemera.natsHemeraStrings.debug
  - typingsSlinky.natsHemera.natsHemeraStrings.trace
  - typingsSlinky.natsHemera.natsHemeraStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.natsHemera.natsHemeraStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.natsHemera.natsHemeraStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.natsHemera.natsHemeraStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.natsHemera.natsHemeraStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.natsHemera.natsHemeraStrings.silent = this.cast("silent")
  @scala.inline
  def trace: typingsSlinky.natsHemera.natsHemeraStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.natsHemera.natsHemeraStrings.warn = this.cast("warn")
}

