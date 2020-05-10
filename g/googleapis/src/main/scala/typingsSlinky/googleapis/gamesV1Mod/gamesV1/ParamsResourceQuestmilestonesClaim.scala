package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceQuestmilestonesClaim extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the milestone.
    */
  var milestoneId: js.UndefOr[String] = js.native
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.native
  /**
    * A numeric ID to ensure that the request is handled correctly across
    * retries. Your client application must generate this ID randomly.
    */
  var requestId: js.UndefOr[String] = js.native
}

object ParamsResourceQuestmilestonesClaim {
  @scala.inline
  def apply(): ParamsResourceQuestmilestonesClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestmilestonesClaim]
  }
  @scala.inline
  implicit class ParamsResourceQuestmilestonesClaimOps[Self <: ParamsResourceQuestmilestonesClaim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withMilestoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilestoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
  }
  
}

