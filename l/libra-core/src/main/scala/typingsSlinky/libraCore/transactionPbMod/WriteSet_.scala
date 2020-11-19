package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet")
@js.native
class WriteSet_ () extends Message {
  
  def addWriteSet(): WriteOp = js.native
  def addWriteSet(value: js.UndefOr[scala.Nothing], index: Double): WriteOp = js.native
  def addWriteSet(value: WriteOp): WriteOp = js.native
  def addWriteSet(value: WriteOp, index: Double): WriteOp = js.native
  
  def clearWriteSetList(): Unit = js.native
  
  def getWriteSetList(): js.Array[WriteOp] = js.native
  
  def setWriteSetList(value: js.Array[WriteOp]): Unit = js.native
}
