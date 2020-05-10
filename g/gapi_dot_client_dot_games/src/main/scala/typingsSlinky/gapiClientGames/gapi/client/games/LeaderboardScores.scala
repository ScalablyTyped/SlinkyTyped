package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardScores extends js.Object {
  /** The scores in the leaderboard. */
  var items: js.UndefOr[js.Array[LeaderboardEntry]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScores. */
  var kind: js.UndefOr[String] = js.native
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The total number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.native
  /**
    * The score of the requesting player on the leaderboard. The player's score may appear both here and in the list of scores above. If you are viewing a
    * public leaderboard and the player is not sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will not be present.
    */
  var playerScore: js.UndefOr[LeaderboardEntry] = js.native
  /** The pagination token for the previous page of results. */
  var prevPageToken: js.UndefOr[String] = js.native
}

object LeaderboardScores {
  @scala.inline
  def apply(): LeaderboardScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardScores]
  }
  @scala.inline
  implicit class LeaderboardScoresOps[Self <: LeaderboardScores] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[LeaderboardEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNumScores(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numScores")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerScore(value: LeaderboardEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerScore")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageToken")(js.undefined)
        ret
    }
  }
  
}

