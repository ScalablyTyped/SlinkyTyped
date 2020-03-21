package typingsSlinky.jupyterlabLogconsole.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All severity levels, including an internal one for metadata.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
  - typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
*/
trait FullLogLevel extends js.Object

object FullLogLevel {
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
  def metadata: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata = this.cast("metadata")
  @scala.inline
  def warning: typingsSlinky.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = this.cast("warning")
}

