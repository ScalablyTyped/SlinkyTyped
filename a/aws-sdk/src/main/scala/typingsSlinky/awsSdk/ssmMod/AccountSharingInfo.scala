package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSharingInfo extends js.Object {
  /**
    * The AWS account ID where the current document is shared.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AccountId] = js.native
  /**
    * The version of the current document shared with the account.
    */
  var SharedDocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SharedDocumentVersion] = js.native
}

object AccountSharingInfo {
  @scala.inline
  def apply(): AccountSharingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSharingInfo]
  }
  @scala.inline
  implicit class AccountSharingInfoOps[Self <: AccountSharingInfo] (val x: Self) extends AnyVal {
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
    def withSharedDocumentVersion(value: SharedDocumentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDocumentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDocumentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDocumentVersion")(js.undefined)
        ret
    }
  }
  
}

