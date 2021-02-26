package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingParametersResponse extends StObject {
  
  var ScalingParameters: ScalingParametersStatus = js.native
}
object DescribeScalingParametersResponse {
  
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): DescribeScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingParametersResponse]
  }
  
  @scala.inline
  implicit class DescribeScalingParametersResponseMutableBuilder[Self <: DescribeScalingParametersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScalingParameters(value: ScalingParametersStatus): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
