package typingsSlinky.octokitAuthToken.typesMod

import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.installation
import typingsSlinky.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationTokenAuthentication extends Authentication {
  var token: Token = js.native
  var tokenType: installation = js.native
  var `type`: token = js.native
}

object InstallationTokenAuthentication {
  @scala.inline
  def apply(token: Token, tokenType: installation, `type`: token): InstallationTokenAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTokenAuthentication]
  }
  @scala.inline
  implicit class InstallationTokenAuthenticationOps[Self <: InstallationTokenAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenType(value: installation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

