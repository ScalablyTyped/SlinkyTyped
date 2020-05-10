package typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue, reader: BinaryReader): typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.wrappersPbMod.BytesValue): AsObject = js.native
}

