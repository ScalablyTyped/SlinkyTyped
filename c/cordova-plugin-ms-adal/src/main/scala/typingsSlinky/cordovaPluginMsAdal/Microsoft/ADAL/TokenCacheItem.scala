package typingsSlinky.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenCacheItem extends js.Object {
  var accessToken: String = js.native
  var authority: String = js.native
  var clientId: String = js.native
  var displayableId: String = js.native
  var expiresOn: js.Date = js.native
  var isMultipleResourceRefreshToken: Boolean = js.native
  var resource: String = js.native
  var tenantId: String = js.native
  var userInfo: UserInfo = js.native
}

object TokenCacheItem {
  @scala.inline
  def apply(
    accessToken: String,
    authority: String,
    clientId: String,
    displayableId: String,
    expiresOn: js.Date,
    isMultipleResourceRefreshToken: Boolean,
    resource: String,
    tenantId: String,
    userInfo: UserInfo
  ): TokenCacheItem = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], displayableId = displayableId.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], isMultipleResourceRefreshToken = isMultipleResourceRefreshToken.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCacheItem]
  }
  @scala.inline
  implicit class TokenCacheItemOps[Self <: TokenCacheItem] (val x: Self) extends AnyVal {
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
    def withAuthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiresOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultipleResourceRefreshToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultipleResourceRefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
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

