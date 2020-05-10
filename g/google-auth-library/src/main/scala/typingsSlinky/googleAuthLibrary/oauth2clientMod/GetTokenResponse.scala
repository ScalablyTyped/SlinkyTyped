package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTokenResponse extends js.Object {
  var res: GaxiosResponse[_] | Null = js.native
  var tokens: Credentials = js.native
}

object GetTokenResponse {
  @scala.inline
  def apply(tokens: Credentials): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenResponse]
  }
  @scala.inline
  implicit class GetTokenResponseOps[Self <: GetTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokens(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: GaxiosResponse[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(null)
        ret
    }
  }
  
}

