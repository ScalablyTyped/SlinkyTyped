package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a request to submit a score to leaderboards.
  */
@js.native
trait SchemaScoreSubmission extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#scoreSubmission.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard this score is being submitted to.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  /**
    * The new score being submitted.
    */
  var score: js.UndefOr[String] = js.native
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * Signature Values will contain URI-safe characters as defined by
    * section 2.3 of RFC 3986.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaScoreSubmission {
  @scala.inline
  def apply(): SchemaScoreSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoreSubmission]
  }
  @scala.inline
  implicit class SchemaScoreSubmissionOps[Self <: SchemaScoreSubmission] (val x: Self) extends AnyVal {
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
    def withScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
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
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

