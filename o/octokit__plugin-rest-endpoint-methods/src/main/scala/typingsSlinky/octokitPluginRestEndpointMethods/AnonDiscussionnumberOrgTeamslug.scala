package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscussionnumberOrgTeamslug extends js.Object {
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonDiscussionnumberOrgTeamslug {
  @scala.inline
  def apply(discussion_number: AnonRequired, org: AnonRequired, team_slug: AnonRequired): AnonDiscussionnumberOrgTeamslug = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiscussionnumberOrgTeamslug]
  }
}

