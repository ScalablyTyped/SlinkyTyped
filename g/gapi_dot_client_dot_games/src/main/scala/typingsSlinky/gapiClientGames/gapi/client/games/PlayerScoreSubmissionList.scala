package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerScoreSubmissionList extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreSubmissionList. */
  var kind: js.UndefOr[String] = js.native
  /** The score submissions. */
  var scores: js.UndefOr[js.Array[ScoreSubmission]] = js.native
}

object PlayerScoreSubmissionList {
  @scala.inline
  def apply(): PlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreSubmissionList]
  }
  @scala.inline
  implicit class PlayerScoreSubmissionListOps[Self <: PlayerScoreSubmissionList] (val x: Self) extends AnyVal {
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
    def withScores(value: js.Array[ScoreSubmission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(js.undefined)
        ret
    }
  }
  
}

