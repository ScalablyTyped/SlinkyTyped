package typingsSlinky.audiosprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.audiosprite.audiospriteStrings.debug
  - typingsSlinky.audiosprite.audiospriteStrings.info
  - typingsSlinky.audiosprite.audiospriteStrings.notice
  - typingsSlinky.audiosprite.audiospriteStrings.warning
  - typingsSlinky.audiosprite.audiospriteStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.audiosprite.audiospriteStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.audiosprite.audiospriteStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.audiosprite.audiospriteStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsSlinky.audiosprite.audiospriteStrings.notice = this.cast("notice")
  @scala.inline
  def warning: typingsSlinky.audiosprite.audiospriteStrings.warning = this.cast("warning")
}

