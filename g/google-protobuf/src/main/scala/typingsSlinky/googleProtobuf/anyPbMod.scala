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

object anyPbMod {
  
  @JSImport("google-protobuf/google/protobuf/any_pb", "Any")
  @js.native
  class Any () extends Message {
    
    def getTypeName(): String = js.native
    
    def getTypeUrl(): String = js.native
    
    def getValue(): js.typedarray.Uint8Array | String = js.native
    
    def getValue_asB64(): String = js.native
    
    def getValue_asU8(): js.typedarray.Uint8Array = js.native
    
    def pack(serialized: js.typedarray.Uint8Array, name: String): Unit = js.native
    def pack(serialized: js.typedarray.Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
    
    def setTypeUrl(value: String): Any = js.native
    
    def setValue(value: String): Any = js.native
    def setValue(value: js.typedarray.Uint8Array): Any = js.native
    
    def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ js.typedarray.Uint8Array, T], name: String): T | Null = js.native
  }
  /* static members */
  object Any {
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: Any, reader: BinaryReader): Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: Any, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/any_pb", "Any.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: Any): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var typeUrl: String = js.native
      
      var value: js.typedarray.Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(typeUrl: String, value: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(typeUrl = typeUrl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
