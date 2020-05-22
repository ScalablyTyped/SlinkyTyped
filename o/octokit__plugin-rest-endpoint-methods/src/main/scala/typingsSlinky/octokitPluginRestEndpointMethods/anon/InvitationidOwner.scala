package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationidOwner extends js.Object {
  var invitation_id: Required
  var owner: Required
  var repo: Required
}

object InvitationidOwner {
  @scala.inline
  def apply(invitation_id: Required, owner: Required, repo: Required): InvitationidOwner = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationidOwner]
  }
}

