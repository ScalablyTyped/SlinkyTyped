package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discussionnumber extends js.Object {
  var content: EnumRequired
  var discussion_number: Required
  var team_id: Required
}

object Discussionnumber {
  @scala.inline
  def apply(content: EnumRequired, discussion_number: Required, team_id: Required): Discussionnumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discussionnumber]
  }
}

