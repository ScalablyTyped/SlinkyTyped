package typingsSlinky.consoleUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.consoleUi.consoleUiStrings.DEBUG
  - typingsSlinky.consoleUi.consoleUiStrings.INFO
  - typingsSlinky.consoleUi.consoleUiStrings.WARNING
  - typingsSlinky.consoleUi.consoleUiStrings.ERROR
*/
trait WriteLevel extends js.Object

object WriteLevel {
  @scala.inline
  def DEBUG: typingsSlinky.consoleUi.consoleUiStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typingsSlinky.consoleUi.consoleUiStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsSlinky.consoleUi.consoleUiStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typingsSlinky.consoleUi.consoleUiStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

