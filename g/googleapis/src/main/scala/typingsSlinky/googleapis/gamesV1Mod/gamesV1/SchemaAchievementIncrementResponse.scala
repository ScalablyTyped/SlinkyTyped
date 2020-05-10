package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement increment response
  */
@js.native
trait SchemaAchievementIncrementResponse extends js.Object {
  /**
    * The current steps recorded for this incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementIncrementResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether the current steps for the achievement has reached the number of
    * steps required to unlock.
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementIncrementResponse {
  @scala.inline
  def apply(): SchemaAchievementIncrementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementIncrementResponse]
  }
  @scala.inline
  implicit class SchemaAchievementIncrementResponseOps[Self <: SchemaAchievementIncrementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

