package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsResetAuthorizationParams extends js.Object {
  var access_token: String = js.native
  var client_id: String = js.native
}

object OauthAuthorizationsResetAuthorizationParams {
  @scala.inline
  def apply(access_token: String, client_id: String): OauthAuthorizationsResetAuthorizationParams = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsResetAuthorizationParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsResetAuthorizationParamsOps[Self <: OauthAuthorizationsResetAuthorizationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

