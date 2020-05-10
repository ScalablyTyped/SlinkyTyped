package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  // Inserts a new account for a user
  def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account = js.native
}

object AccountsCollection {
  @scala.inline
  def apply(insert: (Account, String, String, String) => Account): AccountsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
    __obj.asInstanceOf[AccountsCollection]
  }
  @scala.inline
  implicit class AccountsCollectionOps[Self <: AccountsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: (Account, String, String, String) => Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

