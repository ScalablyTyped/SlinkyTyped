package typingsSlinky.libraCore.transactionPbMod

import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.accessPathPbMod.AccessPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp")
@js.native
class WriteOp_ () extends Message {
  
  def clearAccessPath(): Unit = js.native
  
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  
  def getType(): WriteOpType = js.native
  
  def getValue(): js.typedarray.Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): js.typedarray.Uint8Array = js.native
  
  def hasAccessPath(): Boolean = js.native
  
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  
  def setType(value: WriteOpType): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: js.typedarray.Uint8Array): Unit = js.native
}
