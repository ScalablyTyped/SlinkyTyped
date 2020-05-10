package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPermission extends js.Object {
  /** GTM Account access permissions. */
  var accountAccess: js.UndefOr[AccountAccess] = js.native
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[String] = js.native
  /** GTM Container access permissions. */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.native
  /** User's email address. */
  var emailAddress: js.UndefOr[String] = js.native
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[String] = js.native
}

object UserPermission {
  @scala.inline
  def apply(): UserPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPermission]
  }
  @scala.inline
  implicit class UserPermissionOps[Self <: UserPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountAccess(value: AccountAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAccess")(js.undefined)
        ret
    }
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
    def withContainerAccess(value: js.Array[ContainerAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

