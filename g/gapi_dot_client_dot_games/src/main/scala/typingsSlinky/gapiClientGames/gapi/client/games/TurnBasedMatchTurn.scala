package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchTurn extends js.Object {
  /** The shared game state data after the turn is over. */
  var data: js.UndefOr[TurnBasedMatchDataRequest] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchTurn. */
  var kind: js.UndefOr[String] = js.native
  /** The version of this match: an increasing counter, used to avoid out-of-date updates to the match. */
  var matchVersion: js.UndefOr[Double] = js.native
  /**
    * The ID of the participant who should take their turn next. May be set to the current player's participant ID to update match state without changing the
    * turn. If not set, the match will wait for other player(s) to join via automatching; this is only valid if automatch criteria is set on the match with
    * remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.native
  /** The match results for the participants in the match. */
  var results: js.UndefOr[js.Array[ParticipantResult]] = js.native
}

object TurnBasedMatchTurn {
  @scala.inline
  def apply(): TurnBasedMatchTurn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchTurn]
  }
  @scala.inline
  implicit class TurnBasedMatchTurnOps[Self <: TurnBasedMatchTurn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: TurnBasedMatchDataRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    def withMatchVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingParticipantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingParticipantId")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[ParticipantResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

