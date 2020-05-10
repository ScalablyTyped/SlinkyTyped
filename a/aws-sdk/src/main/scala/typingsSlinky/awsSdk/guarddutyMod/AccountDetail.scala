package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetail extends js.Object {
  /**
    * Member account ID.
    */
  var AccountId: typingsSlinky.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * Member account's email address.
    */
  var Email: typingsSlinky.awsSdk.guarddutyMod.Email = js.native
}

object AccountDetail {
  @scala.inline
  def apply(AccountId: AccountId, Email: Email): AccountDetail = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
  @scala.inline
  implicit class AccountDetailOps[Self <: AccountDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

