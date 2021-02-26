package typingsSlinky.googleProtobuf

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyPbMod {
  
  @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
  @js.native
  class Empty () extends Message
  /* static members */
  object Empty {
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): Empty = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Empty, reader: BinaryReader): Empty = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Empty, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/empty_pb", "Empty.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Empty): AsObject = js.native
    
    type AsObject = js.Object
  }
}
