package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgTeamslug extends js.Object {
  var body: AnonRequired
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonOrgTeamslug {
  @scala.inline
  def apply(body: AnonRequired, discussion_number: AnonRequired, org: AnonRequired, team_slug: AnonRequired): AnonOrgTeamslug = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgTeamslug]
  }
}

