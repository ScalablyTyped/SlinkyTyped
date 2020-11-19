package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestDatabaseNamesResponse extends js.Object {
  
  var paramsType: js.Array[RequestDatabaseNamesRequest] = js.native
  
  var returnType: RequestDatabaseNamesResponse = js.native
}
object ReturnTypeRequestDatabaseNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestDatabaseNamesRequest], returnType: RequestDatabaseNamesResponse): ReturnTypeRequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestDatabaseNamesResponseOps[Self <: ReturnTypeRequestDatabaseNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestDatabaseNamesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[RequestDatabaseNamesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: RequestDatabaseNamesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
