package typingsSlinky.libraCore.proofPbMod.EventProof

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.proofPbMod.EventProof = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.proofPbMod.EventProof, reader: BinaryReader): typingsSlinky.libraCore.proofPbMod.EventProof = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.proofPbMod.EventProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.proofPbMod.EventProof): AsObject = js.native
}

