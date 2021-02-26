package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetSnapshotResponse extends StObject {
  
  var paramsType: js.Array[GetSnapshotRequest] = js.native
  
  var returnType: GetSnapshotResponse = js.native
}
object ReturnTypeGetSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetSnapshotRequest], returnType: GetSnapshotResponse): ReturnTypeGetSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetSnapshotResponseMutableBuilder[Self <: ReturnTypeGetSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
