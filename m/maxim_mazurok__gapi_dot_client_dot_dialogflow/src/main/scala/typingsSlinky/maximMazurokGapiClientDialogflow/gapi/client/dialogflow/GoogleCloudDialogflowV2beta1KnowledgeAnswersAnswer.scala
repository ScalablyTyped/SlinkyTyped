package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer extends StObject {
  
  /** The piece of text from the `source` knowledge base document that answers this conversational query. */
  var answer: js.UndefOr[String] = js.native
  
  /** The corresponding FAQ question if the answer was extracted from a FAQ Document, empty otherwise. */
  var faqQuestion: js.UndefOr[String] = js.native
  
  /**
    * The system's confidence score that this Knowledge answer is a good match for this conversational query. The range is from 0.0 (completely uncertain) to 1.0 (completely certain).
    * Note: The confidence score is likely to vary somewhat (possibly even for identical requests), as the underlying model is under constant improvement. It may be deprecated in the
    * future. We recommend using `match_confidence_level` which should be generally more stable.
    */
  var matchConfidence: js.UndefOr[Double] = js.native
  
  /**
    * The system's confidence level that this knowledge answer is a good match for this conversational query. NOTE: The confidence level for a given `` pair may change without notice, as
    * it depends on models that are constantly being improved. However, it will change less frequently than the confidence score below, and should be preferred for referencing the quality
    * of an answer.
    */
  var matchConfidenceLevel: js.UndefOr[String] = js.native
  
  /** Indicates which Knowledge Document this answer was extracted from. Format: `projects//knowledgeBases//documents/`. */
  var source: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswerMutableBuilder[Self <: GoogleCloudDialogflowV2beta1KnowledgeAnswersAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    @scala.inline
    def setFaqQuestion(value: String): Self = StObject.set(x, "faqQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaqQuestionUndefined: Self = StObject.set(x, "faqQuestion", js.undefined)
    
    @scala.inline
    def setMatchConfidence(value: Double): Self = StObject.set(x, "matchConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchConfidenceLevel(value: String): Self = StObject.set(x, "matchConfidenceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchConfidenceLevelUndefined: Self = StObject.set(x, "matchConfidenceLevel", js.undefined)
    
    @scala.inline
    def setMatchConfidenceUndefined: Self = StObject.set(x, "matchConfidence", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
