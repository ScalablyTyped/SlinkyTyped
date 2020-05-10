package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchBackfillOutput extends js.Object {
  /**
    * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.MatchmakingTicket] = js.native
}

object StartMatchBackfillOutput {
  @scala.inline
  def apply(): StartMatchBackfillOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMatchBackfillOutput]
  }
  @scala.inline
  implicit class StartMatchBackfillOutputOps[Self <: StartMatchBackfillOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchmakingTicket(value: MatchmakingTicket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchmakingTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchmakingTicket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchmakingTicket")(js.undefined)
        ret
    }
  }
  
}

