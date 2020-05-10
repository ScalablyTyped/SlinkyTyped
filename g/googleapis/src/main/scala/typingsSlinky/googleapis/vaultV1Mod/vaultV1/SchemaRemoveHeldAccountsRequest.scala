package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remove a list of accounts from a hold.
  */
@js.native
trait SchemaRemoveHeldAccountsRequest extends js.Object {
  /**
    * Account ids to identify HeldAccounts to remove.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRemoveHeldAccountsRequest {
  @scala.inline
  def apply(): SchemaRemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsRequest]
  }
  @scala.inline
  implicit class SchemaRemoveHeldAccountsRequestOps[Self <: SchemaRemoveHeldAccountsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountIds")(js.undefined)
        ret
    }
  }
  
}

