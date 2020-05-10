package typingsSlinky.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardScore extends js.Object {
  /**
    * The developer-specified payload associated with the score, or null if one was not set.
    */
  var data: String = js.native
  /**
    * The game's unique identifier for the player.
    */
  var playerID: String = js.native
  /**
    * The player's localized display name.
    */
  var playerName: String = js.native
  /**
    * A url to the player's public profile photo.
    */
  var playerPhotoURL: String = js.native
  /**
    * The entry's leaderboard ranking.
    */
  var rank: integer = js.native
  /**
    * An integer score value.
    */
  var score: integer = js.native
  /**
    * The score value, formatted with the score format associated with the leaderboard.
    */
  var scoreFormatted: String = js.native
  /**
    * The Unix timestamp of when the leaderboard entry was last updated.
    */
  var timestamp: integer = js.native
}

object LeaderboardScore {
  @scala.inline
  def apply(
    data: String,
    playerID: String,
    playerName: String,
    playerPhotoURL: String,
    rank: integer,
    score: integer,
    scoreFormatted: String,
    timestamp: integer
  ): LeaderboardScore = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], playerID = playerID.asInstanceOf[js.Any], playerName = playerName.asInstanceOf[js.Any], playerPhotoURL = playerPhotoURL.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], scoreFormatted = scoreFormatted.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardScore]
  }
  @scala.inline
  implicit class LeaderboardScoreOps[Self <: LeaderboardScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerPhotoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerPhotoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScoreFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreFormatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

