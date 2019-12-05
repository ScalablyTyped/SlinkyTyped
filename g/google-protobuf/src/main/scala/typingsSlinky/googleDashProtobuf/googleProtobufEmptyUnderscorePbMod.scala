package typingsSlinky.googleDashProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import typingsSlinky.googleDashProtobuf.googleProtobufEmptyUnderscorePbMod.Empty
import typingsSlinky.googleDashProtobuf.googleProtobufEmptyUnderscorePbMod.Empty.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/empty_pb", JSImport.Namespace)
@js.native
object googleProtobufEmptyUnderscorePbMod extends js.Object {
  @js.native
  class Empty () extends Message
  
  /* static members */
  @js.native
  object Empty extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): Empty = js.native
    def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
    def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
    type AsObject = js.Object
  }
  
}

