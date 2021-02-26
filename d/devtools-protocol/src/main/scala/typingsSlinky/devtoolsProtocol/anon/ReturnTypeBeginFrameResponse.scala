package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeBeginFrameResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[BeginFrameRequest]] = js.native
  
  var returnType: BeginFrameResponse = js.native
}
object ReturnTypeBeginFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[BeginFrameRequest]], returnType: BeginFrameResponse): ReturnTypeBeginFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeBeginFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeBeginFrameResponseMutableBuilder[Self <: ReturnTypeBeginFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[BeginFrameRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[BeginFrameRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: BeginFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
