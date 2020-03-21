package typingsSlinky.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.nodemailerStrings.NEVER
  - typingsSlinky.nodemailer.nodemailerStrings.SUCCESS
  - typingsSlinky.nodemailer.nodemailerStrings.FAILURE
  - typingsSlinky.nodemailer.nodemailerStrings.DELAY
*/
trait DSNOption extends js.Object

object DSNOption {
  @scala.inline
  def DELAY: typingsSlinky.nodemailer.nodemailerStrings.DELAY = this.cast("DELAY")
  @scala.inline
  def FAILURE: typingsSlinky.nodemailer.nodemailerStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def NEVER: typingsSlinky.nodemailer.nodemailerStrings.NEVER = this.cast("NEVER")
  @scala.inline
  def SUCCESS: typingsSlinky.nodemailer.nodemailerStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

