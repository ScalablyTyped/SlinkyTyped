package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerPermissions extends js.Object {
  var invitation_id: Required
  var owner: Required
  var permissions: Enum
  var repo: Required
}

object OwnerPermissions {
  @scala.inline
  def apply(invitation_id: Required, owner: Required, permissions: Enum, repo: Required): OwnerPermissions = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerPermissions]
  }
}

