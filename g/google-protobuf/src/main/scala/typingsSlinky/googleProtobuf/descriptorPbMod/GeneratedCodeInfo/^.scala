package typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo, reader: BinaryReader): typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.descriptorPbMod.GeneratedCodeInfo): AsObject = js.native
}
