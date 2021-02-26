package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitFeedbackRequest extends StObject {
  
  /**
    * The universally unique identifier (UUID) of the  AnomalyInstance  object that is included in the analysis data.
    */
  var anomalyInstanceId: AnomalyInstanceId = js.native
  
  /**
    * Optional feedback about this anomaly.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * The name of the profiling group that is associated with the analysis data.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  
  /**
    *  The feedback tpye. Thee are two valid values, Positive and Negative. 
    */
  var `type`: FeedbackType = js.native
}
object SubmitFeedbackRequest {
  
  @scala.inline
  def apply(anomalyInstanceId: AnomalyInstanceId, profilingGroupName: ProfilingGroupName, `type`: FeedbackType): SubmitFeedbackRequest = {
    val __obj = js.Dynamic.literal(anomalyInstanceId = anomalyInstanceId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitFeedbackRequest]
  }
  
  @scala.inline
  implicit class SubmitFeedbackRequestMutableBuilder[Self <: SubmitFeedbackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyInstanceId(value: AnomalyInstanceId): Self = StObject.set(x, "anomalyInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FeedbackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
