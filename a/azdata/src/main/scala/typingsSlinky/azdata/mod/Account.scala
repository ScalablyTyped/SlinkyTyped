package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
  		 * Display information for the account
  		 */
  var displayInfo: AccountDisplayInfo = js.native
  /**
  		 * Indicates if the account needs refreshing
  		 */
  var isStale: Boolean = js.native
  /**
  		 * The key that identifies the account
  		 */
  var key: AccountKey = js.native
  /**
  		 * Custom properties stored with the account
  		 */
  var properties: js.Any = js.native
}

object Account {
  @scala.inline
  def apply(displayInfo: AccountDisplayInfo, isStale: Boolean, key: AccountKey, properties: js.Any): Account = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayInfo(value: AccountDisplayInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: AccountKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

