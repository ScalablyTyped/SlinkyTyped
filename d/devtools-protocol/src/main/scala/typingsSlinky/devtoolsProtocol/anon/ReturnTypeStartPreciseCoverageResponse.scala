package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeStartPreciseCoverageResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartPreciseCoverageRequest]] = js.native
  
  var returnType: StartPreciseCoverageResponse = js.native
}
object ReturnTypeStartPreciseCoverageResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[StartPreciseCoverageRequest]],
    returnType: StartPreciseCoverageResponse
  ): ReturnTypeStartPreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStartPreciseCoverageResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeStartPreciseCoverageResponseMutableBuilder[Self <: ReturnTypeStartPreciseCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[StartPreciseCoverageRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[StartPreciseCoverageRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: StartPreciseCoverageResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
