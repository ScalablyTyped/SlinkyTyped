package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the rights a user or group has to change objects */
@js.native
trait ObjectPermissions extends js.Object {
  /** The access rights for files */
  var file: ObjectOperationPermissions = js.native
  /** The access rights for objects */
  var `object`: ObjectOperationPermissions = js.native
  /** The access rights for states */
  var state: js.UndefOr[ObjectOperationPermissions] = js.native
  /** The access rights for users/groups */
  var users: ObjectOperationPermissions = js.native
}

object ObjectPermissions {
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    `object`: ObjectOperationPermissions,
    users: ObjectOperationPermissions
  ): ObjectPermissions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPermissions]
  }
  @scala.inline
  implicit class ObjectPermissionsOps[Self <: ObjectPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: ObjectOperationPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ObjectOperationPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: ObjectOperationPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: ObjectOperationPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

