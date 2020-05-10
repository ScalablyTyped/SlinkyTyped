package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Role extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var isSuperAdminRole: js.UndefOr[Boolean] = js.native
  var isSystemRole: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var roleDescription: js.UndefOr[String] = js.native
  var roleId: js.UndefOr[String] = js.native
  var roleName: js.UndefOr[String] = js.native
  var rolePrivileges: js.UndefOr[js.Array[RoleRolePrivileges]] = js.native
}

object Role {
  @scala.inline
  def apply(): Role = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSuperAdminRole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperAdminRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuperAdminRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperAdminRole")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSystemRole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSystemRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemRole")(js.undefined)
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
    @scala.inline
    def withRoleDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRolePrivileges(value: js.Array[RoleRolePrivileges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolePrivileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolePrivileges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolePrivileges")(js.undefined)
        ret
    }
  }
  
}

