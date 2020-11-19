package typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange = js.native
  
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange,
    reader: BinaryReader
  ): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange,
    writer: BinaryWriter
  ): Unit = js.native
  
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
  ): AsObject = js.native
}
