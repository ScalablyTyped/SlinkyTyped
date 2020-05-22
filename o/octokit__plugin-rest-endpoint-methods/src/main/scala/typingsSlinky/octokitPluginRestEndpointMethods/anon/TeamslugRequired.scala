package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamslugRequired extends js.Object {
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object TeamslugRequired {
  @scala.inline
  def apply(org_ : Required, team_slug: Required): TeamslugRequired = {
    val __obj = js.Dynamic.literal(team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamslugRequired]
  }
}

