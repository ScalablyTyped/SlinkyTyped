package typingsSlinky.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoAuthOptions extends js.Object {
  /**
    * Optional: boolean flag indicating if the data collection is enabled to support cognito advanced security features. By default, this flag is set to true.
    */
  var AdvancedSecurityDataCollectionFlag: js.UndefOr[Boolean] = js.native
  /**
    * Required: The application/user-pools Cognito web hostname,this is set at the Cognito console.
    */
  var AppWebDomain: String = js.native
  /**
    * Required: User pool application client id.
    */
  var ClientId: String = js.native
  /**
    * Optional: Pre-selected identity provider (this allows to automatically trigger social provider authentication flow).
    */
  var IdentityProvider: js.UndefOr[String] = js.native
  /**
    * Required: Required: The redirect Uri, which will be launched after authentication as signed in.
    */
  var RedirectUriSignIn: String = js.native
  /**
    * Required: The redirect Uri, which will be launched when signed out.
    */
  var RedirectUriSignOut: String = js.native
  /**
    * Optional: The token scopes
    */
  var TokenScopesArray: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional: UserPoolId for the configured cognito userPool.
    */
  var UserPoolId: js.UndefOr[String] = js.native
}

object CognitoAuthOptions {
  @scala.inline
  def apply(AppWebDomain: String, ClientId: String, RedirectUriSignIn: String, RedirectUriSignOut: String): CognitoAuthOptions = {
    val __obj = js.Dynamic.literal(AppWebDomain = AppWebDomain.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], RedirectUriSignIn = RedirectUriSignIn.asInstanceOf[js.Any], RedirectUriSignOut = RedirectUriSignOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoAuthOptions]
  }
  @scala.inline
  implicit class CognitoAuthOptionsOps[Self <: CognitoAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppWebDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppWebDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUriSignIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectUriSignIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUriSignOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectUriSignOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvancedSecurityDataCollectionFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedSecurityDataCollectionFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvancedSecurityDataCollectionFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvancedSecurityDataCollectionFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenScopesArray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenScopesArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenScopesArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TokenScopesArray")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

