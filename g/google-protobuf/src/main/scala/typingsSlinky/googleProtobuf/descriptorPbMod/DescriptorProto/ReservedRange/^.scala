package typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange = js.native
  
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange,
    reader: BinaryReader
  ): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(
    message: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange,
    writer: BinaryWriter
  ): Unit = js.native
  
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange
  ): AsObject = js.native
}
