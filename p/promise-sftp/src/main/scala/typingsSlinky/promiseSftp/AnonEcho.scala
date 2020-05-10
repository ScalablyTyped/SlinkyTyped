package typingsSlinky.promiseSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEcho extends js.Object {
  /** Whether the user's input should be displayed on-screen */
  var echo: Boolean = js.native
  /** The query to pose to the user */
  var prompt: String = js.native
}

object AnonEcho {
  @scala.inline
  def apply(echo: Boolean, prompt: String): AnonEcho = {
    val __obj = js.Dynamic.literal(echo = echo.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEcho]
  }
  @scala.inline
  implicit class AnonEchoOps[Self <: AnonEcho] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEcho(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echo")(value.asInstanceOf[js.Any])
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

