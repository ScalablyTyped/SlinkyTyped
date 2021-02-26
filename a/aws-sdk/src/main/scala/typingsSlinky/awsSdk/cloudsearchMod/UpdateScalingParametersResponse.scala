package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScalingParametersResponse extends StObject {
  
  var ScalingParameters: ScalingParametersStatus = js.native
}
object UpdateScalingParametersResponse {
  
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): UpdateScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersResponse]
  }
  
  @scala.inline
  implicit class UpdateScalingParametersResponseMutableBuilder[Self <: UpdateScalingParametersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScalingParameters(value: ScalingParametersStatus): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
