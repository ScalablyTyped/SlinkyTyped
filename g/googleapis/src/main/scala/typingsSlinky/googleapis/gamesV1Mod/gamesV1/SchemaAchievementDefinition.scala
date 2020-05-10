package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement definition object.
  */
@js.native
trait SchemaAchievementDefinition extends js.Object {
  /**
    * The type of the achievement. Possible values are:   -
    * &quot;STANDARD&quot; - Achievement is either locked or unlocked.  -
    * &quot;INCREMENTAL&quot; - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  /**
    * The description of the achievement.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Experience points which will be earned when unlocking this achievement.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  /**
    * The total steps for an incremental achievement as a string.
    */
  var formattedTotalSteps: js.UndefOr[String] = js.native
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  /**
    * Indicates whether the revealed icon image being returned is a default
    * image, or is provided by the game.
    */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the unlocked icon image being returned is a default
    * image, or is game-provided.
    */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementDefinition.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the achievement.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The image URL for the revealed achievement icon.
    */
  var revealedIconUrl: js.UndefOr[String] = js.native
  /**
    * The total steps for an incremental achievement.
    */
  var totalSteps: js.UndefOr[Double] = js.native
  /**
    * The image URL for the unlocked achievement icon.
    */
  var unlockedIconUrl: js.UndefOr[String] = js.native
}

object SchemaAchievementDefinition {
  @scala.inline
  def apply(): SchemaAchievementDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementDefinition]
  }
  @scala.inline
  implicit class SchemaAchievementDefinitionOps[Self <: SchemaAchievementDefinition] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withFormattedTotalSteps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedTotalSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedTotalSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedTotalSteps")(js.undefined)
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
    def withIsRevealedIconUrlDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRevealedIconUrlDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRevealedIconUrlDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRevealedIconUrlDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUnlockedIconUrlDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnlockedIconUrlDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUnlockedIconUrlDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnlockedIconUrlDefault")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRevealedIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealedIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevealedIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revealedIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlockedIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockedIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlockedIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlockedIconUrl")(js.undefined)
        ret
    }
  }
  
}

