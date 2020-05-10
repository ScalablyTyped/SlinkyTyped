package typingsSlinky.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuizParticipantsFeedResponseParticipantInfo extends js.Object {
  var max_id: Null = js.native
  var more_available: Boolean = js.native
  var participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem] = js.native
  var quiz_id: String = js.native
}

object StoryQuizParticipantsFeedResponseParticipantInfo {
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem],
    quiz_id: String
  ): StoryQuizParticipantsFeedResponseParticipantInfo = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantInfo]
  }
  @scala.inline
  implicit class StoryQuizParticipantsFeedResponseParticipantInfoOps[Self <: StoryQuizParticipantsFeedResponseParticipantInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withParticipants(value: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiz_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiz_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

