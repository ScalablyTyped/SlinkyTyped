package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteInOrgParams extends js.Object {
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object TeamsDeleteInOrgParams {
  @scala.inline
  def apply(org_ : String, team_slug: String): TeamsDeleteInOrgParams = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteInOrgParams]
  }
}

