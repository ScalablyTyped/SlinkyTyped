package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.AnonAccessToken_
import typingsSlinky.deezerSdk.deezerSdkStrings.connected
import typingsSlinky.deezerSdk.deezerSdkStrings.not_authorized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/login | DZ.login}
  */
@js.native
trait LoginResponse extends js.Object {
  var authResponse: AnonAccessToken_ = js.native
  var status: connected | not_authorized = js.native
  var userID: String = js.native
}

object LoginResponse {
  @scala.inline
  def apply(authResponse: AnonAccessToken_, status: connected | not_authorized, userID: String): LoginResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  @scala.inline
  implicit class LoginResponseOps[Self <: LoginResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthResponse(value: AnonAccessToken_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: connected | not_authorized): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

