package typingsSlinky.libraCore.transactionPbMod.WriteOp

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.transactionPbMod.WriteOp = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.transactionPbMod.WriteOp, reader: BinaryReader): typingsSlinky.libraCore.transactionPbMod.WriteOp = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.transactionPbMod.WriteOp, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.transactionPbMod.WriteOp): AsObject = js.native
}

