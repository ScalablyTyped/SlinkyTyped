package typingsSlinky.libraCore.ledgerInfoPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo")
@js.native
class LedgerInfo_ () extends Message {
  
  def getConsensusBlockId(): js.typedarray.Uint8Array | String = js.native
  
  def getConsensusBlockId_asB64(): String = js.native
  
  def getConsensusBlockId_asU8(): js.typedarray.Uint8Array = js.native
  
  def getConsensusDataHash(): js.typedarray.Uint8Array | String = js.native
  
  def getConsensusDataHash_asB64(): String = js.native
  
  def getConsensusDataHash_asU8(): js.typedarray.Uint8Array = js.native
  
  def getEpochNum(): String = js.native
  
  def getTimestampUsecs(): String = js.native
  
  def getTransactionAccumulatorHash(): js.typedarray.Uint8Array | String = js.native
  
  def getTransactionAccumulatorHash_asB64(): String = js.native
  
  def getTransactionAccumulatorHash_asU8(): js.typedarray.Uint8Array = js.native
  
  def getVersion(): String = js.native
  
  def setConsensusBlockId(value: String): Unit = js.native
  def setConsensusBlockId(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setConsensusDataHash(value: String): Unit = js.native
  def setConsensusDataHash(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setEpochNum(value: String): Unit = js.native
  
  def setTimestampUsecs(value: String): Unit = js.native
  
  def setTransactionAccumulatorHash(value: String): Unit = js.native
  def setTransactionAccumulatorHash(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setVersion(value: String): Unit = js.native
}
