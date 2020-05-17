package typingsSlinky.meteorPrime8consultingOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshToken extends js.Object {
  var clientId: String = js.native
  var expires: js.Date = js.native
  var refreshToken: String = js.native
  var userId: String = js.native
}

object RefreshToken {
  @scala.inline
  def apply(clientId: String, expires: js.Date, refreshToken: String, userId: String): RefreshToken = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  @scala.inline
  implicit class RefreshTokenOps[Self <: RefreshToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

