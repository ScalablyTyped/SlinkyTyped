package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement object.
  */
@js.native
trait SchemaPlayerAchievement extends js.Object {
  /**
    * The state of the achievement. Possible values are:   - &quot;HIDDEN&quot;
    * - Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is
    * revealed.  - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var achievementState: js.UndefOr[String] = js.native
  /**
    * The current steps for an incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Experience points earned for the achievement. This field is absent for
    * achievements that have not yet been unlocked and 0 for achievements that
    * have been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  /**
    * The current steps for an incremental achievement as a string.
    */
  var formattedCurrentStepsString: js.UndefOr[String] = js.native
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerAchievement.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last modification to this achievement&#39;s state.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}

object SchemaPlayerAchievement {
  @scala.inline
  def apply(): SchemaPlayerAchievement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerAchievement]
  }
  @scala.inline
  implicit class SchemaPlayerAchievementOps[Self <: SchemaPlayerAchievement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchievementState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAchievementState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementState")(js.undefined)
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
    def withExperiencePoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiencePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiencePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiencePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedCurrentStepsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedCurrentStepsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedCurrentStepsString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedCurrentStepsString")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLastUpdatedTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimestamp")(js.undefined)
        ret
    }
  }
  
}

