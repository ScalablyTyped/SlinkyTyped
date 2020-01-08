package typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange = js.native
  def deserializeBinaryFromReader(
    message: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange,
    reader: BinaryReader
  ): typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange = js.native
  def serializeBinaryToWriter(
    message: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsSlinky.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.ExtensionRange
  ): AsObject = js.native
}

