package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamslugUsername extends js.Object {
  @JSName("org")
  var org_ : Required
  var team_slug: Required
  var username: Required
}

object TeamslugUsername {
  @scala.inline
  def apply(org_ : Required, team_slug: Required, username: Required): TeamslugUsername = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamslugUsername]
  }
}

