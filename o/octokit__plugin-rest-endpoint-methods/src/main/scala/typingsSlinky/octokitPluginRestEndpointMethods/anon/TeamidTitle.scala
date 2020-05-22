package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamidTitle extends js.Object {
  var body: Type
  var discussion_number: Required
  var team_id: Required
  var title: Type
}

object TeamidTitle {
  @scala.inline
  def apply(body: Type, discussion_number: Required, team_id: Required, title: Type): TeamidTitle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamidTitle]
  }
}

