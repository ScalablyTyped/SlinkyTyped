package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignment extends js.Object {
  var assignedTo: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var orgUnitId: js.UndefOr[String] = js.native
  var roleAssignmentId: js.UndefOr[String] = js.native
  var roleId: js.UndefOr[String] = js.native
  var scopeType: js.UndefOr[String] = js.native
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
    def withAssignedTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(js.undefined)
        ret
    }
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
    def withOrgUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAssignmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAssignmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssignmentId")(js.undefined)
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
    def withScopeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeType")(js.undefined)
        ret
    }
  }
  
}

