package typingsSlinky.auth0Lock

import typingsSlinky.auth0Lock.anon.Email
import typingsSlinky.auth0Lock.auth0LockStrings.big
import typingsSlinky.auth0Lock.auth0LockStrings.forgotPassword
import typingsSlinky.auth0Lock.auth0LockStrings.login
import typingsSlinky.auth0Lock.auth0LockStrings.signUp
import typingsSlinky.auth0Lock.auth0LockStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockConstructorOptions extends js.Object {
  var _enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.native
  var _enableImpersonation: js.UndefOr[Boolean] = js.native
  var additionalSignUpFields: js.UndefOr[js.Array[Auth0LockAdditionalSignUpField]] = js.native
  var allowAutocomplete: js.UndefOr[Boolean] = js.native
  var allowForgotPassword: js.UndefOr[Boolean] = js.native
  var allowLogin: js.UndefOr[Boolean] = js.native
  var allowPasswordAutocomplete: js.UndefOr[Boolean] = js.native
  var allowShowPassword: js.UndefOr[Boolean] = js.native
  var allowSignUp: js.UndefOr[Boolean] = js.native
  var allowedConnections: js.UndefOr[js.Array[String]] = js.native
  var assetsUrl: js.UndefOr[String] = js.native
  var auth: js.UndefOr[Auth0LockAuthOptions] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var avatar: js.UndefOr[Auth0LockAvatarOptions | Null] = js.native
  var clientBaseUrl: js.UndefOr[String] = js.native
  var closable: js.UndefOr[Boolean] = js.native
  var configurationBaseUrl: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var defaultADUsernameFromEmailPrefix: js.UndefOr[Boolean] = js.native
  var defaultDatabaseConnection: js.UndefOr[String] = js.native
  var defaultEnterpriseConnection: js.UndefOr[String] = js.native
  var flashMessage: js.UndefOr[Auth0LockFlashMessageOptions] = js.native
  var forgotPasswordLink: js.UndefOr[String] = js.native
  var hashCleanup: js.UndefOr[Boolean] = js.native
  var initialScreen: js.UndefOr[login | signUp | forgotPassword] = js.native
  var language: js.UndefOr[String] = js.native
  var languageBaseUrl: js.UndefOr[String] = js.native
  var languageDictionary: js.UndefOr[js.Any] = js.native
  var leeway: js.UndefOr[Double] = js.native
  var loginAfterSignUp: js.UndefOr[Boolean] = js.native
  var mustAcceptTerms: js.UndefOr[Boolean] = js.native
  var oidcConformant: js.UndefOr[Boolean] = js.native
  var popupOptions: js.UndefOr[Auth0LockPopupOptions] = js.native
  var prefill: js.UndefOr[Email] = js.native
  var rememberLastLogin: js.UndefOr[Boolean] = js.native
  var scrollGlobalMessagesIntoView: js.UndefOr[Boolean] = js.native
  var signupLink: js.UndefOr[String] = js.native
  var socialButtonStyle: js.UndefOr[big | small] = js.native
  var theme: js.UndefOr[Auth0LockThemeOptions] = js.native
  var usernameStyle: js.UndefOr[String] = js.native
}

object Auth0LockConstructorOptions {
  @scala.inline
  def apply(): Auth0LockConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockConstructorOptions]
  }
  @scala.inline
  implicit class Auth0LockConstructorOptionsOps[Self <: Auth0LockConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_enableIdPInitiatedLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableIdPInitiatedLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_enableIdPInitiatedLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableIdPInitiatedLogin")(js.undefined)
        ret
    }
    @scala.inline
    def with_enableImpersonation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableImpersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_enableImpersonation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_enableImpersonation")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalSignUpFields(value: js.Array[Auth0LockAdditionalSignUpField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSignUpFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSignUpFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSignUpFields")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAutocomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowForgotPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForgotPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowForgotPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowForgotPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPasswordAutocomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPasswordAutocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPasswordAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPasswordAutocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowShowPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowShowPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowShowPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowShowPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSignUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSignUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSignUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSignUp")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedConnections(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: Auth0LockAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar(value: Auth0LockAvatarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(null)
        ret
    }
    @scala.inline
    def withClientBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultADUsernameFromEmailPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultADUsernameFromEmailPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultADUsernameFromEmailPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultADUsernameFromEmailPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDatabaseConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDatabaseConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDatabaseConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDatabaseConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEnterpriseConnection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEnterpriseConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEnterpriseConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEnterpriseConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashMessage(value: Auth0LockFlashMessageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withForgotPasswordLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forgotPasswordLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForgotPasswordLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forgotPasswordLink")(js.undefined)
        ret
    }
    @scala.inline
    def withHashCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialScreen(value: login | signUp | forgotPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageDictionary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageDictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withLeeway(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leeway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeeway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leeway")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginAfterSignUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginAfterSignUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginAfterSignUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginAfterSignUp")(js.undefined)
        ret
    }
    @scala.inline
    def withMustAcceptTerms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustAcceptTerms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustAcceptTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustAcceptTerms")(js.undefined)
        ret
    }
    @scala.inline
    def withOidcConformant(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcConformant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOidcConformant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcConformant")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupOptions(value: Auth0LockPopupOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefill(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(js.undefined)
        ret
    }
    @scala.inline
    def withRememberLastLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberLastLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRememberLastLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberLastLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollGlobalMessagesIntoView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollGlobalMessagesIntoView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollGlobalMessagesIntoView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollGlobalMessagesIntoView")(js.undefined)
        ret
    }
    @scala.inline
    def withSignupLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signupLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignupLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signupLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSocialButtonStyle(value: big | small): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Auth0LockThemeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameStyle")(js.undefined)
        ret
    }
  }
  
}

