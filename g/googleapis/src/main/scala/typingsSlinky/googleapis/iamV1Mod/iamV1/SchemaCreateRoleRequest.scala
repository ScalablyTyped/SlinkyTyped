package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to create a new role.
  */
@js.native
trait SchemaCreateRoleRequest extends js.Object {
  /**
    * The Role resource to create.
    */
  var role: js.UndefOr[SchemaRole] = js.native
  /**
    * The role id to use for this role.
    */
  var roleId: js.UndefOr[String] = js.native
}

object SchemaCreateRoleRequest {
  @scala.inline
  def apply(): SchemaCreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateRoleRequest]
  }
  @scala.inline
  implicit class SchemaCreateRoleRequestOps[Self <: SchemaCreateRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: SchemaRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
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
  }
  
}

