package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import typingsSlinky.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshAccessTokenResponse extends js.Object {
  var credentials: Credentials = js.native
  var res: GaxiosResponse[_] | Null = js.native
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(credentials: Credentials): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
  @scala.inline
  implicit class RefreshAccessTokenResponseOps[Self <: RefreshAccessTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: Credentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
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

