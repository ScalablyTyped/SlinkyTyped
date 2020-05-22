package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgTeamslug extends js.Object {
  var body: Required
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object OrgTeamslug {
  @scala.inline
  def apply(body: Required, discussion_number: Required, org_ : Required, team_slug: Required): OrgTeamslug = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgTeamslug]
  }
}

