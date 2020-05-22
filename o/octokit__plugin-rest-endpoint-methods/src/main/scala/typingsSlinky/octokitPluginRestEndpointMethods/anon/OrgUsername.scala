package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgUsername extends js.Object {
  @JSName("org")
  var org_ : Required
  var username: Required
}

object OrgUsername {
  @scala.inline
  def apply(org_ : Required, username: Required): OrgUsername = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgUsername]
  }
}

