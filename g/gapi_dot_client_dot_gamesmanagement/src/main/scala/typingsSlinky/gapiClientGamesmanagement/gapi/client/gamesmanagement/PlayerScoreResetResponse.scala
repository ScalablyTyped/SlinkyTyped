package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerScoreResetResponse extends js.Object {
  /** The ID of an leaderboard for which player state has been updated. */
  var definitionId: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#playerScoreResetResponse. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time spans of the updated score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
}

object PlayerScoreResetResponse {
  @scala.inline
  def apply(): PlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResetResponse]
  }
  @scala.inline
  implicit class PlayerScoreResetResponseOps[Self <: PlayerScoreResetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(js.undefined)
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
    def withResetScoreTimeSpans(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetScoreTimeSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetScoreTimeSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetScoreTimeSpans")(js.undefined)
        ret
    }
  }
  
}

