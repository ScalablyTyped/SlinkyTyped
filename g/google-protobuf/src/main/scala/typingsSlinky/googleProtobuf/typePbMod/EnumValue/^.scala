package typingsSlinky.googleProtobuf.typePbMod.EnumValue

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.typePbMod.EnumValue = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.typePbMod.EnumValue, reader: BinaryReader): typingsSlinky.googleProtobuf.typePbMod.EnumValue = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.typePbMod.EnumValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.typePbMod.EnumValue): AsObject = js.native
}

