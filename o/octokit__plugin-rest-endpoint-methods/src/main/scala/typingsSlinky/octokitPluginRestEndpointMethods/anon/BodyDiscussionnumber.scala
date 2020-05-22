package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyDiscussionnumber extends js.Object {
  var body: Required
  var discussion_number: Required
  var team_id: Required
}

object BodyDiscussionnumber {
  @scala.inline
  def apply(body: Required, discussion_number: Required, team_id: Required): BodyDiscussionnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyDiscussionnumber]
  }
}

