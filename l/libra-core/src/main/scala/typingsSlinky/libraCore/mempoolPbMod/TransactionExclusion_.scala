package typingsSlinky.libraCore.mempoolPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
@js.native
class TransactionExclusion_ () extends Message {
  
  def getSender(): js.typedarray.Uint8Array | String = js.native
  
  def getSender_asB64(): String = js.native
  
  def getSender_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setSender(value: String): Unit = js.native
  def setSender(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
