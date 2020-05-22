package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentnumberDiscussionnumberOrg extends js.Object {
  var comment_number: Required
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object CommentnumberDiscussionnumberOrg {
  @scala.inline
  def apply(comment_number: Required, discussion_number: Required, org_ : Required, team_slug: Required): CommentnumberDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentnumberDiscussionnumberOrg]
  }
}

