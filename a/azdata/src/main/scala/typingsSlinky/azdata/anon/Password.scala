package typingsSlinky.azdata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password extends js.Object {
  var password: Boolean = js.native
  var prompt: String = js.native
}

object Password {
  @scala.inline
  def apply(password: Boolean, prompt: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  @scala.inline
  implicit class PasswordOps[Self <: Password] (val x: Self) extends AnyVal {
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

