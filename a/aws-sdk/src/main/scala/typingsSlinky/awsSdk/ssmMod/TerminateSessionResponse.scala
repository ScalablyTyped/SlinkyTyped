package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateSessionResponse extends js.Object {
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SessionId] = js.native
}

object TerminateSessionResponse {
  @scala.inline
  def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  @scala.inline
  implicit class TerminateSessionResponseOps[Self <: TerminateSessionResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionId")(js.undefined)
        ret
    }
  }
  
}

