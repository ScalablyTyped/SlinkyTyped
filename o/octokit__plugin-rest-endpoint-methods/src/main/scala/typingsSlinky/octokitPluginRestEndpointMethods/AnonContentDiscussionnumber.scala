package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentDiscussionnumber extends js.Object {
  var content: AnonEnumRequired
  var discussion_number: AnonRequired
  var org: AnonRequired
  var team_slug: AnonRequired
}

object AnonContentDiscussionnumber {
  @scala.inline
  def apply(
    content: AnonEnumRequired,
    discussion_number: AnonRequired,
    org: AnonRequired,
    team_slug: AnonRequired
  ): AnonContentDiscussionnumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentDiscussionnumber]
  }
}

