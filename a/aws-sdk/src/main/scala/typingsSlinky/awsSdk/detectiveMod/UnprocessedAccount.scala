package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedAccount extends js.Object {
  /**
    * The AWS account identifier of the member account that was not processed.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.AccountId] = js.native
  /**
    * The reason that the member account request could not be processed.
    */
  var Reason: js.UndefOr[UnprocessedReason] = js.native
}

object UnprocessedAccount {
  @scala.inline
  def apply(): UnprocessedAccount = {
    val __obj = js.Dynamic.literal()
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
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: UnprocessedReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
  }
  
}

