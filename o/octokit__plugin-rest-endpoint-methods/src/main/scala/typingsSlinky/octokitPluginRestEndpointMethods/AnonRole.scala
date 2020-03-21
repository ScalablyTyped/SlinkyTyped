package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRole extends js.Object {
  var org: AnonRequired
  var role: AnonEnum
  var username: AnonRequired
}

object AnonRole {
  @scala.inline
  def apply(org: AnonRequired, role: AnonEnum, username: AnonRequired): AnonRole = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRole]
  }
}

