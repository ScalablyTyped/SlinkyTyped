package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerpageRole extends js.Object {
  var page: Type = js.native
  var per_page: Type = js.native
  var role: Enum = js.native
  var team_id: Required = js.native
}

object PerpageRole {
  @scala.inline
  def apply(page: Type, per_page: Type, role: Enum, team_id: Required): PerpageRole = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageRole]
  }
  @scala.inline
  implicit class PerpageRoleOps[Self <: PerpageRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
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

