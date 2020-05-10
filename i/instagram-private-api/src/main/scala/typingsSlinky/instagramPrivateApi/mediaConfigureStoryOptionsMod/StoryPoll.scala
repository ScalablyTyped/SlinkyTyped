package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryPoll extends StorySticker {
  var is_sticker: `true` = js.native
  var question: String = js.native
  var tallies: js.Tuple2[StoryPollTallie, StoryPollTallie] = js.native
  var viewer_can_vote: `true` = js.native
  var viewer_vote: `0` = js.native
}

object StoryPoll {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: `true`,
    question: String,
    rotation: Double,
    tallies: js.Tuple2[StoryPollTallie, StoryPollTallie],
    viewer_can_vote: `true`,
    viewer_vote: `0`,
    width: Double,
    x: Double,
    y: Double
  ): StoryPoll = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any], viewer_vote = viewer_vote.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPoll]
  }
  @scala.inline
  implicit class StoryPollOps[Self <: StoryPoll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_sticker(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTallies(value: js.Tuple2[StoryPollTallie, StoryPollTallie]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tallies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_can_vote(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_can_vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_vote(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_vote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

