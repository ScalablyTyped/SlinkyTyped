package typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse,
    reader: BinaryReader
  ): typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerResponse
  ): AsObject = js.native
}

