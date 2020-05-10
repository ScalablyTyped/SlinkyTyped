package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementResetAllResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#achievementResetAllResponse. */
  var kind: js.UndefOr[String] = js.native
  /** The achievement reset results. */
  var results: js.UndefOr[js.Array[AchievementResetResponse]] = js.native
}

object AchievementResetAllResponse {
  @scala.inline
  def apply(): AchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementResetAllResponse]
  }
  @scala.inline
  implicit class AchievementResetAllResponseOps[Self <: AchievementResetAllResponse] (val x: Self) extends AnyVal {
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
    def withResults(value: js.Array[AchievementResetResponse]): Self = {
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

