package typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption = js.native
  
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption, reader: BinaryReader): typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption): AsObject = js.native
}
