package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyAssertionResponse extends js.Object {
  /** The action code. */
  var action: js.UndefOr[String] = js.native
  /** URL for OTA app installation. */
  var appInstallationUrl: js.UndefOr[String] = js.native
  /** The custom scheme used by mobile app. */
  var appScheme: js.UndefOr[String] = js.native
  /** The opaque value used by the client to maintain context info between the authentication request and the IDP callback. */
  var context: js.UndefOr[String] = js.native
  /** The birth date of the IdP account. */
  var dateOfBirth: js.UndefOr[String] = js.native
  /** The display name of the user. */
  var displayName: js.UndefOr[String] = js.native
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[String] = js.native
  /** It's true if the email is recycled. */
  var emailRecycled: js.UndefOr[Boolean] = js.native
  /** The value is true if the IDP is also the email provider. It means the user owns the email. */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /** Client error code. */
  var errorMessage: js.UndefOr[String] = js.native
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.native
  /** The unique ID identifies the IdP account. */
  var federatedId: js.UndefOr[String] = js.native
  /** The first name of the user. */
  var firstName: js.UndefOr[String] = js.native
  /** The full name of the user. */
  var fullName: js.UndefOr[String] = js.native
  /** The ID token. */
  var idToken: js.UndefOr[String] = js.native
  /**
    * It's the identifier param in the createAuthUri request if the identifier is an email. It can be used to check whether the user input email is different
    * from the asserted email.
    */
  var inputEmail: js.UndefOr[String] = js.native
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[Boolean] = js.native
  /** The fixed string "identitytoolkit#VerifyAssertionResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The language preference of the user. */
  var language: js.UndefOr[String] = js.native
  /** The last name of the user. */
  var lastName: js.UndefOr[String] = js.native
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[String] = js.native
  /** Whether the assertion is from a non-trusted IDP and need account linking confirmation. */
  var needConfirmation: js.UndefOr[Boolean] = js.native
  /** Whether need client to supply email to complete the federated login flow. */
  var needEmail: js.UndefOr[Boolean] = js.native
  /** The nick name of the user. */
  var nickName: js.UndefOr[String] = js.native
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[String] = js.native
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[String] = js.native
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[Double] = js.native
  /** The OIDC id token. */
  var oauthIdToken: js.UndefOr[String] = js.native
  /** The user approved request token for the OpenID OAuth extension. */
  var oauthRequestToken: js.UndefOr[String] = js.native
  /** The scope for the OpenID OAuth extension. */
  var oauthScope: js.UndefOr[String] = js.native
  /** The OAuth1 access token secret. */
  var oauthTokenSecret: js.UndefOr[String] = js.native
  /** The original email stored in the mapping storage. It's returned when the federated ID is associated to a different email. */
  var originalEmail: js.UndefOr[String] = js.native
  /** The URI of the public accessible profiel picture. */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. If the "providerId" param is set to OpenID
    * OP identifer other than the whilte listed IdPs the OP identifier is returned. If the "identifier" param is federated ID in the createAuthUri request.
    * The domain part of the federated ID is returned.
    */
  var providerId: js.UndefOr[String] = js.native
  /** Raw IDP-returned user info. */
  var rawUserInfo: js.UndefOr[String] = js.native
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.native
  /** The screen_name of a Twitter user or the login name at Github. */
  var screenName: js.UndefOr[String] = js.native
  /** The timezone of the user. */
  var timeZone: js.UndefOr[String] = js.native
  /** When action is 'map', contains the idps which can be used for confirmation. */
  var verifiedProvider: js.UndefOr[js.Array[String]] = js.native
}

object VerifyAssertionResponse {
  @scala.inline
  def apply(): VerifyAssertionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyAssertionResponse]
  }
  @scala.inline
  implicit class VerifyAssertionResponseOps[Self <: VerifyAssertionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
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
    def withAppInstallationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstallationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppInstallationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appInstallationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAppScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDateOfBirth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOfBirth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOfBirth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOfBirth")(js.undefined)
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
    def withEmailRecycled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRecycled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailRecycled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRecycled")(js.undefined)
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
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFederatedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federatedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFederatedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("federatedId")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
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
    def withInputEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNewUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNewUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewUser")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
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
    def withNeedConfirmation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withNickName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickName")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthAuthorizationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAuthorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthAuthorizationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthAuthorizationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthExpireIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthExpireIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthExpireIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthExpireIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthIdToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthIdToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthRequestToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthTokenSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthTokenSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthTokenSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthTokenSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEmail")(js.undefined)
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
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRawUserInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawUserInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawUserInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifiedProvider(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifiedProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifiedProvider")(js.undefined)
        ret
    }
  }
  
}

