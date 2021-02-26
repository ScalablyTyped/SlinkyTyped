package typingsSlinky.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for the user experience when Office obtains an access token to the add-in from AAD v. 2.0 with the `getAccessToken` method.
  */
@js.native
trait AuthOptions extends StObject {
  
  /**
    * Allows Office to get an access token silently or through interactive consent, if one is required. Default value is `false`.
    * If set to `false`, Office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
    * If set to `true`, Office will show an interactive consent UI after it fails to silently get an access token.
    * The prompt will only allow consent to the AAD profile scope, not to any Microsoft Graph scopes.
    */
  var allowConsentPrompt: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows Office to get an access token silently provided consent is present or show interactive UI to sign in the user. Default value is `false`.
    * If set to `false`, Office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
    * If set to `true`, Office will show an interactive sign-in UI after it fails to silently get an access token.
    */
  var allowSignInPrompt: js.UndefOr[Boolean] = js.native
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the `asyncContext` property of the `AsyncResult` object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * Causes Office to prompt the user to provide the additional factor when the tenancy being targeted by Microsoft Graph requires multifactor
    * authentication. The string value identifies the type of additional factor that is required. In most cases, you won't know at development
    * time whether the user's tenant requires an additional factor or what the string should be. So this option would be used in a "second try"
    * call of `getAccessToken` after Microsoft Graph has sent an error requesting the additional factor and containing the string that should
    * be used with the `authChallenge` option.
    */
  var authChallenge: js.UndefOr[String] = js.native
  
  /**
    * Causes Office to return a descriptive error when the add-in wants to access Microsoft Graph and the user/admin has not granted consent to Graph scopes. Default value is `false`.
    * Office only supports consent to Graph scopes when the add-in has been deployed by a tenant admin. This information will not be available during development.
    * Setting this option to `true` will cause Office to inform your add-in beforehand (by returning a descriptive error) if Graph access will fail.
    */
  var forMSGraphAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Prompts the user to add their Office account (or to switch to it, if it is already added). Default value is `false`.
    *
    * @deprecated Use `allowSignInPrompt` instead.
    */
  var forceAddAccount: js.UndefOr[Boolean] = js.native
  
  /**
    * Causes Office to display the add-in consent experience. Useful if the add-in's Azure permissions have changed or if the user's consent has
    * been revoked. Default value is `false`.
    *
    * @deprecated Use `allowConsentPrompt` instead.
    */
  var forceConsent: js.UndefOr[Boolean] = js.native
}
object AuthOptions {
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowConsentPrompt(value: Boolean): Self = StObject.set(x, "allowConsentPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowConsentPromptUndefined: Self = StObject.set(x, "allowConsentPrompt", js.undefined)
    
    @scala.inline
    def setAllowSignInPrompt(value: Boolean): Self = StObject.set(x, "allowSignInPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSignInPromptUndefined: Self = StObject.set(x, "allowSignInPrompt", js.undefined)
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setAuthChallenge(value: String): Self = StObject.set(x, "authChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthChallengeUndefined: Self = StObject.set(x, "authChallenge", js.undefined)
    
    @scala.inline
    def setForMSGraphAccess(value: Boolean): Self = StObject.set(x, "forMSGraphAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForMSGraphAccessUndefined: Self = StObject.set(x, "forMSGraphAccess", js.undefined)
    
    @scala.inline
    def setForceAddAccount(value: Boolean): Self = StObject.set(x, "forceAddAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceAddAccountUndefined: Self = StObject.set(x, "forceAddAccount", js.undefined)
    
    @scala.inline
    def setForceConsent(value: Boolean): Self = StObject.set(x, "forceConsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceConsentUndefined: Self = StObject.set(x, "forceConsent", js.undefined)
  }
}
