package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer.MatchConfidenceLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Answer. */
@js.native
trait IAnswer extends js.Object {
  /** Answer answer */
  var answer: js.UndefOr[String | Null] = js.native
  /** Answer faqQuestion */
  var faqQuestion: js.UndefOr[String | Null] = js.native
  /** Answer matchConfidence */
  var matchConfidence: js.UndefOr[Double | Null] = js.native
  /** Answer matchConfidenceLevel */
  var matchConfidenceLevel: js.UndefOr[MatchConfidenceLevel | Null] = js.native
  /** Answer source */
  var source: js.UndefOr[String | Null] = js.native
}

object IAnswer {
  @scala.inline
  def apply(): IAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnswer]
  }
  @scala.inline
  implicit class IAnswerOps[Self <: IAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(null)
        ret
    }
    @scala.inline
    def withFaqQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faqQuestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaqQuestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faqQuestion")(js.undefined)
        ret
    }
    @scala.inline
    def withFaqQuestionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faqQuestion")(null)
        ret
    }
    @scala.inline
    def withMatchConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchConfidenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidence")(null)
        ret
    }
    @scala.inline
    def withMatchConfidenceLevel(value: MatchConfidenceLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidenceLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchConfidenceLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidenceLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchConfidenceLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidenceLevel")(null)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
  }
  
}

