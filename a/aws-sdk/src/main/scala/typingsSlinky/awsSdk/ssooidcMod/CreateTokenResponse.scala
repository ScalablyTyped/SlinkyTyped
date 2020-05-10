package typingsSlinky.awsSdk.ssooidcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTokenResponse extends js.Object {
  /**
    * An opaque token to access AWS SSO resources assigned to a user.
    */
  var accessToken: js.UndefOr[AccessToken] = js.native
  /**
    * Indicates the time in seconds when an access token will expire.
    */
  var expiresIn: js.UndefOr[ExpirationInSeconds] = js.native
  /**
    * The identifier of the user that associated with the access token, if present.
    */
  var idToken: js.UndefOr[IdToken] = js.native
  /**
    * A token that, if present, can be used to refresh a previously issued access token that might have expired.
    */
  var refreshToken: js.UndefOr[RefreshToken] = js.native
  /**
    * Used to notify the client that the returned token is an access token. The supported type is BearerToken.
    */
  var tokenType: js.UndefOr[TokenType] = js.native
}

object CreateTokenResponse {
  @scala.inline
  def apply(): CreateTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTokenResponse]
  }
  @scala.inline
  implicit class CreateTokenResponseOps[Self <: CreateTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: AccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: ExpirationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: IdToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: RefreshToken): Self = {
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
    def withTokenType(value: TokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenType")(js.undefined)
        ret
    }
  }
  
}

