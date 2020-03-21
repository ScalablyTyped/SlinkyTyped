package typingsSlinky.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.npmlog.npmlogStrings.silly
  - typingsSlinky.npmlog.npmlogStrings.verbose
  - typingsSlinky.npmlog.npmlogStrings.info
  - typingsSlinky.npmlog.npmlogStrings.timing
  - typingsSlinky.npmlog.npmlogStrings.http
  - typingsSlinky.npmlog.npmlogStrings.notice
  - typingsSlinky.npmlog.npmlogStrings.warn
  - typingsSlinky.npmlog.npmlogStrings.error
  - typingsSlinky.npmlog.npmlogStrings.silent
*/
trait LogLevels extends js.Object

object LogLevels {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.npmlog.npmlogStrings.error = this.cast("error")
  @scala.inline
  def http: typingsSlinky.npmlog.npmlogStrings.http = this.cast("http")
  @scala.inline
  def info: typingsSlinky.npmlog.npmlogStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsSlinky.npmlog.npmlogStrings.notice = this.cast("notice")
  @scala.inline
  def silent: typingsSlinky.npmlog.npmlogStrings.silent = this.cast("silent")
  @scala.inline
  def silly: typingsSlinky.npmlog.npmlogStrings.silly = this.cast("silly")
  @scala.inline
  def timing: typingsSlinky.npmlog.npmlogStrings.timing = this.cast("timing")
  @scala.inline
  def verbose: typingsSlinky.npmlog.npmlogStrings.verbose = this.cast("verbose")
  @scala.inline
  def warn: typingsSlinky.npmlog.npmlogStrings.warn = this.cast("warn")
}

