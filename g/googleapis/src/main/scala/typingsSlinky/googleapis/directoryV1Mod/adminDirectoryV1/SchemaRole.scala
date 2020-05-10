package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleapis.AnonPrivilegeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for role resource in Directory API.
  */
@js.native
trait SchemaRole extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Returns true if the role is a super admin role.
    */
  var isSuperAdminRole: js.UndefOr[Boolean] = js.native
  /**
    * Returns true if this is a pre-defined system role.
    */
  var isSystemRole: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#role.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A short description of the role.
    */
  var roleDescription: js.UndefOr[String] = js.native
  /**
    * ID of the role.
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * Name of the role.
    */
  var roleName: js.UndefOr[String] = js.native
  /**
    * The set of privileges that are granted to this role.
    */
  var rolePrivileges: js.UndefOr[js.Array[AnonPrivilegeName]] = js.native
}

object SchemaRole {
  @scala.inline
  def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  @scala.inline
  implicit class SchemaRoleOps[Self <: SchemaRole] (val x: Self) extends AnyVal {
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
    def withRolePrivileges(value: js.Array[AnonPrivilegeName]): Self = {
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

