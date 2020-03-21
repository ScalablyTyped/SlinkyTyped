package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepoTeamid extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var team_id: AnonRequired
}

object AnonRepoTeamid {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, team_id: AnonRequired): AnonRepoTeamid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepoTeamid]
  }
}

