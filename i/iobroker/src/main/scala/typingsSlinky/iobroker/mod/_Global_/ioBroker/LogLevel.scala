package typingsSlinky.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.iobrokerStrings.silly
  - typingsSlinky.iobroker.iobrokerStrings.debug
  - typingsSlinky.iobroker.iobrokerStrings.info
  - typingsSlinky.iobroker.iobrokerStrings.warn
  - typingsSlinky.iobroker.iobrokerStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.iobroker.iobrokerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.iobroker.iobrokerStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.iobroker.iobrokerStrings.info = this.cast("info")
  @scala.inline
  def silly: typingsSlinky.iobroker.iobrokerStrings.silly = this.cast("silly")
  @scala.inline
  def warn: typingsSlinky.iobroker.iobrokerStrings.warn = this.cast("warn")
}

