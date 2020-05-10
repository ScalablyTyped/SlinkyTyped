package typingsSlinky.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorySliderVotersFeedResponseResponseVoterInfo extends js.Object {
  var latest_slider_vote_time: Double = js.native
  var max_id: Null = js.native
  var more_available: Boolean = js.native
  var slider_id: String = js.native
  var voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem] = js.native
}

object StorySliderVotersFeedResponseResponseVoterInfo {
  @scala.inline
  def apply(
    latest_slider_vote_time: Double,
    max_id: Null,
    more_available: Boolean,
    slider_id: String,
    voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem]
  ): StorySliderVotersFeedResponseResponseVoterInfo = {
    val __obj = js.Dynamic.literal(latest_slider_vote_time = latest_slider_vote_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], voters = voters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVoterInfo]
  }
  @scala.inline
  implicit class StorySliderVotersFeedResponseResponseVoterInfoOps[Self <: StorySliderVotersFeedResponseResponseVoterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatest_slider_vote_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_slider_vote_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_id(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMore_available(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("more_available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoters(value: js.Array[StorySliderVotersFeedResponseResponseVotersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

