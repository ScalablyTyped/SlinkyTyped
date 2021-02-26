package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Memory.GetAllTimeSamplingProfileResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetAllTimeSamplingProfileResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetAllTimeSamplingProfileResponse = js.native
}
object ReturnTypeGetAllTimeSamplingProfileResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetAllTimeSamplingProfileResponse): ReturnTypeGetAllTimeSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAllTimeSamplingProfileResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetAllTimeSamplingProfileResponseMutableBuilder[Self <: ReturnTypeGetAllTimeSamplingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetAllTimeSamplingProfileResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
