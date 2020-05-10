package typingsSlinky.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// User object based on Microsoft Azure documentation: http://msdn.microsoft.com/en-us/library/windowsazure/jj554220.aspx
@js.native
trait User extends js.Object {
  // { [providerName: string]: { userId: string, accessToken: string, accessTokenSecret?: string }; };
  var accessTokens: js.Any = js.native
     // { [providerName: string]: string; }
  var level: String = js.native
  var mobileServiceAuthenticationToken: String = js.native
   //for level:string use one of LevelEnum: 'admin','anonymous','authenticated'
  var userId: String = js.native
  def getIdentities(): js.Any = js.native
}

object User {
  @scala.inline
  def apply(
    accessTokens: js.Any,
    getIdentities: () => js.Any,
    level: String,
    mobileServiceAuthenticationToken: String,
    userId: String
  ): User = {
    val __obj = js.Dynamic.literal(accessTokens = accessTokens.asInstanceOf[js.Any], getIdentities = js.Any.fromFunction0(getIdentities), level = level.asInstanceOf[js.Any], mobileServiceAuthenticationToken = mobileServiceAuthenticationToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokens(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIdentities(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdentities")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileServiceAuthenticationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileServiceAuthenticationToken")(value.asInstanceOf[js.Any])
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

