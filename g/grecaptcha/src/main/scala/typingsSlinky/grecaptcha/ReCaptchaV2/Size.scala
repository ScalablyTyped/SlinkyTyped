package typingsSlinky.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grecaptcha.grecaptchaStrings.normal
  - typingsSlinky.grecaptcha.grecaptchaStrings.compact
  - typingsSlinky.grecaptcha.grecaptchaStrings.invisible
*/
trait Size extends js.Object

object Size {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typingsSlinky.grecaptcha.grecaptchaStrings.compact = this.cast("compact")
  @scala.inline
  def invisible: typingsSlinky.grecaptcha.grecaptchaStrings.invisible = this.cast("invisible")
  @scala.inline
  def normal: typingsSlinky.grecaptcha.grecaptchaStrings.normal = this.cast("normal")
}

