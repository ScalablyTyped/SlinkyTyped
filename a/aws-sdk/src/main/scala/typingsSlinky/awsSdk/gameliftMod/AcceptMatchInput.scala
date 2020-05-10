package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptMatchInput extends js.Object {
  /**
    * Player response to the proposed match.
    */
  var AcceptanceType: typingsSlinky.awsSdk.gameliftMod.AcceptanceType = js.native
  /**
    * A unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
    */
  var PlayerIds: StringList = js.native
  /**
    * A unique identifier for a matchmaking ticket. The ticket must be in status REQUIRES_ACCEPTANCE; otherwise this request will fail.
    */
  var TicketId: MatchmakingIdStringModel = js.native
}

object AcceptMatchInput {
  @scala.inline
  def apply(AcceptanceType: AcceptanceType, PlayerIds: StringList, TicketId: MatchmakingIdStringModel): AcceptMatchInput = {
    val __obj = js.Dynamic.literal(AcceptanceType = AcceptanceType.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any], TicketId = TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptMatchInput]
  }
  @scala.inline
  implicit class AcceptMatchInputOps[Self <: AcceptMatchInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceType(value: AcceptanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicketId(value: MatchmakingIdStringModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TicketId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

