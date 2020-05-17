package typingsSlinky.nodemailer.dkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.dkimMod.SingleKeyOptions
  - typingsSlinky.nodemailer.dkimMod.MultipleKeysOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: MultipleKeysOptions): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: SingleKeyOptions): Options = value.asInstanceOf[Options]
}

