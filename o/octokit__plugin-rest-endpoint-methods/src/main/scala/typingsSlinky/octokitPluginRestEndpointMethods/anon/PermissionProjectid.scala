package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionProjectid extends js.Object {
  var permission: Enum = js.native
  var project_id: Required = js.native
  var team_id: Required = js.native
}

object PermissionProjectid {
  @scala.inline
  def apply(permission: Enum, project_id: Required, team_id: Required): PermissionProjectid = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionProjectid]
  }
  @scala.inline
  implicit class PermissionProjectidOps[Self <: PermissionProjectid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermission(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

