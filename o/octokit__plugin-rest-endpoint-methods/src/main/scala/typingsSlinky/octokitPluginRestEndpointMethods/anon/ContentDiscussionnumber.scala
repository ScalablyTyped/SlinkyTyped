package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDiscussionnumber extends js.Object {
  var content: EnumRequired
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object ContentDiscussionnumber {
  @scala.inline
  def apply(content: EnumRequired, discussion_number: Required, org_ : Required, team_slug: Required): ContentDiscussionnumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDiscussionnumber]
  }
}

