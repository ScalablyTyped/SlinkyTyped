package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageTeamslug extends js.Object {
  var content: Enum
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var team_slug: Required
}

object PerpageTeamslug {
  @scala.inline
  def apply(
    content: Enum,
    discussion_number: Required,
    org_ : Required,
    page: Type,
    per_page: Type,
    team_slug: Required
  ): PerpageTeamslug = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageTeamslug]
  }
}

