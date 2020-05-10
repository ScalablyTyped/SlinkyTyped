package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLicenseUsersListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicenseUsersListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.native
}

object GroupLicenseUsersListResponse {
  @scala.inline
  def apply(): GroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicenseUsersListResponse]
  }
  @scala.inline
  implicit class GroupLicenseUsersListResponseOps[Self <: GroupLicenseUsersListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withUser(value: js.Array[User]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

