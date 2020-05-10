package typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions, reader: BinaryReader): typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.descriptorPbMod.EnumValueOptions): AsObject = js.native
}

