package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement unlock response
  */
@js.native
trait SchemaAchievementUnlockResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUnlockResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementUnlockResponse {
  @scala.inline
  def apply(): SchemaAchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUnlockResponse]
  }
  @scala.inline
  implicit class SchemaAchievementUnlockResponseOps[Self <: SchemaAchievementUnlockResponse] (val x: Self) extends AnyVal {
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

