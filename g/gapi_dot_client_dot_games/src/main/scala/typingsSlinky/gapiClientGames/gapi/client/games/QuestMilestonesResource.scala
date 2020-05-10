package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonMilestoneId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: AnonMilestoneId): Request_[Unit] = js.native
}

object QuestMilestonesResource {
  @scala.inline
  def apply(claim: AnonMilestoneId => Request_[Unit]): QuestMilestonesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim))
    __obj.asInstanceOf[QuestMilestonesResource]
  }
  @scala.inline
  implicit class QuestMilestonesResourceOps[Self <: QuestMilestonesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: AnonMilestoneId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

