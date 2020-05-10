package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a score rank in a leaderboard.
  */
@js.native
trait SchemaLeaderboardScoreRank extends js.Object {
  /**
    * The number of scores in the leaderboard as a string.
    */
  var formattedNumScores: js.UndefOr[String] = js.native
  /**
    * The rank in the leaderboard as a string.
    */
  var formattedRank: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardScoreRank.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String] = js.native
  /**
    * The rank in the leaderboard.
    */
  var rank: js.UndefOr[String] = js.native
}

object SchemaLeaderboardScoreRank {
  @scala.inline
  def apply(): SchemaLeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardScoreRank]
  }
  @scala.inline
  implicit class SchemaLeaderboardScoreRankOps[Self <: SchemaLeaderboardScoreRank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedNumScores(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedNumScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedNumScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedNumScores")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedRank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedRank")(js.undefined)
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
    def withRank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
  }
  
}

