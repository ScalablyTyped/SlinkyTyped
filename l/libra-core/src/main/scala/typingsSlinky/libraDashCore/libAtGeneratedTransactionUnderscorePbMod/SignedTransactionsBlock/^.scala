package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock,
    reader: BinaryReader
  ): typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock
  ): AsObject = js.native
}

