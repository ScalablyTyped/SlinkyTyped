package typingsSlinky.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grecaptcha.grecaptchaStrings.bottomright
  - typingsSlinky.grecaptcha.grecaptchaStrings.bottomleft
  - typingsSlinky.grecaptcha.grecaptchaStrings.`inline`
*/
trait Badge extends js.Object

object Badge {
  @scala.inline
  def bottomleft: typingsSlinky.grecaptcha.grecaptchaStrings.bottomleft = this.cast("bottomleft")
  @scala.inline
  def bottomright: typingsSlinky.grecaptcha.grecaptchaStrings.bottomright = this.cast("bottomright")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typingsSlinky.grecaptcha.grecaptchaStrings.`inline` = this.cast("inline")
}

