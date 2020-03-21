package typingsSlinky.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.browserSync.browserSyncStrings.info
  - typingsSlinky.browserSync.browserSyncStrings.debug
  - typingsSlinky.browserSync.browserSyncStrings.warn
  - typingsSlinky.browserSync.browserSyncStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.browserSync.browserSyncStrings.debug = this.cast("debug")
  @scala.inline
  def info: typingsSlinky.browserSync.browserSyncStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsSlinky.browserSync.browserSyncStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsSlinky.browserSync.browserSyncStrings.warn = this.cast("warn")
}

