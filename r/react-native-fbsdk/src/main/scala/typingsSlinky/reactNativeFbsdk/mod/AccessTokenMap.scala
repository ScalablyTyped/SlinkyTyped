package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenMap extends js.Object {
  var accessToken: String = js.native
  var accessTokenSource: js.UndefOr[String] = js.native
  var applicationID: String = js.native
  var dataAccessExpirationTime: Double = js.native
  var declinedPermissions: js.Array[Permissions] = js.native
  var expirationTime: Double = js.native
  var expiredPermissions: js.Array[Permissions] = js.native
  var lastRefreshTime: Double = js.native
  var permissions: js.Array[Permissions] = js.native
  var userID: String = js.native
}

object AccessTokenMap {
  @scala.inline
  def apply(
    accessToken: String,
    applicationID: String,
    dataAccessExpirationTime: Double,
    declinedPermissions: js.Array[Permissions],
    expirationTime: Double,
    expiredPermissions: js.Array[Permissions],
    lastRefreshTime: Double,
    permissions: js.Array[Permissions],
    userID: String
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], applicationID = applicationID.asInstanceOf[js.Any], dataAccessExpirationTime = dataAccessExpirationTime.asInstanceOf[js.Any], declinedPermissions = declinedPermissions.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], expiredPermissions = expiredPermissions.asInstanceOf[js.Any], lastRefreshTime = lastRefreshTime.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenMap]
  }
  @scala.inline
  implicit class AccessTokenMapOps[Self <: AccessTokenMap] (val x: Self) extends AnyVal {
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
    def withApplicationID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataAccessExpirationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccessExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclinedPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declinedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiredPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRefreshTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[Permissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessTokenSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessTokenSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenSource")(js.undefined)
        ret
    }
  }
  
}

