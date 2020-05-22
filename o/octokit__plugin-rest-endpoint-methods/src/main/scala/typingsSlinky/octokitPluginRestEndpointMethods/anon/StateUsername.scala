package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateUsername extends js.Object {
  var page: Type
  var per_page: Type
  var state: Enum
  var username: Required
}

object StateUsername {
  @scala.inline
  def apply(page: Type, per_page: Type, state: Enum, username: Required): StateUsername = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateUsername]
  }
}

