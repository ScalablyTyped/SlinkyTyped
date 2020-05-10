package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for multiple achievements reset all request.
  */
@js.native
trait SchemaAchievementResetMultipleForAllRequest extends js.Object {
  /**
    * The IDs of achievements to reset.
    */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAchievementResetMultipleForAllRequest {
  @scala.inline
  def apply(): SchemaAchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetMultipleForAllRequest]
  }
  @scala.inline
  implicit class SchemaAchievementResetMultipleForAllRequestOps[Self <: SchemaAchievementResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchievement_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievement_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAchievement_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achievement_ids")(js.undefined)
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
  }
  
}

