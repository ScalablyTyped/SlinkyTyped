package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of leaderboard entry resources.
  */
@js.native
trait SchemaPlayerScoreResponse extends js.Object {
  /**
    * The time spans where the submitted score is better than the existing
    * score for that time span. Possible values are:   - &quot;ALL_TIME&quot; -
    * The score is an all-time score.  - &quot;WEEKLY&quot; - The score is a
    * weekly score.  - &quot;DAILY&quot; - The score is a daily score.
    */
  var beatenScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
  /**
    * The formatted value of the submitted score.
    */
  var formattedScore: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard ID that this score was submitted to.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * The scores in time spans that have not been beaten. As an example, the
    * submitted score may be better than the player&#39;s DAILY score, but not
    * better than the player&#39;s scores for the WEEKLY or ALL_TIME time
    * spans.
    */
  var unbeatenScores: js.UndefOr[js.Array[SchemaPlayerScore]] = js.native
}

object SchemaPlayerScoreResponse {
  @scala.inline
  def apply(): SchemaPlayerScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResponse]
  }
  @scala.inline
  implicit class SchemaPlayerScoreResponseOps[Self <: SchemaPlayerScoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeatenScoreTimeSpans(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beatenScoreTimeSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeatenScoreTimeSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beatenScoreTimeSpans")(js.undefined)
        ret
    }
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
    def withLeaderboardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderboardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboardId")(js.undefined)
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
    def withUnbeatenScores(value: js.Array[SchemaPlayerScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbeatenScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnbeatenScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbeatenScores")(js.undefined)
        ret
    }
  }
  
}

