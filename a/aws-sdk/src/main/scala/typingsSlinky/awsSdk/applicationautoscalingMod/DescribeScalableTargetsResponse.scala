package typingsSlinky.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalableTargetsResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The scalable targets that match the request parameters.
    */
  var ScalableTargets: js.UndefOr[typingsSlinky.awsSdk.applicationautoscalingMod.ScalableTargets] = js.native
}
object DescribeScalableTargetsResponse {
  
  @scala.inline
  def apply(): DescribeScalableTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalableTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeScalableTargetsResponseMutableBuilder[Self <: DescribeScalableTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalableTargets(value: ScalableTargets): Self = StObject.set(x, "ScalableTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalableTargetsUndefined: Self = StObject.set(x, "ScalableTargets", js.undefined)
    
    @scala.inline
    def setScalableTargetsVarargs(value: ScalableTarget*): Self = StObject.set(x, "ScalableTargets", js.Array(value :_*))
  }
}
