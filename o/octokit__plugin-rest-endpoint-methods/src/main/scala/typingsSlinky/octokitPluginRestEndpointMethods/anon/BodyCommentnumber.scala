package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyCommentnumber extends js.Object {
  var body: Required
  var comment_number: Required
  var discussion_number: Required
  var team_id: Required
}

object BodyCommentnumber {
  @scala.inline
  def apply(body: Required, comment_number: Required, discussion_number: Required, team_id: Required): BodyCommentnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentnumber]
  }
}

