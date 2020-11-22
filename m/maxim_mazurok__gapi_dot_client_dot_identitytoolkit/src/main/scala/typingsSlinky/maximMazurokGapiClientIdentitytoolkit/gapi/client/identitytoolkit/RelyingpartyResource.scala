package typingsSlinky.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.Alt
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.AltFields
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.AltFieldsKey
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.DelegatedProjectNumber
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.Fields
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.FieldsKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.Key
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.KeyOauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.OauthtokenPrettyPrint
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.PrettyPrintQuotaUser
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.Resource
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.ResourceUserIp
import typingsSlinky.maximMazurokGapiClientIdentitytoolkit.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelyingpartyResource extends js.Object {
  
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Alt): Request[CreateAuthUriResponse] = js.native
  def createAuthUri(request: Fields, body: IdentitytoolkitRelyingpartyCreateAuthUriRequest): Request[CreateAuthUriResponse] = js.native
  
  def deleteAccount(request: Fields, body: IdentitytoolkitRelyingpartyDeleteAccountRequest): Request[DeleteAccountResponse] = js.native
  /** Delete user account. */
  def deleteAccount(request: Key): Request[DeleteAccountResponse] = js.native
  
  def downloadAccount(request: Fields, body: IdentitytoolkitRelyingpartyDownloadAccountRequest): Request[DownloadAccountResponse] = js.native
  /** Batch download user accounts. */
  def downloadAccount(request: Oauthtoken): Request[DownloadAccountResponse] = js.native
  
  def emailLinkSignin(request: Fields, body: IdentitytoolkitRelyingpartyEmailLinkSigninRequest): Request[EmailLinkSigninResponse] = js.native
  /** Reset password for a user. */
  def emailLinkSignin(request: PrettyPrint): Request[EmailLinkSigninResponse] = js.native
  
  def getAccountInfo(request: Fields, body: IdentitytoolkitRelyingpartyGetAccountInfoRequest): Request[GetAccountInfoResponse] = js.native
  /** Returns the account info. */
  def getAccountInfo(request: QuotaUser): Request[GetAccountInfoResponse] = js.native
  
  def getOobConfirmationCode(request: Fields, body: Relyingparty): Request[GetOobConfirmationCodeResponse] = js.native
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Resource): Request[GetOobConfirmationCodeResponse] = js.native
  
  /** Get project configuration. */
  def getProjectConfig(): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  def getProjectConfig(request: DelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  
  /** Get token signing public key. */
  def getPublicKeys(): Request[js.Object] = js.native
  def getPublicKeys(request: Fields): Request[js.Object] = js.native
  
  /** Get recaptcha secure param. */
  def getRecaptchaParam(): Request[GetRecaptchaParamResponse] = js.native
  def getRecaptchaParam(request: Fields): Request[GetRecaptchaParamResponse] = js.native
  
  def resetPassword(request: Fields, body: IdentitytoolkitRelyingpartyResetPasswordRequest): Request[ResetPasswordResponse] = js.native
  /** Reset password for a user. */
  def resetPassword(request: UserIp): Request[ResetPasswordResponse] = js.native
  
  /** Send SMS verification code. */
  def sendVerificationCode(request: AltFields): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  def sendVerificationCode(request: Fields, body: IdentitytoolkitRelyingpartySendVerificationCodeRequest): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  
  /** Set account info for a user. */
  def setAccountInfo(request: FieldsKey): Request[SetAccountInfoResponse] = js.native
  def setAccountInfo(request: Fields, body: IdentitytoolkitRelyingpartySetAccountInfoRequest): Request[SetAccountInfoResponse] = js.native
  
  def setProjectConfig(request: Fields, body: IdentitytoolkitRelyingpartySetProjectConfigRequest): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  /** Set project configuration. */
  def setProjectConfig(request: KeyOauthtoken): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  
  def signOutUser(request: Fields, body: IdentitytoolkitRelyingpartySignOutUserRequest): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  /** Sign out user. */
  def signOutUser(request: OauthtokenPrettyPrint): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  
  def signupNewUser(request: Fields, body: IdentitytoolkitRelyingpartySignupNewUserRequest): Request[SignupNewUserResponse] = js.native
  /** Signup new user. */
  def signupNewUser(request: PrettyPrintQuotaUser): Request[SignupNewUserResponse] = js.native
  
  def uploadAccount(request: Fields, body: IdentitytoolkitRelyingpartyUploadAccountRequest): Request[UploadAccountResponse] = js.native
  /** Batch upload existing user accounts. */
  def uploadAccount(request: QuotaUserResource): Request[UploadAccountResponse] = js.native
  
  def verifyAssertion(request: Fields, body: IdentitytoolkitRelyingpartyVerifyAssertionRequest): Request[VerifyAssertionResponse] = js.native
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: ResourceUserIp): Request[VerifyAssertionResponse] = js.native
  
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: AltFieldsKey): Request[VerifyCustomTokenResponse] = js.native
  def verifyCustomToken(request: Fields, body: IdentitytoolkitRelyingpartyVerifyCustomTokenRequest): Request[VerifyCustomTokenResponse] = js.native
  
  /** Verifies the user entered password. */
  def verifyPassword(request: FieldsKeyOauthtoken): Request[VerifyPasswordResponse] = js.native
  def verifyPassword(request: Fields, body: IdentitytoolkitRelyingpartyVerifyPasswordRequest): Request[VerifyPasswordResponse] = js.native
  
  def verifyPhoneNumber(request: Fields, body: IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: KeyOauthtokenPrettyPrint): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
}
