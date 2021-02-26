package typingsSlinky.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.proofPbMod.AccountStateProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountStateBlobPbMod {
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
  @js.native
  class AccountStateBlob () extends Message {
    
    def getBlob(): js.typedarray.Uint8Array | String = js.native
    
    def getBlob_asB64(): String = js.native
    
    def getBlob_asU8(): js.typedarray.Uint8Array = js.native
    
    def setBlob(value: String): Unit = js.native
    def setBlob(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object AccountStateBlob {
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): AccountStateBlob = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccountStateBlob, reader: BinaryReader): AccountStateBlob = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccountStateBlob, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccountStateBlob): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var blob: js.typedarray.Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(blob: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlob(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlobUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
  @js.native
  class AccountStateWithProof () extends Message {
    
    def clearBlob(): Unit = js.native
    
    def clearProof(): Unit = js.native
    
    def getBlob(): js.UndefOr[AccountStateBlob] = js.native
    
    def getProof(): js.UndefOr[AccountStateProof] = js.native
    
    def getVersion(): String = js.native
    
    def hasBlob(): Boolean = js.native
    
    def hasProof(): Boolean = js.native
    
    def setBlob(): Unit = js.native
    def setBlob(value: AccountStateBlob): Unit = js.native
    
    def setProof(): Unit = js.native
    def setProof(value: AccountStateProof): Unit = js.native
    
    def setVersion(value: String): Unit = js.native
  }
  /* static members */
  object AccountStateWithProof {
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): AccountStateWithProof = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccountStateWithProof, reader: BinaryReader): AccountStateWithProof = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccountStateWithProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccountStateWithProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var blob: js.UndefOr[typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject] = js.native
      
      var proof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccountStateProof.AsObject] = js.native
      
      var version: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(version: String): AsObject = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlob(value: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
        
        @scala.inline
        def setProof(value: typingsSlinky.libraCore.proofPbMod.AccountStateProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
