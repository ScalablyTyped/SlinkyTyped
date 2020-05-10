package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermission
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissionsCollection extends js.Object {
  // Gets one account permission by ID.
  def get(profileId: String, id: String): AccountPermission = js.native
  // Retrieves the list of account permissions.
  def list(profileId: String): AccountPermissionsListResponse = js.native
}

object AccountPermissionsCollection {
  @scala.inline
  def apply(get: (String, String) => AccountPermission, list: String => AccountPermissionsListResponse): AccountPermissionsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionsCollection]
  }
  @scala.inline
  implicit class AccountPermissionsCollectionOps[Self <: AccountPermissionsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => AccountPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => AccountPermissionsListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

