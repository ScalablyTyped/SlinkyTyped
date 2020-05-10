package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement unlock response.
  */
@js.native
trait SchemaAchievementUpdateMultipleResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updated state of the achievements.
    */
  var updatedAchievements: js.UndefOr[js.Array[SchemaAchievementUpdateResponse]] = js.native
}

object SchemaAchievementUpdateMultipleResponse {
  @scala.inline
  def apply(): SchemaAchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleResponse]
  }
  @scala.inline
  implicit class SchemaAchievementUpdateMultipleResponseOps[Self <: SchemaAchievementUpdateMultipleResponse] (val x: Self) extends AnyVal {
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
    def withUpdatedAchievements(value: js.Array[SchemaAchievementUpdateResponse]): Self = {
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

