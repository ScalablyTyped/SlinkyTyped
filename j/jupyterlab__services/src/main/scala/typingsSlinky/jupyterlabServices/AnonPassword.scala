package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPassword extends js.Object {
  /**
    * Whether the request is for a password.
    * If so, the frontend shouldn't echo input.
    */
  var password: Boolean = js.native
  /**
    * The text to show at the prompt.
    */
  var prompt: String = js.native
}

object AnonPassword {
  @scala.inline
  def apply(password: Boolean, prompt: String): AnonPassword = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassword]
  }
  @scala.inline
  implicit class AnonPasswordOps[Self <: AnonPassword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

