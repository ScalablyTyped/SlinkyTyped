package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscussionnumberOrgTeamslug extends js.Object {
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object DiscussionnumberOrgTeamslug {
  @scala.inline
  def apply(discussion_number: Required, org_ : Required, team_slug: Required): DiscussionnumberOrgTeamslug = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberOrgTeamslug]
  }
}

