package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An answer from Knowledge Connector.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer extends js.Object {
  /**
    * The piece of text from the `source` knowledge base document that answers
    * this conversational query.
    */
  var answer: js.UndefOr[String] = js.native
  /**
    * The corresponding FAQ question if the answer was extracted from a FAQ
    * Document, empty otherwise.
    */
  var faqQuestion: js.UndefOr[String] = js.native
  /**
    * The system&#39;s confidence score that this Knowledge answer is a good
    * match for this conversational query. The range is from 0.0 (completely
    * uncertain) to 1.0 (completely certain). Note: The confidence score is
    * likely to vary somewhat (possibly even for identical requests), as the
    * underlying model is under constant improvement. It may be deprecated in
    * the future. We recommend using `match_confidence_level` which should be
    * generally more stable.
    */
  var matchConfidence: js.UndefOr[Double] = js.native
  /**
    * The system&#39;s confidence level that this knowledge answer is a good
    * match for this conversational query. NOTE: The confidence level for a
    * given `&lt;query, answer&gt;` pair may change without notice, as it
    * depends on models that are constantly being improved. However, it will
    * change less frequently than the confidence score below, and should be
    * preferred for referencing the quality of an answer.
    */
  var matchConfidenceLevel: js.UndefOr[String] = js.native
  /**
    * Indicates which Knowledge Document this answer was extracted from.
    * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base
    * ID&gt;/documents/&lt;Document ID&gt;`.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswerOps[Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer] (val x: Self) extends AnyVal {
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
    def withMatchConfidenceLevel(value: String): Self = {
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
  }
  
}

