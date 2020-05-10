package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement reset response.
  */
@js.native
trait SchemaAchievementResetResponse extends js.Object {
  /**
    * The current state of the achievement. This is the same as the initial
    * state of the achievement. Possible values are:   - &quot;HIDDEN&quot;-
    * Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is revealed.
    * - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The ID of an achievement for which player state has been updated.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Flag to indicate if the requested update actually occurred.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementResetResponse {
  @scala.inline
  def apply(): SchemaAchievementResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetResponse]
  }
  @scala.inline
  implicit class SchemaAchievementResetResponseOps[Self <: SchemaAchievementResetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDefinitionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(js.undefined)
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

