package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.StopRuleUsageTrackingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeStopRuleUsageTrackingResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: StopRuleUsageTrackingResponse = js.native
}
object ReturnTypeStopRuleUsageTrackingResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: StopRuleUsageTrackingResponse): ReturnTypeStopRuleUsageTrackingResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStopRuleUsageTrackingResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeStopRuleUsageTrackingResponseMutableBuilder[Self <: ReturnTypeStopRuleUsageTrackingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: StopRuleUsageTrackingResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
