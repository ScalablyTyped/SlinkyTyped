package typingsSlinky.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealmPrivileges extends js.Object {
  var canModifySchema: Boolean = js.native
  var canRead: Boolean = js.native
  var canSetPermissions: Boolean = js.native
  var canUpdate: Boolean = js.native
}

object RealmPrivileges {
  @scala.inline
  def apply(canModifySchema: Boolean, canRead: Boolean, canSetPermissions: Boolean, canUpdate: Boolean): RealmPrivileges = {
    val __obj = js.Dynamic.literal(canModifySchema = canModifySchema.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmPrivileges]
  }
  @scala.inline
  implicit class RealmPrivilegesOps[Self <: RealmPrivileges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanModifySchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canModifySchema")(value.asInstanceOf[js.Any])
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
  }
  
}

