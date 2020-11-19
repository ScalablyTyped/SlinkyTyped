package typingsSlinky.libraCore.mempoolStatusPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus")
@js.native
class MempoolAddTransactionStatus_ () extends Message {
  
  def getCode(): MempoolAddTransactionStatusCode = js.native
  
  def getMessage(): String = js.native
  
  def setCode(value: MempoolAddTransactionStatusCode): Unit = js.native
  
  def setMessage(value: String): Unit = js.native
}
