package typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.JavaScriptValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue,
    reader: BinaryReader
  ): typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue = js.native
  def fromJavaScript(value: js.Array[JavaScriptValue]): typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleDashProtobuf.googleProtobufStructUnderscorePbMod.ListValue
  ): AsObject = js.native
}

