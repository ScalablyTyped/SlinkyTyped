package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberAccount extends js.Object {
  /**
    * The AWS account ID of the Amazon Macie member account.
    */
  var accountId: js.UndefOr[AWSAccountId] = js.native
}

object MemberAccount {
  @scala.inline
  def apply(): MemberAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAccount]
  }
  @scala.inline
  implicit class MemberAccountOps[Self <: MemberAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
  }
  
}

