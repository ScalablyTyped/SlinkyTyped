package typingsSlinky.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiOAuth2TokenObject extends js.Object {
  /**
    * The OAuth 2.0 token. Only present in successful responses
    */
  var access_token: String = js.native
  /**
    * Details about the error. Only present in error responses
    */
  var error: String = js.native
  /**
    * The duration, in seconds, the token is valid for. Only present in successful responses
    */
  var expires_in: String = js.native
  var session_state: js.UndefOr[GoogleApiOAuth2TokenSessionState] = js.native
  /**
    * The Google API scopes related to this token
    */
  var state: String = js.native
}

object GoogleApiOAuth2TokenObject {
  @scala.inline
  def apply(access_token: String, error: String, expires_in: String, state: String): GoogleApiOAuth2TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
  }
  @scala.inline
  implicit class GoogleApiOAuth2TokenObjectOps[Self <: GoogleApiOAuth2TokenObject] (val x: Self) extends AnyVal {
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
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_in(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession_state(value: GoogleApiOAuth2TokenSessionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_state")(js.undefined)
        ret
    }
  }
  
}

