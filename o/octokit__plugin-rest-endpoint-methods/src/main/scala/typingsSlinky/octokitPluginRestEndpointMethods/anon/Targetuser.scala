package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targetuser extends js.Object {
  var target_user: Required
  var username: Required
}

object Targetuser {
  @scala.inline
  def apply(target_user: Required, username: Required): Targetuser = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetuser]
  }
}

