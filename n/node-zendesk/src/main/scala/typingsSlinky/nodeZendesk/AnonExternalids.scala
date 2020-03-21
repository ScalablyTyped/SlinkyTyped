package typingsSlinky.nodeZendesk

import typingsSlinky.nodeZendesk.mod.Users._UpdateIdPayload
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternalids extends _UpdateIdPayload {
  var external_ids: js.Array[ZendeskID]
}

object AnonExternalids {
  @scala.inline
  def apply(external_ids: js.Array[ZendeskID]): AnonExternalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExternalids]
  }
}

