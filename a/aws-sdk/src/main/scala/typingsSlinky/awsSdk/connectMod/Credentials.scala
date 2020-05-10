package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * An access token generated for a federated user to access Amazon Connect.
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.native
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect.
    */
  var AccessTokenExpiration: js.UndefOr[js.Date] = js.native
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.native
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[js.Date] = js.native
}

object Credentials {
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: SecurityToken): Self = {
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
    def withAccessTokenExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessTokenExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessTokenExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: SecurityToken): Self = {
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
    def withRefreshTokenExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshTokenExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokenExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshTokenExpiration")(js.undefined)
        ret
    }
  }
  
}

