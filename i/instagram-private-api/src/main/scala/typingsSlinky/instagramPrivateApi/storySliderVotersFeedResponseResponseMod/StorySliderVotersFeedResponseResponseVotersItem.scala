package typingsSlinky.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorySliderVotersFeedResponseResponseVotersItem extends js.Object {
  var ts: Double = js.native
  var user: StorySliderVotersFeedResponseResponseUser = js.native
  var vote: Double = js.native
}

object StorySliderVotersFeedResponseResponseVotersItem {
  @scala.inline
  def apply(ts: Double, user: StorySliderVotersFeedResponseResponseUser, vote: Double): StorySliderVotersFeedResponseResponseVotersItem = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVotersItem]
  }
  @scala.inline
  implicit class StorySliderVotersFeedResponseResponseVotersItemOps[Self <: StorySliderVotersFeedResponseResponseVotersItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: StorySliderVotersFeedResponseResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVote(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

