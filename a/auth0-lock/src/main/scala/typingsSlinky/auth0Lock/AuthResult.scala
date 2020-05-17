package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.anon.Aud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthResult extends js.Object {
  var accessToken: String = js.native
  var appState: js.UndefOr[js.Any] = js.native
  var expiresIn: Double = js.native
  var idToken: String = js.native
  var idTokenPayload: Aud = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var state: String = js.native
  var tokenType: String = js.native
}

object AuthResult {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    idToken: String,
    idTokenPayload: Aud,
    state: String,
    tokenType: String
  ): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], idTokenPayload = idTokenPayload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResult]
  }
  @scala.inline
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
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
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdTokenPayload(value: Aud): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idTokenPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appState")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

