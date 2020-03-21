package typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse,
    reader: BinaryReader
  ): typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.admissionControlPbMod.SubmitTransactionResponse
  ): AsObject = js.native
}

