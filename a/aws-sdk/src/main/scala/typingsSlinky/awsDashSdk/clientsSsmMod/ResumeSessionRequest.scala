package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeSessionRequest extends js.Object {
  /**
    * The ID of the disconnected session to resume.
    */
  var SessionId: typingsSlinky.awsDashSdk.clientsSsmMod.SessionId = js.native
}

object ResumeSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): ResumeSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResumeSessionRequest]
  }
}

