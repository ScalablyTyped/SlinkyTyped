package typingsSlinky.nodemailer.mailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.nodemailerStrings.`quoted-printable`
  - typingsSlinky.nodemailer.nodemailerStrings.base64
*/
trait TextEncoding extends js.Object

object TextEncoding {
  @scala.inline
  def base64: typingsSlinky.nodemailer.nodemailerStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `quoted-printable`: typingsSlinky.nodemailer.nodemailerStrings.`quoted-printable` = this.cast("quoted-printable")
}

