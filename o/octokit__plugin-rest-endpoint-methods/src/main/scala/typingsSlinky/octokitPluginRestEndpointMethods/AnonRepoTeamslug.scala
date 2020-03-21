package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepoTeamslug extends js.Object {
  var org: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var team_slug: AnonRequired
}

object AnonRepoTeamslug {
  @scala.inline
  def apply(org: AnonRequired, owner: AnonRequired, repo: AnonRequired, team_slug: AnonRequired): AnonRepoTeamslug = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepoTeamslug]
  }
}

