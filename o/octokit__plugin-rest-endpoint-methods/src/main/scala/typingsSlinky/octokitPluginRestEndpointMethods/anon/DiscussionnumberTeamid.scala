package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscussionnumberTeamid extends js.Object {
  var discussion_number: Required = js.native
  var team_id: Required = js.native
}

object DiscussionnumberTeamid {
  @scala.inline
  def apply(discussion_number: Required, team_id: Required): DiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberTeamid]
  }
  @scala.inline
  implicit class DiscussionnumberTeamidOps[Self <: DiscussionnumberTeamid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscussion_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_number")(value.asInstanceOf[js.Any])
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

