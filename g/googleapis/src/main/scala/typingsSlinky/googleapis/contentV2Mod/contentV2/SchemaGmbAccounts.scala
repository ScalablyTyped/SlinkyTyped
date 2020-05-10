package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGmbAccounts extends js.Object {
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.native
}

object SchemaGmbAccounts {
  @scala.inline
  def apply(): SchemaGmbAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccounts]
  }
  @scala.inline
  implicit class SchemaGmbAccountsOps[Self <: SchemaGmbAccounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
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
    @scala.inline
    def withGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmbAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbAccounts")(js.undefined)
        ret
    }
  }
  
}

