package typingsSlinky.libraCore.validatorChangePbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.eventsPbMod.EventWithProof
import typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
@js.native
class ValidatorChangeEventWithProof_ () extends Message {
  
  def clearEventWithProof(): Unit = js.native
  
  def clearLedgerInfoWithSigs(): Unit = js.native
  
  def getEventWithProof(): js.UndefOr[EventWithProof] = js.native
  
  def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
  
  def hasEventWithProof(): Boolean = js.native
  
  def hasLedgerInfoWithSigs(): Boolean = js.native
  
  def setEventWithProof(): Unit = js.native
  def setEventWithProof(value: EventWithProof): Unit = js.native
  
  def setLedgerInfoWithSigs(): Unit = js.native
  def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
}
