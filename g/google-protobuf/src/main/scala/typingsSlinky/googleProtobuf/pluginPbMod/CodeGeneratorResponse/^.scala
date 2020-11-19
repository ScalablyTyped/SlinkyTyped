package typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse, reader: BinaryReader): typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.pluginPbMod.CodeGeneratorResponse): AsObject = js.native
}
