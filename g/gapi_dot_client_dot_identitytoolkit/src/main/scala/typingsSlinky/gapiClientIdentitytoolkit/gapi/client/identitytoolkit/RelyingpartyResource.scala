package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientIdentitytoolkit.anon.Alt
import typingsSlinky.gapiClientIdentitytoolkit.anon.DelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: Alt): Request[CreateAuthUriResponse] = js.native
  /** Delete user account. */
  def deleteAccount(request: Alt): Request[DeleteAccountResponse] = js.native
  /** Batch download user accounts. */
  def downloadAccount(request: Alt): Request[DownloadAccountResponse] = js.native
  /** Reset password for a user. */
  def emailLinkSignin(request: Alt): Request[EmailLinkSigninResponse] = js.native
  /** Returns the account info. */
  def getAccountInfo(request: Alt): Request[GetAccountInfoResponse] = js.native
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: Alt): Request[GetOobConfirmationCodeResponse] = js.native
  /** Get project configuration. */
  def getProjectConfig(request: DelegatedProjectNumber): Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  /** Get token signing public key. */
  def getPublicKeys(request: Alt): Request[js.Object] = js.native
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: Alt): Request[GetRecaptchaParamResponse] = js.native
  /** Reset password for a user. */
  def resetPassword(request: Alt): Request[ResetPasswordResponse] = js.native
  /** Send SMS verification code. */
  def sendVerificationCode(request: Alt): Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  /** Set account info for a user. */
  def setAccountInfo(request: Alt): Request[SetAccountInfoResponse] = js.native
  /** Set project configuration. */
  def setProjectConfig(request: Alt): Request[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  /** Sign out user. */
  def signOutUser(request: Alt): Request[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  /** Signup new user. */
  def signupNewUser(request: Alt): Request[SignupNewUserResponse] = js.native
  /** Batch upload existing user accounts. */
  def uploadAccount(request: Alt): Request[UploadAccountResponse] = js.native
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: Alt): Request[VerifyAssertionResponse] = js.native
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: Alt): Request[VerifyCustomTokenResponse] = js.native
  /** Verifies the user entered password. */
  def verifyPassword(request: Alt): Request[VerifyPasswordResponse] = js.native
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: Alt): Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: Alt => Request[CreateAuthUriResponse],
    deleteAccount: Alt => Request[DeleteAccountResponse],
    downloadAccount: Alt => Request[DownloadAccountResponse],
    emailLinkSignin: Alt => Request[EmailLinkSigninResponse],
    getAccountInfo: Alt => Request[GetAccountInfoResponse],
    getOobConfirmationCode: Alt => Request[GetOobConfirmationCodeResponse],
    getProjectConfig: DelegatedProjectNumber => Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: Alt => Request[js.Object],
    getRecaptchaParam: Alt => Request[GetRecaptchaParamResponse],
    resetPassword: Alt => Request[ResetPasswordResponse],
    sendVerificationCode: Alt => Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: Alt => Request[SetAccountInfoResponse],
    setProjectConfig: Alt => Request[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: Alt => Request[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: Alt => Request[SignupNewUserResponse],
    uploadAccount: Alt => Request[UploadAccountResponse],
    verifyAssertion: Alt => Request[VerifyAssertionResponse],
    verifyCustomToken: Alt => Request[VerifyCustomTokenResponse],
    verifyPassword: Alt => Request[VerifyPasswordResponse],
    verifyPhoneNumber: Alt => Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  ): RelyingpartyResource = {
    val __obj = js.Dynamic.literal(createAuthUri = js.Any.fromFunction1(createAuthUri), deleteAccount = js.Any.fromFunction1(deleteAccount), downloadAccount = js.Any.fromFunction1(downloadAccount), emailLinkSignin = js.Any.fromFunction1(emailLinkSignin), getAccountInfo = js.Any.fromFunction1(getAccountInfo), getOobConfirmationCode = js.Any.fromFunction1(getOobConfirmationCode), getProjectConfig = js.Any.fromFunction1(getProjectConfig), getPublicKeys = js.Any.fromFunction1(getPublicKeys), getRecaptchaParam = js.Any.fromFunction1(getRecaptchaParam), resetPassword = js.Any.fromFunction1(resetPassword), sendVerificationCode = js.Any.fromFunction1(sendVerificationCode), setAccountInfo = js.Any.fromFunction1(setAccountInfo), setProjectConfig = js.Any.fromFunction1(setProjectConfig), signOutUser = js.Any.fromFunction1(signOutUser), signupNewUser = js.Any.fromFunction1(signupNewUser), uploadAccount = js.Any.fromFunction1(uploadAccount), verifyAssertion = js.Any.fromFunction1(verifyAssertion), verifyCustomToken = js.Any.fromFunction1(verifyCustomToken), verifyPassword = js.Any.fromFunction1(verifyPassword), verifyPhoneNumber = js.Any.fromFunction1(verifyPhoneNumber))
    __obj.asInstanceOf[RelyingpartyResource]
  }
  @scala.inline
  implicit class RelyingpartyResourceOps[Self <: RelyingpartyResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAuthUri(value: Alt => Request[CreateAuthUriResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteAccount(value: Alt => Request[DeleteAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadAccount(value: Alt => Request[DownloadAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmailLinkSignin(value: Alt => Request[EmailLinkSigninResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailLinkSignin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAccountInfo(value: Alt => Request[GetAccountInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOobConfirmationCode(value: Alt => Request[GetOobConfirmationCodeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOobConfirmationCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProjectConfig(value: DelegatedProjectNumber => Request[IdentitytoolkitRelyingpartyGetProjectConfigResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPublicKeys(value: Alt => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRecaptchaParam(value: Alt => Request[GetRecaptchaParamResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecaptchaParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetPassword(value: Alt => Request[ResetPasswordResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendVerificationCode(value: Alt => Request[IdentitytoolkitRelyingpartySendVerificationCodeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVerificationCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccountInfo(value: Alt => Request[SetAccountInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProjectConfig(value: Alt => Request[IdentitytoolkitRelyingpartySetProjectConfigResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProjectConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignOutUser(value: Alt => Request[IdentitytoolkitRelyingpartySignOutUserResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signOutUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignupNewUser(value: Alt => Request[SignupNewUserResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signupNewUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadAccount(value: Alt => Request[UploadAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyAssertion(value: Alt => Request[VerifyAssertionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAssertion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyCustomToken(value: Alt => Request[VerifyCustomTokenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCustomToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyPassword(value: Alt => Request[VerifyPasswordResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyPhoneNumber(value: Alt => Request[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyPhoneNumber")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

