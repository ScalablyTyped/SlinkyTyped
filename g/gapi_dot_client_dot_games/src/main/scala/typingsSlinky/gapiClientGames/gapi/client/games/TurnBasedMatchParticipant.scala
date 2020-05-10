package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchParticipant extends js.Object {
  /** True if this participant was auto-matched with the requesting player. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** Information about a player that has been anonymously auto-matched against the requesting player. (Either player or autoMatchedPlayer will be set.) */
  var autoMatchedPlayer: js.UndefOr[AnonymousPlayer] = js.native
  /** An identifier for the participant in the scope of the match. Cannot be used to identify a player across matches or in other contexts. */
  var id: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchParticipant. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the player. Not populated if this player was anonymously auto-matched against the requesting player. (Either player or
    * autoMatchedPlayer will be set.)
    */
  var player: js.UndefOr[Player] = js.native
  /**
    * The status of the participant with respect to the match.
    * Possible values are:
    * - "PARTICIPANT_NOT_INVITED_YET" - The participant is slated to be invited to the match, but the invitation has not been sent; the invite will be sent
    * when it becomes their turn.
    * - "PARTICIPANT_INVITED" - The participant has been invited to join the match, but has not yet responded.
    * - "PARTICIPANT_JOINED" - The participant has joined the match (either after creating it or accepting an invitation.)
    * - "PARTICIPANT_DECLINED" - The participant declined an invitation to join the match.
    * - "PARTICIPANT_LEFT" - The participant joined the match and then left it.
    * - "PARTICIPANT_FINISHED" - The participant finished playing in the match.
    * - "PARTICIPANT_UNRESPONSIVE" - The participant did not take their turn in the allotted time.
    */
  var status: js.UndefOr[String] = js.native
}

object TurnBasedMatchParticipant {
  @scala.inline
  def apply(): TurnBasedMatchParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchParticipant]
  }
  @scala.inline
  implicit class TurnBasedMatchParticipantOps[Self <: TurnBasedMatchParticipant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMatched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatched")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMatchedPlayer(value: AnonymousPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchedPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMatchedPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMatchedPlayer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayer(value: Player): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

