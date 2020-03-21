package typingsSlinky.googleProtobuf.typePbMod.Option

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.typePbMod.Option = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.typePbMod.Option, reader: BinaryReader): typingsSlinky.googleProtobuf.typePbMod.Option = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.typePbMod.Option, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.typePbMod.Option): AsObject = js.native
}

