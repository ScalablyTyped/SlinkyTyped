package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeams extends js.Object {
  var branch: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var teams: AnonMapTo
}

object AnonTeams {
  @scala.inline
  def apply(branch: AnonRequired, owner: AnonRequired, repo: AnonRequired, teams: AnonMapTo): AnonTeams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeams]
  }
}

