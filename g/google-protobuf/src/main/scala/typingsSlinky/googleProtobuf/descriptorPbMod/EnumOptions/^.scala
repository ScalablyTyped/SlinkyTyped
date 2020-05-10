package typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions, reader: BinaryReader): typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.descriptorPbMod.EnumOptions): AsObject = js.native
}

