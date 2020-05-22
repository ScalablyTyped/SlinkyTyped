package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  @JSName("org")
  var org_ : Required
  var role: Enum
  var username: Required
}

object Role {
  @scala.inline
  def apply(org_ : Required, role: Enum, username: Required): Role = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

