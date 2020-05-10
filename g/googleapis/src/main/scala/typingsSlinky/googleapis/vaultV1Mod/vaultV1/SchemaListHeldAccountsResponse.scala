package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a list of held accounts for a hold.
  */
@js.native
trait SchemaListHeldAccountsResponse extends js.Object {
  /**
    * The held accounts on a hold.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.native
}

object SchemaListHeldAccountsResponse {
  @scala.inline
  def apply(): SchemaListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHeldAccountsResponse]
  }
  @scala.inline
  implicit class SchemaListHeldAccountsResponseOps[Self <: SchemaListHeldAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[SchemaHeldAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
  }
  
}

