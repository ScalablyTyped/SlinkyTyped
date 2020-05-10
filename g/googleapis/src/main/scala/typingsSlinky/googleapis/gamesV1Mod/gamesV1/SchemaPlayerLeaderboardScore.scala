package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a player leaderboard score object.
  */
@js.native
trait SchemaPlayerLeaderboardScore extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLeaderboardScore.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the leaderboard this score is in.
    */
  var leaderboard_id: js.UndefOr[String] = js.native
  /**
    * The public rank of the score in this leaderboard. This object will not be
    * present if the user is not sharing their scores publicly.
    */
  var publicRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.native
  /**
    * The formatted value of this score.
    */
  var scoreString: js.UndefOr[String] = js.native
  /**
    * Additional information about the score. Values must contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * The numerical value of this score.
    */
  var scoreValue: js.UndefOr[String] = js.native
  /**
    * The social rank of the score in this leaderboard.
    */
  var socialRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.native
  /**
    * The time span of this score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time score.  -
    * &quot;WEEKLY&quot; - The score is a weekly score.  - &quot;DAILY&quot; -
    * The score is a daily score.
    */
  var timeSpan: js.UndefOr[String] = js.native
  /**
    * The timestamp at which this score was recorded, in milliseconds since the
    * epoch in UTC.
    */
  var writeTimestamp: js.UndefOr[String] = js.native
}

object SchemaPlayerLeaderboardScore {
  @scala.inline
  def apply(): SchemaPlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLeaderboardScore]
  }
  @scala.inline
  implicit class SchemaPlayerLeaderboardScoreOps[Self <: SchemaPlayerLeaderboardScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLeaderboard_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboard_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderboard_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboard_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicRank(value: SchemaLeaderboardScoreRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicRank")(js.undefined)
        ret
    }
    @scala.inline
    def withScoreString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoreString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreString")(js.undefined)
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
    def withSocialRank(value: SchemaLeaderboardScoreRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socialRank")(js.undefined)
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
    def withWriteTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTimestamp")(js.undefined)
        ret
    }
  }
  
}

