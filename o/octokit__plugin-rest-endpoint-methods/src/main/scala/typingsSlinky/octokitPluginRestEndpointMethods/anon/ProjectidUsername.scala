package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectidUsername extends js.Object {
  var project_id: Required
  var username: Required
}

object ProjectidUsername {
  @scala.inline
  def apply(project_id: Required, username: Required): ProjectidUsername = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidUsername]
  }
}

