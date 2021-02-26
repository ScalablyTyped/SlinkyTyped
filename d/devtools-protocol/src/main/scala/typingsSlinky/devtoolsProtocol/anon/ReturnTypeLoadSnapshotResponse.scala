package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeLoadSnapshotResponse extends StObject {
  
  var paramsType: js.Array[LoadSnapshotRequest] = js.native
  
  var returnType: LoadSnapshotResponse = js.native
}
object ReturnTypeLoadSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[LoadSnapshotRequest], returnType: LoadSnapshotResponse): ReturnTypeLoadSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadSnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeLoadSnapshotResponseMutableBuilder[Self <: ReturnTypeLoadSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[LoadSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: LoadSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: LoadSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
