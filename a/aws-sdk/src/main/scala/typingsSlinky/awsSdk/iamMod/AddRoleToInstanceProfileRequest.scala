package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddRoleToInstanceProfileRequest extends js.Object {
  /**
    * The name of the instance profile to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType = js.native
  /**
    * The name of the role to add. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType = js.native
}

object AddRoleToInstanceProfileRequest {
  @scala.inline
  def apply(InstanceProfileName: instanceProfileNameType, RoleName: roleNameType): AddRoleToInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRoleToInstanceProfileRequest]
  }
  @scala.inline
  implicit class AddRoleToInstanceProfileRequestOps[Self <: AddRoleToInstanceProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceProfileName(value: instanceProfileNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceProfileName")(value.asInstanceOf[js.Any])
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

