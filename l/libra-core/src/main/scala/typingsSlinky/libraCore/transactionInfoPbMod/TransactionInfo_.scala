package typingsSlinky.libraCore.transactionInfoPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
@js.native
class TransactionInfo_ () extends Message {
  
  def getEventRootHash(): js.typedarray.Uint8Array | String = js.native
  
  def getEventRootHash_asB64(): String = js.native
  
  def getEventRootHash_asU8(): js.typedarray.Uint8Array = js.native
  
  def getGasUsed(): String = js.native
  
  def getSignedTransactionHash(): js.typedarray.Uint8Array | String = js.native
  
  def getSignedTransactionHash_asB64(): String = js.native
  
  def getSignedTransactionHash_asU8(): js.typedarray.Uint8Array = js.native
  
  def getStateRootHash(): js.typedarray.Uint8Array | String = js.native
  
  def getStateRootHash_asB64(): String = js.native
  
  def getStateRootHash_asU8(): js.typedarray.Uint8Array = js.native
  
  def setEventRootHash(value: String): Unit = js.native
  def setEventRootHash(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setGasUsed(value: String): Unit = js.native
  
  def setSignedTransactionHash(value: String): Unit = js.native
  def setSignedTransactionHash(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setStateRootHash(value: String): Unit = js.native
  def setStateRootHash(value: js.typedarray.Uint8Array): Unit = js.native
}
