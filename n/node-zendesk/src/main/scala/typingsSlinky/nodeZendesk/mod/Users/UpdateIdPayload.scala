package typingsSlinky.nodeZendesk.mod.Users

import typingsSlinky.nodeZendesk.anon.Externalids
import typingsSlinky.nodeZendesk.anon.Ids
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[typingsSlinky.nodeZendesk.mod.ZendeskID]
  - typingsSlinky.nodeZendesk.anon.Ids
  - typingsSlinky.nodeZendesk.anon.Externalids
*/
trait UpdateIdPayload extends js.Object

object UpdateIdPayload {
  @scala.inline
  implicit def apply(value: js.Array[ZendeskID]): UpdateIdPayload = value.asInstanceOf[UpdateIdPayload]
  @scala.inline
  implicit def apply(value: Externalids): UpdateIdPayload = value.asInstanceOf[UpdateIdPayload]
  @scala.inline
  implicit def apply(value: Ids): UpdateIdPayload = value.asInstanceOf[UpdateIdPayload]
  @scala.inline
  implicit def apply(value: String): UpdateIdPayload = value.asInstanceOf[UpdateIdPayload]
}

