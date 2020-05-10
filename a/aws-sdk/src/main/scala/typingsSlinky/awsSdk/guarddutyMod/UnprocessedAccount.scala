package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * AWS Account ID.
    */
  var AccountId: typingsSlinky.awsSdk.guarddutyMod.AccountId = js.native
  /**
    * A reason why the account hasn't been processed.
    */
  var Result: String = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(AccountId: AccountId, Result: String): UnprocessedAccount = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
  @scala.inline
  implicit class UnprocessedAccountOps[Self <: UnprocessedAccount] (val x: Self) extends AnyVal {
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
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

