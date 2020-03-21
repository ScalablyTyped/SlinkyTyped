package typingsSlinky.nodemailer.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.nodemailerStrings.trace
  - typingsSlinky.nodemailer.nodemailerStrings.debug
  - typingsSlinky.nodemailer.nodemailerStrings.info
  - typingsSlinky.nodemailer.nodemailerStrings.warn
  - typingsSlinky.nodemailer.nodemailerStrings.error
  - typingsSlinky.nodemailer.nodemailerStrings.fatal
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.nodemailer.nodemailerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.nodemailer.nodemailerStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsSlinky.nodemailer.nodemailerStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsSlinky.nodemailer.nodemailerStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsSlinky.nodemailer.nodemailerStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsSlinky.nodemailer.nodemailerStrings.warn = this.cast("warn")
}

