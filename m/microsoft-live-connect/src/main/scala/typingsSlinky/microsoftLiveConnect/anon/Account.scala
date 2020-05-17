package typingsSlinky.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The email address that is associated with the account.
    */
  var account: String = js.native
  /**
    * The user's business email address, or null if one is not
    * specified.
    */
  var business: String = js.native
  /**
    * The user's "alternate" email address, or null if one is not
    * specified.
    */
  var other: String = js.native
  /**
    * The user's personal email address, or null if one is not
    * specified.
    */
  var personal: String = js.native
  /**
    * The user's preferred email address, or null if one is not
    * specified.
    */
  var preferred: String = js.native
}

object Account {
  @scala.inline
  def apply(account: String, business: String, other: String, personal: String, preferred: String): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], preferred = preferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferred(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

