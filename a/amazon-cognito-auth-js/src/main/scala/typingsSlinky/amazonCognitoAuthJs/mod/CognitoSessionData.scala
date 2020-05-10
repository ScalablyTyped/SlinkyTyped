package typingsSlinky.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoSessionData extends js.Object {
  /**
    * The session's access token.
    */
  var AccessToken: js.UndefOr[CognitoAccessToken] = js.native
  /**
    * The session's Id token.
    */
  var IdToken: js.UndefOr[CognitoIdToken] = js.native
  /**
    * The session's refresh token.
    */
  var RefreshToken: js.UndefOr[CognitoRefreshToken] = js.native
  /**
    * The session's state.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The session's token scopes.
    */
  var TokenScopes: js.UndefOr[CognitoTokenScopes] = js.native
}

object CognitoSessionData {
  @scala.inline
  def apply(): CognitoSessionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoSessionData]
  }
  @scala.inline
  implicit class CognitoSessionDataOps[Self <: CognitoSessionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: CognitoAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: CognitoIdToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: CognitoRefreshToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenScopes(value: CognitoTokenScopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenScopes")(js.undefined)
        ret
    }
  }
  
}

