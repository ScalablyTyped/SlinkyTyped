package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDisplayInfo extends js.Object {
  /**
  		 * account provider (eg, Work/School vs Microsoft Account)
  		 */
  var accountType: String = js.native
  /**
  		 * A display name that offers context for the account, such as "Contoso".
  		 */
  var contextualDisplayName: String = js.native
  /**
  		 * A display name that identifies the account, such as "User Name".
  		 */
  var displayName: String = js.native
  /**
  		 * User id that identifies the account, such as "user@contoso.com".
  		 */
  var userId: String = js.native
}

object AccountDisplayInfo {
  @scala.inline
  def apply(accountType: String, contextualDisplayName: String, displayName: String, userId: String): AccountDisplayInfo = {
    val __obj = js.Dynamic.literal(accountType = accountType.asInstanceOf[js.Any], contextualDisplayName = contextualDisplayName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDisplayInfo]
  }
  @scala.inline
  implicit class AccountDisplayInfoOps[Self <: AccountDisplayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextualDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
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

