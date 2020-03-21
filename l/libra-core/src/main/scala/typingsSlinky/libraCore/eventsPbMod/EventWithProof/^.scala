package typingsSlinky.libraCore.eventsPbMod.EventWithProof

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraCore.eventsPbMod.EventWithProof = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.eventsPbMod.EventWithProof, reader: BinaryReader): typingsSlinky.libraCore.eventsPbMod.EventWithProof = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.eventsPbMod.EventWithProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.eventsPbMod.EventWithProof): AsObject = js.native
}

