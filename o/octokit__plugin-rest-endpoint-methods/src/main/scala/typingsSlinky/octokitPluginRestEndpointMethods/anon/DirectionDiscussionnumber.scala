package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionDiscussionnumber extends js.Object {
  var direction: Enum
  var discussion_number: Required
  var page: Type
  var per_page: Type
  var team_id: Required
}

object DirectionDiscussionnumber {
  @scala.inline
  def apply(direction: Enum, discussion_number: Required, page: Type, per_page: Type, team_id: Required): DirectionDiscussionnumber = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionDiscussionnumber]
  }
}

