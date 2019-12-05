package typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/events_pb", "Event")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event,
    reader: BinaryReader
  ): typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event
  ): AsObject = js.native
}

