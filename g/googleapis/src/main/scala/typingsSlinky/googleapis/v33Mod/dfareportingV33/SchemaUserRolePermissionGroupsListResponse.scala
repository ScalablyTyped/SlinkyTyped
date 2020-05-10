package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission Group List Response
  */
@js.native
trait SchemaUserRolePermissionGroupsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission group collection.
    */
  var userRolePermissionGroups: js.UndefOr[js.Array[SchemaUserRolePermissionGroup]] = js.native
}

object SchemaUserRolePermissionGroupsListResponse {
  @scala.inline
  def apply(): SchemaUserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionGroupsListResponse]
  }
  @scala.inline
  implicit class SchemaUserRolePermissionGroupsListResponseOps[Self <: SchemaUserRolePermissionGroupsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withUserRolePermissionGroups(value: js.Array[SchemaUserRolePermissionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRolePermissionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissionGroups")(js.undefined)
        ret
    }
  }
  
}

