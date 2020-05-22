package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerPermission extends js.Object {
  var owner: Required
  var permission: Enum
  var repo: Required
  var username: Required
}

object OwnerPermission {
  @scala.inline
  def apply(owner: Required, permission: Enum, repo: Required, username: Required): OwnerPermission = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerPermission]
  }
}

