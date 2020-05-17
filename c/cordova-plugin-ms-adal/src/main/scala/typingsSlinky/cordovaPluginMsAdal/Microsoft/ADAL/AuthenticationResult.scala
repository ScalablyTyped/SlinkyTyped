package typingsSlinky.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationResult extends js.Object {
  var accessToken: String = js.native
  var accessTokenType: String = js.native
  var expiresOn: js.Date = js.native
  var idToken: String = js.native
  var isMultipleResourceRefreshToken: Boolean = js.native
  var status: String = js.native
  var statusCode: String = js.native
  var tenantId: String = js.native
  var userInfo: UserInfo = js.native
  /**
    * Creates authorization header for web requests.
    *
    * @returns {String} The authorization header.
    */
  def createAuthorizationHeader(): String = js.native
}

object AuthenticationResult {
  @scala.inline
  def apply(
    accessToken: String,
    accessTokenType: String,
    createAuthorizationHeader: () => String,
    expiresOn: js.Date,
    idToken: String,
    isMultipleResourceRefreshToken: Boolean,
    status: String,
    statusCode: String,
    tenantId: String,
    userInfo: UserInfo
  ): AuthenticationResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accessTokenType = accessTokenType.asInstanceOf[js.Any], createAuthorizationHeader = js.Any.fromFunction0(createAuthorizationHeader), expiresOn = expiresOn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResult]
  }
  @scala.inline
  implicit class AuthenticationResultOps[Self <: AuthenticationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessTokenType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateAuthorizationHeader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthorizationHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpiresOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultipleResourceRefreshToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultipleResourceRefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: UserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

