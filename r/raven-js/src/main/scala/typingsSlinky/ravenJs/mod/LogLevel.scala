package typingsSlinky.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event/Breadcrumb Severity. `critical` is for Breadcrumbs only and `fatal` is for Events only. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ravenJs.ravenJsStrings.critical
  - typingsSlinky.ravenJs.ravenJsStrings.fatal
  - typingsSlinky.ravenJs.ravenJsStrings.error
  - typingsSlinky.ravenJs.ravenJsStrings.warning
  - typingsSlinky.ravenJs.ravenJsStrings.info
  - typingsSlinky.ravenJs.ravenJsStrings.debug
  - typingsSlinky.ravenJs.ravenJsStrings.warn
  - typingsSlinky.ravenJs.ravenJsStrings.log
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsSlinky.ravenJs.ravenJsStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsSlinky.ravenJs.ravenJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.ravenJs.ravenJsStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.ravenJs.ravenJsStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.ravenJs.ravenJsStrings.info = this.cast("info")
  @scala.inline
  def log: typingsSlinky.ravenJs.ravenJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typingsSlinky.ravenJs.ravenJsStrings.warn = this.cast("warn")
  @scala.inline
  def warning: typingsSlinky.ravenJs.ravenJsStrings.warning = this.cast("warning")
}

