package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletionContribution(value: QuestContribution): Self = this.set("completionContribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionContribution: Self = this.set("completionContribution", js.undefined)
    
    @scala.inline
    def setCurrentContribution(value: QuestContribution): Self = this.set("currentContribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentContribution: Self = this.set("currentContribution", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setInitialPlayerProgress(value: QuestContribution): Self = this.set("initialPlayerProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPlayerProgress: Self = this.set("initialPlayerProgress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
