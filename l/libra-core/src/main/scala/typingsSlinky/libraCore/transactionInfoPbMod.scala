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

object transactionInfoPbMod {
  
  @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
  @js.native
  class TransactionInfo () extends Message {
    
    def getEventRootHash(): js.typedarray.Uint8Array | String = js.native
    
    def getEventRootHash_asB64(): String = js.native
    
    def getEventRootHash_asU8(): js.typedarray.Uint8Array = js.native
    
    def getGasUsed(): String = js.native
    
    def getSignedTransactionHash(): js.typedarray.Uint8Array | String = js.native
    
    def getSignedTransactionHash_asB64(): String = js.native
    
    def getSignedTransactionHash_asU8(): js.typedarray.Uint8Array = js.native
    
    def getStateRootHash(): js.typedarray.Uint8Array | String = js.native
    
    def getStateRootHash_asB64(): String = js.native
    
    def getStateRootHash_asU8(): js.typedarray.Uint8Array = js.native
    
    def setEventRootHash(value: String): Unit = js.native
    def setEventRootHash(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setGasUsed(value: String): Unit = js.native
    
    def setSignedTransactionHash(value: String): Unit = js.native
    def setSignedTransactionHash(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setStateRootHash(value: String): Unit = js.native
    def setStateRootHash(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object TransactionInfo {
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: TransactionInfo, reader: BinaryReader): TransactionInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: TransactionInfo, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: TransactionInfo): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var eventRootHash: js.typedarray.Uint8Array | String = js.native
      
      var gasUsed: String = js.native
      
      var signedTransactionHash: js.typedarray.Uint8Array | String = js.native
      
      var stateRootHash: js.typedarray.Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        eventRootHash: js.typedarray.Uint8Array | String,
        gasUsed: String,
        signedTransactionHash: js.typedarray.Uint8Array | String,
        stateRootHash: js.typedarray.Uint8Array | String
      ): AsObject = {
        val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventRootHash(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "eventRootHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventRootHashUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eventRootHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasUsed(value: String): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignedTransactionHash(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "signedTransactionHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignedTransactionHashUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedTransactionHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateRootHash(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateRootHashUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
      }
    }
  }
}
