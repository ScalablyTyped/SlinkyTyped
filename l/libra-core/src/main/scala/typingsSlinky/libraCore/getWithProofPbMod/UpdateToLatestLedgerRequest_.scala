package typingsSlinky.libraCore.getWithProofPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest")
@js.native
class UpdateToLatestLedgerRequest_ () extends Message {
  
  def addRequestedItems(): RequestItem = js.native
  def addRequestedItems(value: js.UndefOr[scala.Nothing], index: Double): RequestItem = js.native
  def addRequestedItems(value: RequestItem): RequestItem = js.native
  def addRequestedItems(value: RequestItem, index: Double): RequestItem = js.native
  
  def clearRequestedItemsList(): Unit = js.native
  
  def getClientKnownVersion(): String = js.native
  
  def getRequestedItemsList(): js.Array[RequestItem] = js.native
  
  def setClientKnownVersion(value: String): Unit = js.native
  
  def setRequestedItemsList(value: js.Array[RequestItem]): Unit = js.native
}
