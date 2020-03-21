package typingsSlinky.libraCore.getWithProofPbMod.ResponseItem

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.getWithProofPbMod.ResponseItem = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.getWithProofPbMod.ResponseItem, reader: BinaryReader): typingsSlinky.libraCore.getWithProofPbMod.ResponseItem = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.getWithProofPbMod.ResponseItem, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.getWithProofPbMod.ResponseItem): AsObject = js.native
}

