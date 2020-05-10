package typingsSlinky.instagramPrivateApi.addressBookRepositoryLinkResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressBookRepositoryLinkResponseRootObject extends js.Object {
  var status: String = js.native
  var users: js.Array[AddressBookRepositoryLinkResponseUsersItem] = js.native
  var warning: String = js.native
}

object AddressBookRepositoryLinkResponseRootObject {
  @scala.inline
  def apply(status: String, users: js.Array[AddressBookRepositoryLinkResponseUsersItem], warning: String): AddressBookRepositoryLinkResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressBookRepositoryLinkResponseRootObject]
  }
  @scala.inline
  implicit class AddressBookRepositoryLinkResponseRootObjectOps[Self <: AddressBookRepositoryLinkResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[AddressBookRepositoryLinkResponseUsersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

