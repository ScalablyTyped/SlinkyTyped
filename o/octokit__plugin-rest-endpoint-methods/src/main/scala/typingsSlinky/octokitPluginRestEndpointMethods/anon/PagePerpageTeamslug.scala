package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagePerpageTeamslug extends js.Object {
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var team_slug: Required
}

object PagePerpageTeamslug {
  @scala.inline
  def apply(org_ : Required, page: Type, per_page: Type, team_slug: Required): PagePerpageTeamslug = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePerpageTeamslug]
  }
}

