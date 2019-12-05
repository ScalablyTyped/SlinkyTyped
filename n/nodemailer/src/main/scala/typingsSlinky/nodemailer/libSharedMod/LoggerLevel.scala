package typingsSlinky.nodemailer.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.nodemailerStrings.trace
  - typings.nodemailer.nodemailerStrings.debug
  - typings.nodemailer.nodemailerStrings.info
  - typings.nodemailer.nodemailerStrings.warn
  - typings.nodemailer.nodemailerStrings.error
  - typings.nodemailer.nodemailerStrings.fatal
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

