package typingsSlinky.keycloakJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keycloakJs.keycloakJsStrings.login
import typingsSlinky.keycloakJs.keycloakJsStrings.none
import typingsSlinky.keycloakJs.keycloakJsStrings.register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeycloakLoginOptions extends js.Object {
  /**
  		 * If value is `'register'` then user is redirected to registration page,
  		 * otherwise to login page.
  		 */
  var action: js.UndefOr[register] = js.native
  /**
  		 * Specifies arguments that are passed to the Cordova in-app-browser (if applicable).
  		 * Options 'hidden' and 'location' are not affected by these arguments.
  		 * All available options are defined at https://cordova.apache.org/docs/en/latest/reference/cordova-plugin-inappbrowser/.
  		 * Example of use: { zoom: "no", hardwareback: "yes" }
  		 */
  var cordovaOptions: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * Used to tell Keycloak which IDP the user wants to authenticate with.
  		 */
  var idpHint: js.UndefOr[String] = js.native
  /**
  		 * Specifies the desired Keycloak locale for the UI.  This differs from
    * the locale param in that it tells the Keycloak server to set a cookie and update
    * the user's profile to a new preferred locale.
  		 */
  var kcLocale: js.UndefOr[String] = js.native
  /**
  		 * Sets the 'ui_locales' query param in compliance with section 3.1.2.1
    * of the OIDC 1.0 specification.
  		 */
  var locale: js.UndefOr[String] = js.native
  /**
  		 * Used to pre-fill the username/email field on the login form.
  		 */
  var loginHint: js.UndefOr[String] = js.native
  /**
  		 * Used just if user is already authenticated. Specifies maximum time since
  		 * the authentication of user happened. If user is already authenticated for
  		 * longer time than `'maxAge'`, the SSO is ignored and he will need to
  		 * authenticate again.
  		 */
  var maxAge: js.UndefOr[Double] = js.native
  /**
  		 * By default the login screen is displayed if the user is not logged into
  		 * Keycloak. To only authenticate to the application if the user is already
  		 * logged in and not display the login page if the user is not logged in, set
  		 * this option to `'none'`. To always require re-authentication and ignore
  		 * SSO, set this option to `'login'`.
  		 */
  var prompt: js.UndefOr[none | login] = js.native
  /**
  		 * Specifies the uri to redirect to after login.
  		 */
  var redirectUri: js.UndefOr[String] = js.native
  /**
  		 * @private Undocumented.
  		 */
  var scope: js.UndefOr[String] = js.native
}

object KeycloakLoginOptions {
  @scala.inline
  def apply(): KeycloakLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeycloakLoginOptions]
  }
  @scala.inline
  implicit class KeycloakLoginOptionsOps[Self <: KeycloakLoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: register): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCordovaOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordovaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCordovaOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordovaOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpHint")(js.undefined)
        ret
    }
    @scala.inline
    def withKcLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kcLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKcLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kcLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginHint")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: none | login): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(js.undefined)
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

