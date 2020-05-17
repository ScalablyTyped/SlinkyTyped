package typingsSlinky.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  var canCreate: Boolean = js.native
  var canDelete: Boolean = js.native
  var canModifySchema: Boolean = js.native
  var canQuery: Boolean = js.native
  var canRead: Boolean = js.native
  var canSetPermissions: Boolean = js.native
  var canUpdate: Boolean = js.native
  var role: Role = js.native
}

object Permission {
  @scala.inline
  def apply(
    canCreate: Boolean,
    canDelete: Boolean,
    canModifySchema: Boolean,
    canQuery: Boolean,
    canRead: Boolean,
    canSetPermissions: Boolean,
    canUpdate: Boolean,
    role: Role
  ): Permission = {
    val __obj = js.Dynamic.literal(canCreate = canCreate.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canModifySchema = canModifySchema.asInstanceOf[js.Any], canQuery = canQuery.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanModifySchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canModifySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSetPermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSetPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

