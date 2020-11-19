package typingsSlinky.libraCore.vmErrorsPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
@js.native
class ArithmeticError_ () extends Message {
  
  def getErrorCode(): ArithmeticErrorType = js.native
  
  def setErrorCode(value: ArithmeticErrorType): Unit = js.native
}
