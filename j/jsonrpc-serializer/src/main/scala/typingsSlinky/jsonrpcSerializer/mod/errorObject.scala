package typingsSlinky.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonrpc-serializer", "errorObject")
@js.native
object errorObject extends js.Object {
  
  def apply(id: String, error: SerializerError): PayloadObject = js.native
  def apply(id: Double, error: SerializerError): PayloadObject = js.native
}
