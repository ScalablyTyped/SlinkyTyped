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

object languageStoragePbMod {
  
  @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
  @js.native
  class ModuleId () extends Message {
    
    def getAddress(): js.typedarray.Uint8Array | String = js.native
    
    def getAddress_asB64(): String = js.native
    
    def getAddress_asU8(): js.typedarray.Uint8Array = js.native
    
    def getName(): String = js.native
    
    def setAddress(value: String): Unit = js.native
    def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setName(value: String): Unit = js.native
  }
  /* static members */
  object ModuleId {
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ModuleId = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ModuleId, reader: BinaryReader): ModuleId = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ModuleId, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ModuleId): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var address: js.typedarray.Uint8Array | String = js.native
      
      var name: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(address: js.typedarray.Uint8Array | String, name: String): AsObject = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
