package typingsSlinky.libraCore.vmErrorsPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
class DynamicReferenceError_ () extends Message {
  
  def getErrorCode(): DynamicReferenceErrorType = js.native
  
  def setErrorCode(value: DynamicReferenceErrorType): Unit = js.native
}
