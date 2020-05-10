package typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest,
    reader: BinaryReader
  ): typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest
  ): AsObject = js.native
}

