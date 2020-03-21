package typingsSlinky.libraCore.mempoolPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.transactionPbMod.SignedTransactionsBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse")
@js.native
class GetBlockResponse_ () extends Message {
  def clearBlock(): Unit = js.native
  def getBlock(): js.UndefOr[SignedTransactionsBlock] = js.native
  def hasBlock(): Boolean = js.native
  def setBlock(): Unit = js.native
  def setBlock(value: SignedTransactionsBlock): Unit = js.native
}

