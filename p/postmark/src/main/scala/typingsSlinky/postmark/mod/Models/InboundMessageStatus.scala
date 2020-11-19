package typingsSlinky.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.InboundMessageStatus")
@js.native
object InboundMessageStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[
    typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus with String
  ] = js.native
  
  /* "blocked" */ val Blocked: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
  
  /* "failed" */ val Failed: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
  
  /* "processed" */ val Processed: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
  
  /* "queued" */ val Queued: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
  
  /* "scheduled" */ val Scheduled: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
  
  /* "sent" */ val Sent: typingsSlinky.postmark.messageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
}
