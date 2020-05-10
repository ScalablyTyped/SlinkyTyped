package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementConfiguration extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  /** The draft data of the achievement. */
  var draft: js.UndefOr[AchievementConfigurationDetail] = js.native
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfiguration. */
  var kind: js.UndefOr[String] = js.native
  /** The read-only published data of the achievement. */
  var published: js.UndefOr[AchievementConfigurationDetail] = js.native
  /** Steps to unlock. Only applicable to incremental achievements. */
  var stepsToUnlock: js.UndefOr[Double] = js.native
  /** The token for this resource. */
  var token: js.UndefOr[String] = js.native
}

object AchievementConfiguration {
  @scala.inline
  def apply(): AchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementConfiguration]
  }
  @scala.inline
  implicit class AchievementConfigurationOps[Self <: AchievementConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchievementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAchievementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievementType")(js.undefined)
        ret
    }
    @scala.inline
    def withDraft(value: AchievementConfigurationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(js.undefined)
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
    def withInitialState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
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
    def withPublished(value: AchievementConfigurationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withStepsToUnlock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsToUnlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepsToUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepsToUnlock")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

