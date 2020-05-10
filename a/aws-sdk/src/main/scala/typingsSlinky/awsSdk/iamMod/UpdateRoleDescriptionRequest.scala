package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleDescriptionRequest extends js.Object {
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: roleDescriptionType = js.native
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType = js.native
}

object UpdateRoleDescriptionRequest {
  @scala.inline
  def apply(Description: roleDescriptionType, RoleName: roleNameType): UpdateRoleDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleDescriptionRequest]
  }
  @scala.inline
  implicit class UpdateRoleDescriptionRequestOps[Self <: UpdateRoleDescriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: roleDescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleName(value: roleNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

