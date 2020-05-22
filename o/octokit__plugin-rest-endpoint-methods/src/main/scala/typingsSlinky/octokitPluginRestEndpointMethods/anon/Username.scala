package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Username extends js.Object {
  var page: Type
  var per_page: Type
  var username: Required
}

object Username {
  @scala.inline
  def apply(page: Type, per_page: Type, username: Required): Username = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Username]
  }
}

