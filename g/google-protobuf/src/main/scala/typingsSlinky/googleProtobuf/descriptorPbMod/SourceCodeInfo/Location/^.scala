package typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "SourceCodeInfo.Location")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location,
    reader: BinaryReader
  ): typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location
  ): AsObject = js.native
}

