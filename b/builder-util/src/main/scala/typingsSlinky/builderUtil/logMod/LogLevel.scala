package typingsSlinky.builderUtil.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.builderUtil.builderUtilStrings.info
  - typingsSlinky.builderUtil.builderUtilStrings.warn
  - typingsSlinky.builderUtil.builderUtilStrings.debug
  - typingsSlinky.builderUtil.builderUtilStrings.notice
  - typingsSlinky.builderUtil.builderUtilStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.builderUtil.builderUtilStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.builderUtil.builderUtilStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.builderUtil.builderUtilStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsSlinky.builderUtil.builderUtilStrings.notice = this.cast("notice")
  @scala.inline
  def warn: typingsSlinky.builderUtil.builderUtilStrings.warn = this.cast("warn")
}

