package typingsSlinky.libraCore.vmErrorsPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus")
@js.native
class VMValidationStatus_ () extends Message {
  
  def getCode(): VMValidationStatusCode = js.native
  
  def getMessage(): String = js.native
  
  def setCode(value: VMValidationStatusCode): Unit = js.native
  
  def setMessage(value: String): Unit = js.native
}
