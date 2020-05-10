package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////
//
//  RESPONSES
//
////////////////////////
@js.native
trait AuthResponse extends js.Object {
  var accessToken: String = js.native
  var expiresIn: Double = js.native
  var grantedScopes: js.UndefOr[String] = js.native
  var reauthorize_required_in: js.UndefOr[Double] = js.native
  var signedRequest: String = js.native
  var userID: String = js.native
}

object AuthResponse {
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, signedRequest: String, userID: String): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  @scala.inline
  implicit class AuthResponseOps[Self <: AuthResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantedScopes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantedScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withReauthorize_required_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reauthorize_required_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReauthorize_required_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reauthorize_required_in")(js.undefined)
        ret
    }
  }
  
}

