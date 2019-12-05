package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val identity: typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(identity: typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

