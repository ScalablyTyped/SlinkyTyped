package typingsSlinky.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserDashSync.browserDashSyncStrings.info
  - typings.browserDashSync.browserDashSyncStrings.debug
  - typings.browserDashSync.browserDashSyncStrings.warn
  - typings.browserDashSync.browserDashSyncStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.browserDashSync.browserDashSyncStrings.debug = this.cast("debug")
  @scala.inline
  def info: typingsSlinky.browserDashSync.browserDashSyncStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.browserDashSync.browserDashSyncStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsSlinky.browserDashSync.browserDashSyncStrings.warn = this.cast("warn")
}

