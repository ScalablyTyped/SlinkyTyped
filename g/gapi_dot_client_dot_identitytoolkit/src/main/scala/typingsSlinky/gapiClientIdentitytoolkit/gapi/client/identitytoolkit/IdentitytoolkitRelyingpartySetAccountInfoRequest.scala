package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartySetAccountInfoRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.native
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.native
  /** The timestamp when the account is created. */
  var createdAt: js.UndefOr[String] = js.native
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[String] = js.native
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /** The attributes users request to delete. */
  var deleteAttribute: js.UndefOr[js.Array[String]] = js.native
  /** The IDPs the user request to delete. */
  var deleteProvider: js.UndefOr[js.Array[String]] = js.native
  /** Whether to disable the user. */
  var disableUser: js.UndefOr[Boolean] = js.native
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.native
  /** The email of the user. */
  var email: js.UndefOr[String] = js.native
  /** Mark the email as verified or not. */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  /** Last login timestamp. */
  var lastLoginAt: js.UndefOr[String] = js.native
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.native
  /** The out-of-band code of the change email request. */
  var oobCode: js.UndefOr[String] = js.native
  /** The new password of the user. */
  var password: js.UndefOr[String] = js.native
  /** Privileged caller can update user with specified phone number. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.native
  /** The associated IDPs of the user. */
  var provider: js.UndefOr[js.Array[String]] = js.native
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /** Mark the user to upgrade to federated login. */
  var upgradeToFederatedLogin: js.UndefOr[Boolean] = js.native
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartySetAccountInfoRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetAccountInfoRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySetAccountInfoRequestOps[Self <: IdentitytoolkitRelyingpartySetAccountInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptchaChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptchaResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegatedProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAttribute(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteProvider(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableUser")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailVerified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerified")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastLoginAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastLoginAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(js.undefined)
        ret
    }
    @scala.inline
    def withOobCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOobCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnSecureToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnSecureToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeToFederatedLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeToFederatedLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeToFederatedLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeToFederatedLogin")(js.undefined)
        ret
    }
    @scala.inline
    def withValidSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validSince")(js.undefined)
        ret
    }
  }
  
}

