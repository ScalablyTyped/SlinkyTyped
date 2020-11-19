package typingsSlinky.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "OutboundMessageStatus")
@js.native
object OutboundMessageStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsSlinky.postmark.messageFilteringParametersMod.OutboundMessageStatus with String
  ] = js.native
  
  /* "processed" */ val Processed: typingsSlinky.postmark.messageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
  
  /* "queued" */ val Queued: typingsSlinky.postmark.messageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
  
  /* "sent" */ val Sent: typingsSlinky.postmark.messageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
}
