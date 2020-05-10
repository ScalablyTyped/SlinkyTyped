package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewowner extends js.Object {
  var new_owner: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var team_ids: AnonType = js.native
}

object AnonNewowner {
  @scala.inline
  def apply(new_owner: AnonType, owner: AnonRequired, repo: AnonRequired, team_ids: AnonType): AnonNewowner = {
    val __obj = js.Dynamic.literal(new_owner = new_owner.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewowner]
  }
  @scala.inline
  implicit class AnonNewownerOps[Self <: AnonNewowner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNew_owner(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_ids(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

