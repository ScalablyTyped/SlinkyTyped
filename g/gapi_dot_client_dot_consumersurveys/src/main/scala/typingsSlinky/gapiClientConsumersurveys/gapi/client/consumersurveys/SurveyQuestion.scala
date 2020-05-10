package typingsSlinky.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyQuestion extends js.Object {
  var answerOrder: js.UndefOr[String] = js.native
  var answers: js.UndefOr[js.Array[String]] = js.native
  var hasOther: js.UndefOr[Boolean] = js.native
  var highValueLabel: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Array[SurveyQuestionImage]] = js.native
  var lastAnswerPositionPinned: js.UndefOr[Boolean] = js.native
  var lowValueLabel: js.UndefOr[String] = js.native
  var mustPickSuggestion: js.UndefOr[Boolean] = js.native
  var numStars: js.UndefOr[String] = js.native
  var openTextPlaceholder: js.UndefOr[String] = js.native
  var openTextSuggestions: js.UndefOr[js.Array[String]] = js.native
  var question: js.UndefOr[String] = js.native
  var sentimentText: js.UndefOr[String] = js.native
  var singleLineResponse: js.UndefOr[Boolean] = js.native
  var thresholdAnswers: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var unitOfMeasurementLabel: js.UndefOr[String] = js.native
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

