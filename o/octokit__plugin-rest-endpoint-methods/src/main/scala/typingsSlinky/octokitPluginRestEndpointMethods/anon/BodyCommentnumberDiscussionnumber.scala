package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyCommentnumberDiscussionnumber extends js.Object {
  var body: Required
  var comment_number: Required
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object BodyCommentnumberDiscussionnumber {
  @scala.inline
  def apply(
    body: Required,
    comment_number: Required,
    discussion_number: Required,
    org_ : Required,
    team_slug: Required
  ): BodyCommentnumberDiscussionnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentnumberDiscussionnumber]
  }
}

