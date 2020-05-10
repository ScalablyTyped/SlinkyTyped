package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPermissionGroupsListResponse extends js.Object {
  /** Account permission group collection. */
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountPermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object AccountPermissionGroupsListResponse {
  @scala.inline
  def apply(): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
  @scala.inline
  implicit class AccountPermissionGroupsListResponseOps[Self <: AccountPermissionGroupsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountPermissionGroups(value: js.Array[AccountPermissionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountPermissionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountPermissionGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

