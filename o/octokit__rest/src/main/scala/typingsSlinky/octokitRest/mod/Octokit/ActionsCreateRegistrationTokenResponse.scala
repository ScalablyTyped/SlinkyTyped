package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsCreateRegistrationTokenResponse extends js.Object {
  var expires_at: String = js.native
  var token: String = js.native
}

object ActionsCreateRegistrationTokenResponse {
  @scala.inline
  def apply(expires_at: String, token: String): ActionsCreateRegistrationTokenResponse = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRegistrationTokenResponse]
  }
  @scala.inline
  implicit class ActionsCreateRegistrationTokenResponseOps[Self <: ActionsCreateRegistrationTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

