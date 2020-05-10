package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDefinition extends Entity {
  // Description of the Role definition.
  var description: js.UndefOr[String] = js.native
  // Display Name of the Role definition.
  var displayName: js.UndefOr[String] = js.native
  // Type of Role. Set to True if it is built-in, or set to False if it is a custom role definition.
  var isBuiltIn: js.UndefOr[Boolean] = js.native
  // List of Role assignments for this role definition.
  var roleAssignments: js.UndefOr[js.Array[RoleAssignment]] = js.native
  /**
    * List of Role Permissions this role is allowed to perform. These must match the actionName that is defined as part of
    * the rolePermission.
    */
  var rolePermissions: js.UndefOr[js.Array[RolePermission]] = js.native
}

object RoleDefinition {
  @scala.inline
  def apply(): RoleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleDefinition]
  }
  @scala.inline
  implicit class RoleDefinitionOps[Self <: RoleDefinition] (val x: Self) extends AnyVal {
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
    def withIsBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBuiltIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltIn")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAssignments(value: js.Array[RoleAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignments")(js.undefined)
        ret
    }
    @scala.inline
    def withRolePermissions(value: js.Array[RolePermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolePermissions")(js.undefined)
        ret
    }
  }
  
}

