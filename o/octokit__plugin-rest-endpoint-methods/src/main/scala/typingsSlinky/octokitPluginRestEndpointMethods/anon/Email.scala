package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: Type
  var invitee_id: Type
  @JSName("org")
  var org_ : Required
  var role: Enum
  var team_ids: Type
}

object Email {
  @scala.inline
  def apply(email: Type, invitee_id: Type, org_ : Required, role: Enum, team_ids: Type): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], invitee_id = invitee_id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

