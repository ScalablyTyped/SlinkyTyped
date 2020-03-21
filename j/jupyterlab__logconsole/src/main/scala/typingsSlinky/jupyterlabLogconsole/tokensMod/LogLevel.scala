package typingsSlinky.jupyterlabLogconsole.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = this.cast("info")
  @scala.inline
  def warning: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = this.cast("warning")
}

