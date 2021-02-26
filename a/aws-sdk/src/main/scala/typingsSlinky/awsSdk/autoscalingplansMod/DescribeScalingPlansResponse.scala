package typingsSlinky.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingPlansResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.NextToken] = js.native
  
  /**
    * Information about the scaling plans.
    */
  var ScalingPlans: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlans] = js.native
}
object DescribeScalingPlansResponse {
  
  @scala.inline
  def apply(): DescribeScalingPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansResponse]
  }
  
  @scala.inline
  implicit class DescribeScalingPlansResponseMutableBuilder[Self <: DescribeScalingPlansResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingPlans(value: ScalingPlans): Self = StObject.set(x, "ScalingPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlansUndefined: Self = StObject.set(x, "ScalingPlans", js.undefined)
    
    @scala.inline
    def setScalingPlansVarargs(value: ScalingPlan*): Self = StObject.set(x, "ScalingPlans", js.Array(value :_*))
  }
}
