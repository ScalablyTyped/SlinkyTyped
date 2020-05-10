package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementUpdateMultipleResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateListResponse. */
  var kind: js.UndefOr[String] = js.native
  /** The updated state of the achievements. */
  var updatedAchievements: js.UndefOr[js.Array[AchievementUpdateResponse]] = js.native
}

object AchievementUpdateMultipleResponse {
  @scala.inline
  def apply(): AchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateMultipleResponse]
  }
  @scala.inline
  implicit class AchievementUpdateMultipleResponseOps[Self <: AchievementUpdateMultipleResponse] (val x: Self) extends AnyVal {
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
    def withUpdatedAchievements(value: js.Array[AchievementUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAchievements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAchievements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAchievements")(js.undefined)
        ret
    }
  }
  
}

