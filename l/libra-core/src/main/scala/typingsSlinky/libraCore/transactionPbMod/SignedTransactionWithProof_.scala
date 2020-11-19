package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.eventsPbMod.EventsList
import typingsSlinky.libraCore.proofPbMod.SignedTransactionProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
@js.native
class SignedTransactionWithProof_ () extends Message {
  
  def clearEvents(): Unit = js.native
  
  def clearProof(): Unit = js.native
  
  def clearSignedTransaction(): Unit = js.native
  
  def getEvents(): js.UndefOr[EventsList] = js.native
  
  def getProof(): js.UndefOr[SignedTransactionProof] = js.native
  
  def getSignedTransaction(): js.UndefOr[SignedTransaction] = js.native
  
  def getVersion(): String = js.native
  
  def hasEvents(): Boolean = js.native
  
  def hasProof(): Boolean = js.native
  
  def hasSignedTransaction(): Boolean = js.native
  
  def setEvents(): Unit = js.native
  def setEvents(value: EventsList): Unit = js.native
  
  def setProof(): Unit = js.native
  def setProof(value: SignedTransactionProof): Unit = js.native
  
  def setSignedTransaction(): Unit = js.native
  def setSignedTransaction(value: SignedTransaction): Unit = js.native
  
  def setVersion(value: String): Unit = js.native
}
