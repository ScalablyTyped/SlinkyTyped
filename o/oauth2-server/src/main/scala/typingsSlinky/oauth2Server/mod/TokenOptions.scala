package typingsSlinky.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenOptions extends js.Object {
  /**
    * Lifetime of generated access tokens in seconds (default = 1 hour)
    */
  var accessTokenLifetime: js.UndefOr[Double] = js.native
  /**
    * Allow extended attributes to be set on the returned token
    */
  var allowExtendedTokenAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Always revoke the used refresh token and issue a new one for the refresh_token grant.
    */
  var alwaysIssueNewRefreshToken: js.UndefOr[Boolean] = js.native
  /**
    * Additional supported grant types.
    */
  var extendedGrantTypes: js.UndefOr[StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]] = js.native
  /**
    * Lifetime of generated refresh tokens in seconds (default = 2 weeks)
    */
  var refreshTokenLifetime: js.UndefOr[Double] = js.native
  /**
    * Require a client secret. Defaults to true for all grant types.
    */
  var requireClientAuthentication: js.UndefOr[js.Object] = js.native
}

object TokenOptions {
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  @scala.inline
  implicit class TokenOptionsOps[Self <: TokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokenLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExtendedTokenAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExtendedTokenAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExtendedTokenAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExtendedTokenAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysIssueNewRefreshToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIssueNewRefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysIssueNewRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysIssueNewRefreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedGrantTypes(value: StringDictionary[Instantiable1[/* options */ TokenOptions, AbstractGrantType]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedGrantTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedGrantTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedGrantTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTokenLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTokenLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireClientAuthentication(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireClientAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireClientAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireClientAuthentication")(js.undefined)
        ret
    }
  }
  
}

