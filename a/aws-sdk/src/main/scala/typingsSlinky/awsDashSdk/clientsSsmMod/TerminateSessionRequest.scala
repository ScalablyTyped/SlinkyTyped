package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateSessionRequest extends js.Object {
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typingsSlinky.awsDashSdk.clientsSsmMod.SessionId = js.native
}

object TerminateSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TerminateSessionRequest]
  }
}

