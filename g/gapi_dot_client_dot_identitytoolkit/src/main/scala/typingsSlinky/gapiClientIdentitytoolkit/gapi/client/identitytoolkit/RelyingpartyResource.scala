package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientIdentitytoolkit.AnonAlt
import typingsSlinky.gapiClientIdentitytoolkit.AnonDelegatedProjectNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelyingpartyResource extends js.Object {
  /** Creates the URI used by the IdP to authenticate the user. */
  def createAuthUri(request: AnonAlt): Request_[CreateAuthUriResponse] = js.native
  /** Delete user account. */
  def deleteAccount(request: AnonAlt): Request_[DeleteAccountResponse] = js.native
  /** Batch download user accounts. */
  def downloadAccount(request: AnonAlt): Request_[DownloadAccountResponse] = js.native
  /** Reset password for a user. */
  def emailLinkSignin(request: AnonAlt): Request_[EmailLinkSigninResponse] = js.native
  /** Returns the account info. */
  def getAccountInfo(request: AnonAlt): Request_[GetAccountInfoResponse] = js.native
  /** Get a code for user action confirmation. */
  def getOobConfirmationCode(request: AnonAlt): Request_[GetOobConfirmationCodeResponse] = js.native
  /** Get project configuration. */
  def getProjectConfig(request: AnonDelegatedProjectNumber): Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse] = js.native
  /** Get token signing public key. */
  def getPublicKeys(request: AnonAlt): Request_[js.Object] = js.native
  /** Get recaptcha secure param. */
  def getRecaptchaParam(request: AnonAlt): Request_[GetRecaptchaParamResponse] = js.native
  /** Reset password for a user. */
  def resetPassword(request: AnonAlt): Request_[ResetPasswordResponse] = js.native
  /** Send SMS verification code. */
  def sendVerificationCode(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse] = js.native
  /** Set account info for a user. */
  def setAccountInfo(request: AnonAlt): Request_[SetAccountInfoResponse] = js.native
  /** Set project configuration. */
  def setProjectConfig(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse] = js.native
  /** Sign out user. */
  def signOutUser(request: AnonAlt): Request_[IdentitytoolkitRelyingpartySignOutUserResponse] = js.native
  /** Signup new user. */
  def signupNewUser(request: AnonAlt): Request_[SignupNewUserResponse] = js.native
  /** Batch upload existing user accounts. */
  def uploadAccount(request: AnonAlt): Request_[UploadAccountResponse] = js.native
  /** Verifies the assertion returned by the IdP. */
  def verifyAssertion(request: AnonAlt): Request_[VerifyAssertionResponse] = js.native
  /** Verifies the developer asserted ID token. */
  def verifyCustomToken(request: AnonAlt): Request_[VerifyCustomTokenResponse] = js.native
  /** Verifies the user entered password. */
  def verifyPassword(request: AnonAlt): Request_[VerifyPasswordResponse] = js.native
  /** Verifies ownership of a phone number and creates/updates the user account accordingly. */
  def verifyPhoneNumber(request: AnonAlt): Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] = js.native
}

object RelyingpartyResource {
  @scala.inline
  def apply(
    createAuthUri: AnonAlt => Request_[CreateAuthUriResponse],
    deleteAccount: AnonAlt => Request_[DeleteAccountResponse],
    downloadAccount: AnonAlt => Request_[DownloadAccountResponse],
    emailLinkSignin: AnonAlt => Request_[EmailLinkSigninResponse],
    getAccountInfo: AnonAlt => Request_[GetAccountInfoResponse],
    getOobConfirmationCode: AnonAlt => Request_[GetOobConfirmationCodeResponse],
    getProjectConfig: AnonDelegatedProjectNumber => Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse],
    getPublicKeys: AnonAlt => Request_[js.Object],
    getRecaptchaParam: AnonAlt => Request_[GetRecaptchaParamResponse],
    resetPassword: AnonAlt => Request_[ResetPasswordResponse],
    sendVerificationCode: AnonAlt => Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse],
    setAccountInfo: AnonAlt => Request_[SetAccountInfoResponse],
    setProjectConfig: AnonAlt => Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse],
    signOutUser: AnonAlt => Request_[IdentitytoolkitRelyingpartySignOutUserResponse],
    signupNewUser: AnonAlt => Request_[SignupNewUserResponse],
    uploadAccount: AnonAlt => Request_[UploadAccountResponse],
    verifyAssertion: AnonAlt => Request_[VerifyAssertionResponse],
    verifyCustomToken: AnonAlt => Request_[VerifyCustomTokenResponse],
    verifyPassword: AnonAlt => Request_[VerifyPasswordResponse],
    verifyPhoneNumber: AnonAlt => Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
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
    def withCreateAuthUri(value: AnonAlt => Request_[CreateAuthUriResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteAccount(value: AnonAlt => Request_[DeleteAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadAccount(value: AnonAlt => Request_[DownloadAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmailLinkSignin(value: AnonAlt => Request_[EmailLinkSigninResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailLinkSignin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAccountInfo(value: AnonAlt => Request_[GetAccountInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccountInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOobConfirmationCode(value: AnonAlt => Request_[GetOobConfirmationCodeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOobConfirmationCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProjectConfig(value: AnonDelegatedProjectNumber => Request_[IdentitytoolkitRelyingpartyGetProjectConfigResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPublicKeys(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPublicKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRecaptchaParam(value: AnonAlt => Request_[GetRecaptchaParamResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecaptchaParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetPassword(value: AnonAlt => Request_[ResetPasswordResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendVerificationCode(value: AnonAlt => Request_[IdentitytoolkitRelyingpartySendVerificationCodeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVerificationCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAccountInfo(value: AnonAlt => Request_[SetAccountInfoResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccountInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProjectConfig(value: AnonAlt => Request_[IdentitytoolkitRelyingpartySetProjectConfigResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProjectConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignOutUser(value: AnonAlt => Request_[IdentitytoolkitRelyingpartySignOutUserResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signOutUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignupNewUser(value: AnonAlt => Request_[SignupNewUserResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signupNewUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadAccount(value: AnonAlt => Request_[UploadAccountResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadAccount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyAssertion(value: AnonAlt => Request_[VerifyAssertionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAssertion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyCustomToken(value: AnonAlt => Request_[VerifyCustomTokenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCustomToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyPassword(value: AnonAlt => Request_[VerifyPasswordResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyPassword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVerifyPhoneNumber(value: AnonAlt => Request_[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyPhoneNumber")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

