package typingsSlinky.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssessmentTargetsResponse extends StObject {
  
  /**
    * Information about the assessment targets.
    */
  var assessmentTargets: AssessmentTargetList = js.native
  
  /**
    * Assessment target details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}
object DescribeAssessmentTargetsResponse {
  
  @scala.inline
  def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargets = assessmentTargets.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeAssessmentTargetsResponseMutableBuilder[Self <: DescribeAssessmentTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargets(value: AssessmentTargetList): Self = StObject.set(x, "assessmentTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTargetsVarargs(value: AssessmentTarget*): Self = StObject.set(x, "assessmentTargets", js.Array(value :_*))
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
