package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Role Permission List Response
  */
@js.native
trait SchemaUserRolePermissionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User role permission collection.
    */
  var userRolePermissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.native
}

object SchemaUserRolePermissionsListResponse {
  @scala.inline
  def apply(): SchemaUserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRolePermissionsListResponse]
  }
  @scala.inline
  implicit class SchemaUserRolePermissionsListResponseOps[Self <: SchemaUserRolePermissionsListResponse] (val x: Self) extends AnyVal {
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
    def withUserRolePermissions(value: js.Array[SchemaUserRolePermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRolePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissions")(js.undefined)
        ret
    }
  }
  
}

