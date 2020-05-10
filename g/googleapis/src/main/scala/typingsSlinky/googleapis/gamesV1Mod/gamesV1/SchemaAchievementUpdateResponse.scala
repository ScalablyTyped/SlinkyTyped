package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement update response.
  */
@js.native
trait SchemaAchievementUpdateResponse extends js.Object {
  /**
    * The achievement this update is was applied to.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * The current state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The current steps recorded for this achievement if it is incremental.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requested updates actually affected the achievement.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementUpdateResponse {
  @scala.inline
  def apply(): SchemaAchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateResponse]
  }
  @scala.inline
  implicit class SchemaAchievementUpdateResponseOps[Self <: SchemaAchievementUpdateResponse] (val x: Self) extends AnyVal {
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
    def withCurrentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSteps")(js.undefined)
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
    def withNewlyUnlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlyUnlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewlyUnlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlyUnlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOccurred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOccurred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOccurred")(js.undefined)
        ret
    }
  }
  
}

