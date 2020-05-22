package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoTeamid extends js.Object {
  var owner: Required
  var repo: Required
  var team_id: Required
}

object RepoTeamid {
  @scala.inline
  def apply(owner: Required, repo: Required, team_id: Required): RepoTeamid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoTeamid]
  }
}

