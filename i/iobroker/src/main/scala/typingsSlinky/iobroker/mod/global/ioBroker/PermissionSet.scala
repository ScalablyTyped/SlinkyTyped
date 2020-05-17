package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.iobroker.anon.Execute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defined the complete set of access rights a user has */
@js.native
trait PermissionSet extends ObjectPermissions {
  /** The name of the groups this ACL was merged from */
  var groups: js.Array[String] = js.native
  /** The access rights for certain commands */
  var other: Execute = js.native
  /** The name of the user this ACL is for */
  var user: String = js.native
}

object PermissionSet {
  @scala.inline
  def apply(
    file: ObjectOperationPermissions,
    groups: js.Array[String],
    `object`: ObjectOperationPermissions,
    other: Execute,
    user: String,
    users: ObjectOperationPermissions
  ): PermissionSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionSet]
  }
  @scala.inline
  implicit class PermissionSetOps[Self <: PermissionSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: Execute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

