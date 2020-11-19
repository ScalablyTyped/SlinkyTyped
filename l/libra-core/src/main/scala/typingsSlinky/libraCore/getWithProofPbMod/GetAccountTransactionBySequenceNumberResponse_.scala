package typingsSlinky.libraCore.getWithProofPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typingsSlinky.libraCore.transactionPbMod.SignedTransactionWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse")
@js.native
class GetAccountTransactionBySequenceNumberResponse_ () extends Message {
  
  def clearProofOfCurrentSequenceNumber(): Unit = js.native
  
  def clearSignedTransactionWithProof(): Unit = js.native
  
  def getProofOfCurrentSequenceNumber(): js.UndefOr[AccountStateWithProof] = js.native
  
  def getSignedTransactionWithProof(): js.UndefOr[SignedTransactionWithProof] = js.native
  
  def hasProofOfCurrentSequenceNumber(): Boolean = js.native
  
  def hasSignedTransactionWithProof(): Boolean = js.native
  
  def setProofOfCurrentSequenceNumber(): Unit = js.native
  def setProofOfCurrentSequenceNumber(value: AccountStateWithProof): Unit = js.native
  
  def setSignedTransactionWithProof(): Unit = js.native
  def setSignedTransactionWithProof(value: SignedTransactionWithProof): Unit = js.native
}
