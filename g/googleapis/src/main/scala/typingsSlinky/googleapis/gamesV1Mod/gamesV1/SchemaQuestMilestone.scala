package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Quest Milestone resource.
  */
@js.native
trait SchemaQuestMilestone extends js.Object {
  /**
    * The completion reward data of the milestone, represented as a
    * Base64-encoded string. This is a developer-specified binary blob with
    * size between 0 and 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[String] = js.native
  /**
    * The criteria of the milestone.
    */
  var criteria: js.UndefOr[js.Array[SchemaQuestCriterion]] = js.native
  /**
    * The milestone ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questMilestone.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current state of the milestone. Possible values are:   -
    * &quot;COMPLETED_NOT_CLAIMED&quot; - The milestone is complete, but has
    * not yet been claimed.  - &quot;CLAIMED&quot; - The milestone is complete
    * and has been claimed.  - &quot;NOT_COMPLETED&quot; - The milestone has
    * not yet been completed.  - &quot;NOT_STARTED&quot; - The milestone is for
    * a quest that has not yet been accepted.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaQuestMilestone {
  @scala.inline
  def apply(): SchemaQuestMilestone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestMilestone]
  }
  @scala.inline
  implicit class SchemaQuestMilestoneOps[Self <: SchemaQuestMilestone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionRewardData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRewardData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionRewardData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionRewardData")(js.undefined)
        ret
    }
    @scala.inline
    def withCriteria(value: js.Array[SchemaQuestCriterion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

