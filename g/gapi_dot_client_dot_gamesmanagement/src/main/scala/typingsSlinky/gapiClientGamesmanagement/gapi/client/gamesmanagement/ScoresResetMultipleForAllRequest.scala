package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScoresResetMultipleForAllRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#scoresResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.native
  /** The IDs of leaderboards to reset. */
  var leaderboard_ids: js.UndefOr[js.Array[String]] = js.native
}

object ScoresResetMultipleForAllRequest {
  @scala.inline
  def apply(): ScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoresResetMultipleForAllRequest]
  }
  @scala.inline
  implicit class ScoresResetMultipleForAllRequestOps[Self <: ScoresResetMultipleForAllRequest] (val x: Self) extends AnyVal {
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
    def withLeaderboard_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboard_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaderboard_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaderboard_ids")(js.undefined)
        ret
    }
  }
  
}

