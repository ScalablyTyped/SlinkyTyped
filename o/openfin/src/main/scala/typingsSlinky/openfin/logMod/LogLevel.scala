package typingsSlinky.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.openfinStrings.verbose
  - typingsSlinky.openfin.openfinStrings.info
  - typingsSlinky.openfin.openfinStrings.warning
  - typingsSlinky.openfin.openfinStrings.error
  - typingsSlinky.openfin.openfinStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.openfin.openfinStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.openfin.openfinStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.openfin.openfinStrings.info = this.cast("info")
  @scala.inline
  def verbose: typingsSlinky.openfin.openfinStrings.verbose = this.cast("verbose")
  @scala.inline
  def warning: typingsSlinky.openfin.openfinStrings.warning = this.cast("warning")
}

