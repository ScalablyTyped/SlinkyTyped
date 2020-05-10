package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillPermissionBody extends js.Object {
  var acceptedPermissions: js.Array[PermissionScope] = js.native
}

object SkillPermissionBody {
  @scala.inline
  def apply(acceptedPermissions: js.Array[PermissionScope]): SkillPermissionBody = {
    val __obj = js.Dynamic.literal(acceptedPermissions = acceptedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillPermissionBody]
  }
  @scala.inline
  implicit class SkillPermissionBodyOps[Self <: SkillPermissionBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedPermissions(value: js.Array[PermissionScope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedPermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

