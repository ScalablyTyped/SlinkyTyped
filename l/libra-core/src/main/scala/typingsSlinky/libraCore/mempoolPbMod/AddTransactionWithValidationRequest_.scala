package typingsSlinky.libraCore.mempoolPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.transactionPbMod.SignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest")
@js.native
class AddTransactionWithValidationRequest_ () extends Message {
  
  def clearSignedTxn(): Unit = js.native
  
  def getAccountBalance(): String = js.native
  
  def getLatestSequenceNumber(): String = js.native
  
  def getMaxGasCost(): String = js.native
  
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  
  def hasSignedTxn(): Boolean = js.native
  
  def setAccountBalance(value: String): Unit = js.native
  
  def setLatestSequenceNumber(value: String): Unit = js.native
  
  def setMaxGasCost(value: String): Unit = js.native
  
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}
