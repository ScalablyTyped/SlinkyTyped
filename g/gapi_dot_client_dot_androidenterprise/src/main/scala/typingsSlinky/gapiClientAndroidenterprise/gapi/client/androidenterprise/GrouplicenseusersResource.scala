package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.GroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrouplicenseusersResource extends js.Object {
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(request: GroupLicenseId): Request[GroupLicenseUsersListResponse] = js.native
}

object GrouplicenseusersResource {
  @scala.inline
  def apply(list: GroupLicenseId => Request[GroupLicenseUsersListResponse]): GrouplicenseusersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GrouplicenseusersResource]
  }
  @scala.inline
  implicit class GrouplicenseusersResourceOps[Self <: GrouplicenseusersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: GroupLicenseId => Request[GroupLicenseUsersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

