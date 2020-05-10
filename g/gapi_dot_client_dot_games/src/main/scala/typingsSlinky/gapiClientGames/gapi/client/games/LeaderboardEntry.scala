package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardEntry extends js.Object {
  /** The localized string for the numerical value of this score. */
  var formattedScore: js.UndefOr[String] = js.native
  /** The localized string for the rank of this score for this leaderboard. */
  var formattedScoreRank: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardEntry. */
  var kind: js.UndefOr[String] = js.native
  /** The player who holds this score. */
  var player: js.UndefOr[Player] = js.native
  /** The rank of this score for this leaderboard. */
  var scoreRank: js.UndefOr[String] = js.native
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.native
  /**
    * The time span of this high score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time high score.
    * - "WEEKLY" - The score is a weekly high score.
    * - "DAILY" - The score is a daily high score.
    */
  var timeSpan: js.UndefOr[String] = js.native
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestampMillis: js.UndefOr[String] = js.native
}

object LeaderboardEntry {
  @scala.inline
  def apply(): LeaderboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardEntry]
  }
  @scala.inline
  implicit class LeaderboardEntryOps[Self <: LeaderboardEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedScore")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedScoreRank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedScoreRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedScoreRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedScoreRank")(js.undefined)
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
    def withScoreRank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreRank")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreTag")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSpan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTimestampMillis")(js.undefined)
        ret
    }
  }
  
}

