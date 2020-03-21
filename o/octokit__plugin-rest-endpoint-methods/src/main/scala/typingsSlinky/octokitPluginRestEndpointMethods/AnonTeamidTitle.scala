package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamidTitle extends js.Object {
  var body: AnonType
  var discussion_number: AnonRequired
  var team_id: AnonRequired
  var title: AnonType
}

object AnonTeamidTitle {
  @scala.inline
  def apply(body: AnonType, discussion_number: AnonRequired, team_id: AnonRequired, title: AnonType): AnonTeamidTitle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamidTitle]
  }
}

