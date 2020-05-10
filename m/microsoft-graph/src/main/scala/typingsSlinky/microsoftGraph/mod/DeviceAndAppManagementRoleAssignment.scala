package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceAndAppManagementRoleAssignment extends RoleAssignment {
  // The list of ids of role member security groups. These are IDs from Azure Active Directory.
  var members: js.UndefOr[js.Array[String]] = js.native
}

object DeviceAndAppManagementRoleAssignment {
  @scala.inline
  def apply(): DeviceAndAppManagementRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAndAppManagementRoleAssignment]
  }
  @scala.inline
  implicit class DeviceAndAppManagementRoleAssignmentOps[Self <: DeviceAndAppManagementRoleAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
  }
  
}

