package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.native
  
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.native
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /** The email of the user. */
  var email: js.UndefOr[String] = js.native
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** The password inputed by the user. */
  var password: js.UndefOr[String] = js.native
  
  /** The GITKit token for the non-trusted IDP, which is to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[String] = js.native
  
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
}
object IdentitytoolkitRelyingpartyVerifyPasswordRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPasswordRequestOps[Self <: IdentitytoolkitRelyingpartyVerifyPasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptchaChallenge(value: String): Self = this.set("captchaChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaChallenge: Self = this.set("captchaChallenge", js.undefined)
    
    @scala.inline
    def setCaptchaResponse(value: String): Self = this.set("captchaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaResponse: Self = this.set("captchaResponse", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPendingIdToken(value: String): Self = this.set("pendingIdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingIdToken: Self = this.set("pendingIdToken", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = this.set("returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSecureToken: Self = this.set("returnSecureToken", js.undefined)
  }
}
