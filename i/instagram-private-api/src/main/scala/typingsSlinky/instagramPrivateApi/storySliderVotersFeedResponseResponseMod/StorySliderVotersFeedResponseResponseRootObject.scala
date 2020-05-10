package typingsSlinky.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorySliderVotersFeedResponseResponseRootObject extends js.Object {
  var status: String = js.native
  var voter_info: StorySliderVotersFeedResponseResponseVoterInfo = js.native
}

object StorySliderVotersFeedResponseResponseRootObject {
  @scala.inline
  def apply(status: String, voter_info: StorySliderVotersFeedResponseResponseVoterInfo): StorySliderVotersFeedResponseResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseRootObject]
  }
  @scala.inline
  implicit class StorySliderVotersFeedResponseResponseRootObjectOps[Self <: StorySliderVotersFeedResponseResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoter_info(value: StorySliderVotersFeedResponseResponseVoterInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voter_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

