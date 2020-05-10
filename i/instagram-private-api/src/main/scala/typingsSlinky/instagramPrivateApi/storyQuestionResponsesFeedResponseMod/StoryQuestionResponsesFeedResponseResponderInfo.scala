package typingsSlinky.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuestionResponsesFeedResponseResponderInfo extends js.Object {
  var background_color: String = js.native
  var latest_question_response_time: Double = js.native
  var max_id: Null = js.native
  var more_available: Boolean = js.native
  var question: String = js.native
  var question_id: String = js.native
  var question_response_count: Double = js.native
  var question_type: String = js.native
  var responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem] = js.native
  var text_color: String = js.native
  var unanswered_response_count: Double = js.native
}

object StoryQuestionResponsesFeedResponseResponderInfo {
  @scala.inline
  def apply(
    background_color: String,
    latest_question_response_time: Double,
    max_id: Null,
    more_available: Boolean,
    question: String,
    question_id: String,
    question_response_count: Double,
    question_type: String,
    responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem],
    text_color: String,
    unanswered_response_count: Double
  ): StoryQuestionResponsesFeedResponseResponderInfo = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], latest_question_response_time = latest_question_response_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_response_count = question_response_count.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], responders = responders.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], unanswered_response_count = unanswered_response_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseResponderInfo]
  }
  @scala.inline
  implicit class StoryQuestionResponsesFeedResponseResponderInfoOps[Self <: StoryQuestionResponsesFeedResponseResponderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest_question_response_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest_question_response_time")(value.asInstanceOf[js.Any])
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
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_response_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_response_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponders(value: js.Array[StoryQuestionResponsesFeedResponseRespondersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnanswered_response_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unanswered_response_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

