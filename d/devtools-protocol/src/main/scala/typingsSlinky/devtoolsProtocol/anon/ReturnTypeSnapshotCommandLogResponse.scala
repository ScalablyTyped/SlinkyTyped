package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSnapshotCommandLogResponse extends StObject {
  
  var paramsType: js.Array[SnapshotCommandLogRequest] = js.native
  
  var returnType: SnapshotCommandLogResponse = js.native
}
object ReturnTypeSnapshotCommandLogResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SnapshotCommandLogRequest], returnType: SnapshotCommandLogResponse): ReturnTypeSnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSnapshotCommandLogResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSnapshotCommandLogResponseMutableBuilder[Self <: ReturnTypeSnapshotCommandLogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SnapshotCommandLogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SnapshotCommandLogRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SnapshotCommandLogResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
