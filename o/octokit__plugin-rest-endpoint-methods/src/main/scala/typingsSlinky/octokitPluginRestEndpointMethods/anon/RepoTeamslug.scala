package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoTeamslug extends js.Object {
  @JSName("org")
  var org_ : Required
  var owner: Required
  var repo: Required
  var team_slug: Required
}

object RepoTeamslug {
  @scala.inline
  def apply(org_ : Required, owner: Required, repo: Required, team_slug: Required): RepoTeamslug = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoTeamslug]
  }
}

