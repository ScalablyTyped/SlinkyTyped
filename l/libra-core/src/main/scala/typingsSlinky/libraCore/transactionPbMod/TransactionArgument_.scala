package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
@js.native
class TransactionArgument_ () extends Message {
  
  def getData(): js.typedarray.Uint8Array | String = js.native
  
  def getData_asB64(): String = js.native
  
  def getData_asU8(): js.typedarray.Uint8Array = js.native
  
  def getType(): ArgType = js.native
  
  def setData(value: String): Unit = js.native
  def setData(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setType(value: ArgType): Unit = js.native
}
