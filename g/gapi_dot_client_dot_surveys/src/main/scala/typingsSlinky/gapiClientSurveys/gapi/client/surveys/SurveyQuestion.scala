package typingsSlinky.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyQuestion extends js.Object {
  /** The randomization option for multiple choice and multi-select questions. If not specified, this option defaults to randomize. */
  var answerOrder: js.UndefOr[String] = js.native
  /** Required list of answer options for a question. */
  var answers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Option to allow open-ended text box for Single Answer and Multiple Answer question types. This can be used with SINGLE_ANSWER,
    * SINGLE_ANSWER_WITH_IMAGE, MULTIPLE_ANSWERS, and MULTIPLE_ANSWERS_WITH_IMAGE question types.
    */
  var hasOther: js.UndefOr[Boolean] = js.native
  /**
    * For rating questions, the text for the higher end of the scale, such as 'Best'. For numeric questions, a string representing a floating-point that is
    * the maximum allowed number for a response.
    */
  var highValueLabel: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.native
  /** Currently only support pinning an answer option to the last position. */
  var lastAnswerPositionPinned: js.UndefOr[Boolean] = js.native
  /**
    * For rating questions, the text for the lower end of the scale, such as 'Worst'. For numeric questions, a string representing a floating-point that is
    * the minimum allowed number for a response.
    */
  var lowValueLabel: js.UndefOr[String] = js.native
  /** Option to force the user to pick one of the open text suggestions. This requires that suggestions are provided for this question. */
  var mustPickSuggestion: js.UndefOr[Boolean] = js.native
  /** Number of stars to use for ratings questions. */
  var numStars: js.UndefOr[String] = js.native
  /** Placeholder text for an open text question. */
  var openTextPlaceholder: js.UndefOr[String] = js.native
  /** A list of suggested answers for open text question auto-complete. This is only valid if single_line_response is true. */
  var openTextSuggestions: js.UndefOr[js.Array[String]] = js.native
  /** Required question text shown to the respondent. */
  var question: js.UndefOr[String] = js.native
  /**
    * Used by the Rating Scale with Text question type. This text goes along with the question field that is presented to the respondent, and is the actual
    * text that the respondent is asked to rate.
    */
  var sentimentText: js.UndefOr[String] = js.native
  /**
    * Option to allow multiple line open text responses instead of a single line response. Note that we don't show auto-complete suggestions with multiple
    * line responses.
    */
  var singleLineResponse: js.UndefOr[Boolean] = js.native
  /** The threshold/screener answer options, which will screen a user into the rest of the survey. These will be a subset of the answer option strings. */
  var thresholdAnswers: js.UndefOr[js.Array[String]] = js.native
  /** Required field defining the question type. For details about configuring different type of questions, consult the question configuration guide. */
  var `type`: js.UndefOr[String] = js.native
  /** Optional unit of measurement for display (for example: hours, people, miles). */
  var unitOfMeasurementLabel: js.UndefOr[String] = js.native
  /** The YouTube video ID to be show in video questions. */
  var videoId: js.UndefOr[String] = js.native
}

object SurveyQuestion {
  @scala.inline
  def apply(): SurveyQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyQuestion]
  }
  @scala.inline
  implicit class SurveyQuestionOps[Self <: SurveyQuestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswerOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(js.undefined)
        ret
    }
    @scala.inline
    def withHasOther(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOther")(js.undefined)
        ret
    }
    @scala.inline
    def withHighValueLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[SurveyQuestionImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAnswerPositionPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAnswerPositionPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAnswerPositionPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAnswerPositionPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withLowValueLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMustPickSuggestion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustPickSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMustPickSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mustPickSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withNumStars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numStars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumStars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numStars")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenTextPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTextPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenTextPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTextPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenTextSuggestions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTextSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenTextSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTextSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(js.undefined)
        ret
    }
    @scala.inline
    def withSentimentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentimentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentimentText")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleLineResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLineResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleLineResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLineResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdAnswers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdAnswers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdAnswers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdAnswers")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitOfMeasurementLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitOfMeasurementLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitOfMeasurementLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitOfMeasurementLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

