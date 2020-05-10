package typingsSlinky.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A score entry for an Instant Game leaderboard
  */
@js.native
trait LeaderboardEntry extends js.Object {
  /**
    * Gets the developer-specified payload associated with the score, or null if one was not set.
    * @returns An optional developer-specified payload associated with the score.
    */
  def getExtraData(): String | Null = js.native
  /**
    * Gets the score associated with the entry, formatted with the score format associated with the leaderboard.
    * @returns Returns a formatted score.
    */
  def getFormattedScore(): String = js.native
  /**
    * Gets information about the player associated with the entry.
    */
  def getPlayer(): LeaderboardPlayer = js.native
  /**
    * Gets the rank of the player's score in the leaderboard
    * @returns Returns the entry's leaderboard ranking.
    */
  def getRank(): Double = js.native
  /**
    * Gets the score associated with the entry.
    * @returns Returns an integer score value.
    */
  def getScore(): Double = js.native
  /**
    * Gets the timestamp of when the leaderboard entry was last updated.
    * @returns Returns a Unix timestamp.
    */
  def getTimestamp(): Double = js.native
}

object LeaderboardEntry {
  @scala.inline
  def apply(
    getExtraData: () => String | Null,
    getFormattedScore: () => String,
    getPlayer: () => LeaderboardPlayer,
    getRank: () => Double,
    getScore: () => Double,
    getTimestamp: () => Double
  ): LeaderboardEntry = {
    val __obj = js.Dynamic.literal(getExtraData = js.Any.fromFunction0(getExtraData), getFormattedScore = js.Any.fromFunction0(getFormattedScore), getPlayer = js.Any.fromFunction0(getPlayer), getRank = js.Any.fromFunction0(getRank), getScore = js.Any.fromFunction0(getScore), getTimestamp = js.Any.fromFunction0(getTimestamp))
    __obj.asInstanceOf[LeaderboardEntry]
  }
  @scala.inline
  implicit class LeaderboardEntryOps[Self <: LeaderboardEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetExtraData(value: () => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormattedScore(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedScore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlayer(value: () => LeaderboardPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRank(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRank")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScore(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimestamp(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimestamp")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

