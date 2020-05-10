package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for roleAssignment resource in Directory API.
  */
@js.native
trait SchemaRoleAssignment extends js.Object {
  /**
    * The unique ID of the user this role is assigned to.
    */
  var assignedTo: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of the API resource. This is always
    * admin#directory#roleAssignment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If the role is restricted to an organization unit, this contains the ID
    * for the organization unit the exercise of this role is restricted to.
    */
  var orgUnitId: js.UndefOr[String] = js.native
  /**
    * ID of this roleAssignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.native
  /**
    * The ID of the role that is assigned.
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * The scope in which this role is assigned. Possible values are:  -
    * CUSTOMER - ORG_UNIT
    */
  var scopeType: js.UndefOr[String] = js.native
}

object SchemaRoleAssignment {
  @scala.inline
  def apply(): SchemaRoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoleAssignment]
  }
  @scala.inline
  implicit class SchemaRoleAssignmentOps[Self <: SchemaRoleAssignment] (val x: Self) extends AnyVal {
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

