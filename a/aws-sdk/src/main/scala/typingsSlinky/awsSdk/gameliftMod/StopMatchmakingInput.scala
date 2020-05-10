package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMatchmakingInput extends js.Object {
  /**
    * A unique identifier for a matchmaking ticket.
    */
  var TicketId: MatchmakingIdStringModel = js.native
}

object StopMatchmakingInput {
  @scala.inline
  def apply(TicketId: MatchmakingIdStringModel): StopMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketId = TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMatchmakingInput]
  }
  @scala.inline
  implicit class StopMatchmakingInputOps[Self <: StopMatchmakingInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTicketId(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TicketId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

