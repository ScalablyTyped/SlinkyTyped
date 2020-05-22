package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentnumberContent extends js.Object {
  var comment_number: Required
  var content: Enum
  var discussion_number: Required
  var page: Type
  var per_page: Type
  var team_id: Required
}

object CommentnumberContent {
  @scala.inline
  def apply(
    comment_number: Required,
    content: Enum,
    discussion_number: Required,
    page: Type,
    per_page: Type,
    team_id: Required
  ): CommentnumberContent = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentnumberContent]
  }
}

