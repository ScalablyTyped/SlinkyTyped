package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Only allow data when
  */
@js.native
trait QuestionnaireItemEnableWhen extends BackboneElement {
  /**
    * Contains extended information for property 'answerBoolean'.
    */
  var _answerBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerDate'.
    */
  var _answerDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerDateTime'.
    */
  var _answerDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerDecimal'.
    */
  var _answerDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerInteger'.
    */
  var _answerInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerString'.
    */
  var _answerString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerTime'.
    */
  var _answerTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'answerUri'.
    */
  var _answerUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'hasAnswer'.
    */
  var _hasAnswer: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'question'.
    */
  var _question: js.UndefOr[Element] = js.native
  /**
    * Value question must have
    */
  var answerAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Value question must have
    */
  var answerBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value question must have
    */
  var answerCoding: js.UndefOr[Coding] = js.native
  /**
    * Value question must have
    */
  var answerDate: js.UndefOr[date] = js.native
  /**
    * Value question must have
    */
  var answerDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Value question must have
    */
  var answerDecimal: js.UndefOr[decimal] = js.native
  /**
    * Value question must have
    */
  var answerInteger: js.UndefOr[integer] = js.native
  /**
    * Value question must have
    */
  var answerQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Value question must have
    */
  var answerReference: js.UndefOr[Reference] = js.native
  /**
    * Value question must have
    */
  var answerString: js.UndefOr[String] = js.native
  /**
    * Value question must have
    */
  var answerTime: js.UndefOr[time] = js.native
  /**
    * Value question must have
    */
  var answerUri: js.UndefOr[uri] = js.native
  /**
    * Enable when answered or not
    */
  var hasAnswer: js.UndefOr[Boolean] = js.native
  /**
    * Question that determines whether item is enabled
    */
  var question: String = js.native
}

object QuestionnaireItemEnableWhen {
  @scala.inline
  def apply(question: String): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
  @scala.inline
  implicit class QuestionnaireItemEnableWhenOps[Self <: QuestionnaireItemEnableWhen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_answerBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerInteger")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerString")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_answerUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_answerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_answerUri")(js.undefined)
        ret
    }
    @scala.inline
    def with_hasAnswer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_hasAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasAnswer")(js.undefined)
        ret
    }
    @scala.inline
    def with_question(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_question: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_question")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerCoding(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerReference")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerString")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerUri")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAnswer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAnswer")(js.undefined)
        ret
    }
  }
  
}

