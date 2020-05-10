package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestCriterion extends js.Object {
  /** The total number of times the associated event must be incremented for the player to complete this quest. */
  var completionContribution: js.UndefOr[QuestContribution] = js.native
  /**
    * The number of increments the player has made toward the completion count event increments required to complete the quest. This value will not exceed
    * the completion contribution.
    * There will be no currentContribution until the player has accepted the quest.
    */
  var currentContribution: js.UndefOr[QuestContribution] = js.native
  /** The ID of the event the criterion corresponds to. */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The value of the event associated with this quest at the time that the quest was accepted. This value may change if event increments that took place
    * before the start of quest are uploaded after the quest starts.
    * There will be no initialPlayerProgress until the player has accepted the quest.
    */
  var initialPlayerProgress: js.UndefOr[QuestContribution] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questCriterion. */
  var kind: js.UndefOr[String] = js.native
}

object QuestCriterion {
  @scala.inline
  def apply(): QuestCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestCriterion]
  }
  @scala.inline
  implicit class QuestCriterionOps[Self <: QuestCriterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletionContribution(value: QuestContribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionContribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionContribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionContribution")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentContribution(value: QuestContribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentContribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentContribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentContribution")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPlayerProgress(value: QuestContribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPlayerProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPlayerProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPlayerProgress")(js.undefined)
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

