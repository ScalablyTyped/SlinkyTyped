package typingsSlinky.nodeZendesk.anon

import typingsSlinky.nodeZendesk.mod.Users._UpdateIdPayload
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids extends _UpdateIdPayload {
  var ids: js.Array[ZendeskID]
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
}

