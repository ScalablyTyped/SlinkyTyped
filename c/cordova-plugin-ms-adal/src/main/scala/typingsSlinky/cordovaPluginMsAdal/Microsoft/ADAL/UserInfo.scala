package typingsSlinky.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInfo extends js.Object {
  var displayableId: String = js.native
  var familyName: String = js.native
  var givenName: String = js.native
  var identityProvider: String = js.native
  var passwordChangeUrl: String = js.native
  var passwordExpiresOn: js.Date = js.native
  var uniqueId: String = js.native
  var userId: String = js.native
}

object UserInfo {
  @scala.inline
  def apply(
    displayableId: String,
    familyName: String,
    givenName: String,
    identityProvider: String,
    passwordChangeUrl: String,
    passwordExpiresOn: js.Date,
    uniqueId: String,
    userId: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayableId = displayableId.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identityProvider = identityProvider.asInstanceOf[js.Any], passwordChangeUrl = passwordChangeUrl.asInstanceOf[js.Any], passwordExpiresOn = passwordExpiresOn.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordChangeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordChangeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordExpiresOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpiresOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

