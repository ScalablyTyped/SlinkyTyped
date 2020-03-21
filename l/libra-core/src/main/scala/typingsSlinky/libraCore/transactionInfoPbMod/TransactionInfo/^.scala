package typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo, reader: BinaryReader): typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo): AsObject = js.native
}

