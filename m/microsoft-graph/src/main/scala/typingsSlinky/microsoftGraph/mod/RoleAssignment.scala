package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignment extends Entity {
  // Description of the Role Assignment.
  var description: js.UndefOr[String] = js.native
  // The display or friendly name of the role Assignment.
  var displayName: js.UndefOr[String] = js.native
  // List of ids of role scope member security groups. These are IDs from Azure Active Directory.
  var resourceScopes: js.UndefOr[js.Array[String]] = js.native
  // Role definition this assignment is part of.
  var roleDefinition: js.UndefOr[RoleDefinition] = js.native
}

object RoleAssignment {
  @scala.inline
  def apply(): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssignment]
  }
  @scala.inline
  implicit class RoleAssignmentOps[Self <: RoleAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleDefinition(value: RoleDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleDefinition")(js.undefined)
        ret
    }
  }
  
}

