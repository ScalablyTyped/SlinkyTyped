package typingsSlinky.googleProtobuf.structPbMod.ListValue

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.structPbMod.JavaScriptValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/struct_pb", "ListValue")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.structPbMod.ListValue = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.structPbMod.ListValue, reader: BinaryReader): typingsSlinky.googleProtobuf.structPbMod.ListValue = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def fromJavaScript(value: js.Array[JavaScriptValue]): typingsSlinky.googleProtobuf.structPbMod.ListValue = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.structPbMod.ListValue, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.structPbMod.ListValue): AsObject = js.native
}
