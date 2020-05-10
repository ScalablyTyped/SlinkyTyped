package typingsSlinky.gapiDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdditionalRoles extends js.Object {
  var additionalRoles: js.Array[String] = js.native
  var inherited: Boolean = js.native
  var inheritedFrom: String = js.native
  var role: String = js.native
  var teamDrivePermissionType: String = js.native
}

object AnonAdditionalRoles {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    inherited: Boolean,
    inheritedFrom: String,
    role: String,
    teamDrivePermissionType: String
  ): AnonAdditionalRoles = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], teamDrivePermissionType = teamDrivePermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalRoles]
  }
  @scala.inline
  implicit class AnonAdditionalRolesOps[Self <: AnonAdditionalRoles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritedFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamDrivePermissionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

