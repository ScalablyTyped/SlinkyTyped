package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamidRequired extends js.Object {
  var team_id: Required = js.native
}

object TeamidRequired {
  @scala.inline
  def apply(team_id: Required): TeamidRequired = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamidRequired]
  }
  @scala.inline
  implicit class TeamidRequiredOps[Self <: TeamidRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeam_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

