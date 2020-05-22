package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teamslug extends js.Object {
  var comment_number: Required
  var content: EnumRequired
  var discussion_number: Required
  @JSName("org")
  var org_ : Required
  var team_slug: Required
}

object Teamslug {
  @scala.inline
  def apply(
    comment_number: Required,
    content: EnumRequired,
    discussion_number: Required,
    org_ : Required,
    team_slug: Required
  ): Teamslug = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teamslug]
  }
}

