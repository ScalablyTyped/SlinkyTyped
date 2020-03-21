package typingsSlinky.googleProtobuf.structPbMod.Value

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.structPbMod.JavaScriptValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.structPbMod.Value = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.structPbMod.Value, reader: BinaryReader): typingsSlinky.googleProtobuf.structPbMod.Value = js.native
  def fromJavaScript(value: JavaScriptValue): typingsSlinky.googleProtobuf.structPbMod.Value = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.structPbMod.Value, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.structPbMod.Value): AsObject = js.native
}

