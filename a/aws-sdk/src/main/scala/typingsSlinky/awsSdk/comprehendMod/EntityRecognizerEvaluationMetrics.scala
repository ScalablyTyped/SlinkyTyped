package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRecognizerEvaluationMetrics extends StObject {
  
  /**
    * A measure of how accurate the recognizer results are for the test data. It is derived from the Precision and Recall values. The F1Score is the harmonic average of the two scores. The highest score is 1, and the worst score is 0. 
    */
  var F1Score: js.UndefOr[Double] = js.native
  
  /**
    * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer returned substantially more relevant results than irrelevant ones. 
    */
  var Precision: js.UndefOr[Double] = js.native
  
  /**
    * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer returned most of the relevant results.
    */
  var Recall: js.UndefOr[Double] = js.native
}
object EntityRecognizerEvaluationMetrics {
  
  @scala.inline
  def apply(): EntityRecognizerEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerEvaluationMetrics]
  }
  
  @scala.inline
  implicit class EntityRecognizerEvaluationMetricsMutableBuilder[Self <: EntityRecognizerEvaluationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF1Score(value: Double): Self = StObject.set(x, "F1Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF1ScoreUndefined: Self = StObject.set(x, "F1Score", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "Precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = StObject.set(x, "Recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecallUndefined: Self = StObject.set(x, "Recall", js.undefined)
  }
}
