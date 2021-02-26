package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeDescribeNodeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[DescribeNodeRequest]] = js.native
  
  var returnType: DescribeNodeResponse = js.native
}
object ReturnTypeDescribeNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[DescribeNodeRequest]], returnType: DescribeNodeResponse): ReturnTypeDescribeNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeDescribeNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeDescribeNodeResponseMutableBuilder[Self <: ReturnTypeDescribeNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[DescribeNodeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[DescribeNodeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: DescribeNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
