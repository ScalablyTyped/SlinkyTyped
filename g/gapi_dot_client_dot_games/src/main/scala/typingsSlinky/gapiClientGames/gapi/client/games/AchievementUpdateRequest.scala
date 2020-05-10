package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementUpdateRequest extends js.Object {
  /** The achievement this update is being applied to. */
  var achievementId: js.UndefOr[String] = js.native
  /** The payload if an update of type INCREMENT was requested for the achievement. */
  var incrementPayload: js.UndefOr[GamesAchievementIncrement] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateRequest. */
  var kind: js.UndefOr[String] = js.native
  /** The payload if an update of type SET_STEPS_AT_LEAST was requested for the achievement. */
  var setStepsAtLeastPayload: js.UndefOr[GamesAchievementSetStepsAtLeast] = js.native
  /**
    * The type of update being applied.
    * Possible values are:
    * - "REVEAL" - Achievement is revealed.
    * - "UNLOCK" - Achievement is unlocked.
    * - "INCREMENT" - Achievement is incremented.
    * - "SET_STEPS_AT_LEAST" - Achievement progress is set to at least the passed value.
    */
  var updateType: js.UndefOr[String] = js.native
}

object AchievementUpdateRequest {
  @scala.inline
  def apply(): AchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementUpdateRequest]
  }
  @scala.inline
  implicit class AchievementUpdateRequestOps[Self <: AchievementUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchievementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAchievementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementId")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementPayload(value: GamesAchievementIncrement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementPayload")(js.undefined)
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
    def withSetStepsAtLeastPayload(value: GamesAchievementSetStepsAtLeast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepsAtLeastPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetStepsAtLeastPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStepsAtLeastPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateType")(js.undefined)
        ret
    }
  }
  
}

