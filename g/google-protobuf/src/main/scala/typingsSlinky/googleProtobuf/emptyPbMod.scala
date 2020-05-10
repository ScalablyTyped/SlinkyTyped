package typingsSlinky.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/empty_pb", JSImport.Namespace)
@js.native
object emptyPbMod extends js.Object {
  @js.native
  class Empty () extends Message
  
  /* static members */
  @js.native
  object Empty extends js.Object {
    var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): Empty = js.native
    def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
    def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
    def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
    type AsObject = js.Object
  }
  
}

