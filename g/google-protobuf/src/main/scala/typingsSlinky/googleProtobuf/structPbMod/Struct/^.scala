package typingsSlinky.googleProtobuf.structPbMod.Struct

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.structPbMod.JavaScriptValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Struct")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.structPbMod.Struct = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.structPbMod.Struct, reader: BinaryReader): typingsSlinky.googleProtobuf.structPbMod.Struct = js.native
  def fromJavaScript(value: StringDictionary[JavaScriptValue]): typingsSlinky.googleProtobuf.structPbMod.Struct = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.structPbMod.Struct, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.structPbMod.Struct): AsObject = js.native
}

