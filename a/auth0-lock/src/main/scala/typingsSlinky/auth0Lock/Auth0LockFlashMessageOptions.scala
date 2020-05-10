package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.auth0LockStrings.error
import typingsSlinky.auth0Lock.auth0LockStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockFlashMessageOptions extends js.Object {
  var text: String = js.native
  var `type`: success | error = js.native
}

object Auth0LockFlashMessageOptions {
  @scala.inline
  def apply(text: String, `type`: success | error): Auth0LockFlashMessageOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockFlashMessageOptions]
  }
  @scala.inline
  implicit class Auth0LockFlashMessageOptionsOps[Self <: Auth0LockFlashMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: success | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

