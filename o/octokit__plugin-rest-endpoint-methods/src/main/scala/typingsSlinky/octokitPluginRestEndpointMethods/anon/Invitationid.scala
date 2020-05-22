package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitationid extends js.Object {
  var invitation_id: Required
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
}

object Invitationid {
  @scala.inline
  def apply(invitation_id: Required, org_ : Required, page: Type, per_page: Type): Invitationid = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitationid]
  }
}

