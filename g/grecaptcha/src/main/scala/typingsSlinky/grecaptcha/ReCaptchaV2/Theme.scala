package typingsSlinky.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grecaptcha.grecaptchaStrings.light
  - typingsSlinky.grecaptcha.grecaptchaStrings.dark
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.grecaptcha.grecaptchaStrings.dark = this.cast("dark")
  @scala.inline
  def light: typingsSlinky.grecaptcha.grecaptchaStrings.light = this.cast("light")
}

