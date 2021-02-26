package typingsSlinky.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartyGetProjectConfigResponse extends StObject {
  
  /** Whether to allow password user sign in or sign up. */
  var allowPasswordUser: js.UndefOr[Boolean] = js.native
  
  /** Browser API key, needed when making http request to Apiary. */
  var apiKey: js.UndefOr[String] = js.native
  
  /** Authorized domains. */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.native
  
  /** Change email template. */
  var changeEmailTemplate: js.UndefOr[EmailTemplate] = js.native
  
  var dynamicLinksDomain: js.UndefOr[String] = js.native
  
  /** Whether anonymous user is enabled. */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.native
  
  /** OAuth2 provider configuration. */
  var idpConfig: js.UndefOr[js.Array[IdpConfig]] = js.native
  
  /** Legacy reset password email template. */
  var legacyResetPasswordTemplate: js.UndefOr[EmailTemplate] = js.native
  
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Reset password email template. */
  var resetPasswordTemplate: js.UndefOr[EmailTemplate] = js.native
  
  /** Whether to use email sending provided by Firebear. */
  var useEmailSending: js.UndefOr[Boolean] = js.native
  
  /** Verify email template. */
  var verifyEmailTemplate: js.UndefOr[EmailTemplate] = js.native
}
object IdentitytoolkitRelyingpartyGetProjectConfigResponse {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyGetProjectConfigResponseMutableBuilder[Self <: IdentitytoolkitRelyingpartyGetProjectConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPasswordUser(value: Boolean): Self = StObject.set(x, "allowPasswordUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPasswordUserUndefined: Self = StObject.set(x, "allowPasswordUser", js.undefined)
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedDomainsUndefined: Self = StObject.set(x, "authorizedDomains", js.undefined)
    
    @scala.inline
    def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value :_*))
    
    @scala.inline
    def setChangeEmailTemplate(value: EmailTemplate): Self = StObject.set(x, "changeEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeEmailTemplateUndefined: Self = StObject.set(x, "changeEmailTemplate", js.undefined)
    
    @scala.inline
    def setDynamicLinksDomain(value: String): Self = StObject.set(x, "dynamicLinksDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinksDomainUndefined: Self = StObject.set(x, "dynamicLinksDomain", js.undefined)
    
    @scala.inline
    def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
    
    @scala.inline
    def setIdpConfig(value: js.Array[IdpConfig]): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    @scala.inline
    def setIdpConfigVarargs(value: IdpConfig*): Self = StObject.set(x, "idpConfig", js.Array(value :_*))
    
    @scala.inline
    def setLegacyResetPasswordTemplate(value: EmailTemplate): Self = StObject.set(x, "legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyResetPasswordTemplateUndefined: Self = StObject.set(x, "legacyResetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setResetPasswordTemplate(value: EmailTemplate): Self = StObject.set(x, "resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPasswordTemplateUndefined: Self = StObject.set(x, "resetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setUseEmailSending(value: Boolean): Self = StObject.set(x, "useEmailSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEmailSendingUndefined: Self = StObject.set(x, "useEmailSending", js.undefined)
    
    @scala.inline
    def setVerifyEmailTemplate(value: EmailTemplate): Self = StObject.set(x, "verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyEmailTemplateUndefined: Self = StObject.set(x, "verifyEmailTemplate", js.undefined)
  }
}
