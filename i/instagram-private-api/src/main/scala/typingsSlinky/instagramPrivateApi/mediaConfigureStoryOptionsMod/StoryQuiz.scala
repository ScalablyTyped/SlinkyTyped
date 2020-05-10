package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.AnonCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuiz extends StorySticker {
  var correct_answer: String = js.native
  var end_background_color: String = js.native
  var options: js.Array[AnonCount] = js.native
  var question: String = js.native
  var start_background_color: String = js.native
  var text_color: String = js.native
  var viewer_answer: Double = js.native
  var viewer_can_answer: Boolean = js.native
}

object StoryQuiz {
  @scala.inline
  def apply(
    correct_answer: String,
    end_background_color: String,
    height: Double,
    options: js.Array[AnonCount],
    question: String,
    rotation: Double,
    start_background_color: String,
    text_color: String,
    viewer_answer: Double,
    viewer_can_answer: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuiz = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_answer = viewer_answer.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuiz]
  }
  @scala.inline
  implicit class StoryQuizOps[Self <: StoryQuiz] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrect_answer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correct_answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[AnonCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_answer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_can_answer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_can_answer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

