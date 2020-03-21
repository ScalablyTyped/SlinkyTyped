package typingsSlinky.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grecaptcha.grecaptchaStrings.image
  - typingsSlinky.grecaptcha.grecaptchaStrings.audio
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def audio: typingsSlinky.grecaptcha.grecaptchaStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typingsSlinky.grecaptcha.grecaptchaStrings.image = this.cast("image")
}

