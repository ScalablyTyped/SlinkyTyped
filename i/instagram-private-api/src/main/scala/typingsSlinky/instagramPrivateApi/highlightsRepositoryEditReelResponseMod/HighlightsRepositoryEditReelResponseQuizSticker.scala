package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryEditReelResponseQuizSticker extends js.Object {
  var correct_answer: Double = js.native
  var end_background_color: String = js.native
  var finished: Boolean = js.native
  var id: String = js.native
  var question: String = js.native
  var quiz_id: String = js.native
  var start_background_color: String = js.native
  var tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem] = js.native
  var text_color: String = js.native
  var viewer_can_answer: Boolean = js.native
}

object HighlightsRepositoryEditReelResponseQuizSticker {
  @scala.inline
  def apply(
    correct_answer: Double,
    end_background_color: String,
    finished: Boolean,
    id: String,
    question: String,
    quiz_id: String,
    start_background_color: String,
    tallies: js.Array[HighlightsRepositoryEditReelResponseTalliesItem],
    text_color: String,
    viewer_can_answer: Boolean
  ): HighlightsRepositoryEditReelResponseQuizSticker = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_answer = viewer_can_answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseQuizSticker]
  }
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseQuizStickerOps[Self <: HighlightsRepositoryEditReelResponseQuizSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrect_answer(value: Double): Self = {
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
    def withFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiz_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiz_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTallies(value: js.Array[HighlightsRepositoryEditReelResponseTalliesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tallies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
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

