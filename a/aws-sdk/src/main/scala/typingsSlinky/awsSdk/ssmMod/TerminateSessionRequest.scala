package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateSessionRequest extends js.Object {
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typingsSlinky.awsSdk.ssmMod.SessionId = js.native
}

object TerminateSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSessionRequest]
  }
  @scala.inline
  implicit class TerminateSessionRequestOps[Self <: TerminateSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionId(value: SessionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

