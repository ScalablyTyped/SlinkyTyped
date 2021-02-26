package typingsSlinky.libraCore

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

object accessPathPbMod {
  
  @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
  @js.native
  class AccessPath () extends Message {
    
    def getAddress(): js.typedarray.Uint8Array | String = js.native
    
    def getAddress_asB64(): String = js.native
    
    def getAddress_asU8(): js.typedarray.Uint8Array = js.native
    
    def getPath(): js.typedarray.Uint8Array | String = js.native
    
    def getPath_asB64(): String = js.native
    
    def getPath_asU8(): js.typedarray.Uint8Array = js.native
    
    def setAddress(value: String): Unit = js.native
    def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setPath(value: String): Unit = js.native
    def setPath(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object AccessPath {
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): AccessPath = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccessPath, reader: BinaryReader): AccessPath = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccessPath, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccessPath): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var address: js.typedarray.Uint8Array | String = js.native
      
      var path: js.typedarray.Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(address: js.typedarray.Uint8Array | String, path: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
}
