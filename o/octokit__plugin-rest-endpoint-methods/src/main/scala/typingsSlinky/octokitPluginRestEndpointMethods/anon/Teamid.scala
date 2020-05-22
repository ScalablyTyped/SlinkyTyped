package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teamid extends js.Object {
  var content: Enum
  var discussion_number: Required
  var page: Type
  var per_page: Type
  var team_id: Required
}

object Teamid {
  @scala.inline
  def apply(content: Enum, discussion_number: Required, page: Type, per_page: Type, team_id: Required): Teamid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teamid]
  }
}

