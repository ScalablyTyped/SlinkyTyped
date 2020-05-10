package typingsSlinky.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuizParticipantsFeedResponseParticipantsItem extends js.Object {
  var answer: Double = js.native
  var ts: Double = js.native
  var user: StoryQuizParticipantsFeedResponseUser = js.native
}

object StoryQuizParticipantsFeedResponseParticipantsItem {
  @scala.inline
  def apply(answer: Double, ts: Double, user: StoryQuizParticipantsFeedResponseUser): StoryQuizParticipantsFeedResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantsItem]
  }
  @scala.inline
  implicit class StoryQuizParticipantsFeedResponseParticipantsItemOps[Self <: StoryQuizParticipantsFeedResponseParticipantsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: StoryQuizParticipantsFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

