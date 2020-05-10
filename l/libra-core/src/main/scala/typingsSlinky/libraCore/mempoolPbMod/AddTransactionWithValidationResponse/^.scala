package typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse,
    reader: BinaryReader
  ): typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.mempoolPbMod.AddTransactionWithValidationResponse
  ): AsObject = js.native
}

