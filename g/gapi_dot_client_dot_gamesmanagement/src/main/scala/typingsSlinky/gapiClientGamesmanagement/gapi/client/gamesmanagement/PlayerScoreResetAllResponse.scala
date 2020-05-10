package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerScoreResetAllResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#playerScoreResetResponse. */
  var kind: js.UndefOr[String] = js.native
  /** The leaderboard reset results. */
  var results: js.UndefOr[js.Array[PlayerScoreResetResponse]] = js.native
}

object PlayerScoreResetAllResponse {
  @scala.inline
  def apply(): PlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResetAllResponse]
  }
  @scala.inline
  implicit class PlayerScoreResetAllResponseOps[Self <: PlayerScoreResetAllResponse] (val x: Self) extends AnyVal {
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
    def withResults(value: js.Array[PlayerScoreResetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

