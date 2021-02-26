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

object validatorPublicKeysPbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
  @js.native
  class ValidatorPublicKeys () extends Message {
    
    def getAccountAddress(): js.typedarray.Uint8Array | String = js.native
    
    def getAccountAddress_asB64(): String = js.native
    
    def getAccountAddress_asU8(): js.typedarray.Uint8Array = js.native
    
    def getConsensusPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getConsensusPublicKey_asB64(): String = js.native
    
    def getConsensusPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def getNetworkIdentityPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getNetworkIdentityPublicKey_asB64(): String = js.native
    
    def getNetworkIdentityPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def getNetworkSigningPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getNetworkSigningPublicKey_asB64(): String = js.native
    
    def getNetworkSigningPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def setAccountAddress(value: String): Unit = js.native
    def setAccountAddress(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setConsensusPublicKey(value: String): Unit = js.native
    def setConsensusPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setNetworkIdentityPublicKey(value: String): Unit = js.native
    def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setNetworkSigningPublicKey(value: String): Unit = js.native
    def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object ValidatorPublicKeys {
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ValidatorPublicKeys = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ValidatorPublicKeys, reader: BinaryReader): ValidatorPublicKeys = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ValidatorPublicKeys, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ValidatorPublicKeys): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var accountAddress: js.typedarray.Uint8Array | String = js.native
      
      var consensusPublicKey: js.typedarray.Uint8Array | String = js.native
      
      var networkIdentityPublicKey: js.typedarray.Uint8Array | String = js.native
      
      var networkSigningPublicKey: js.typedarray.Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        accountAddress: js.typedarray.Uint8Array | String,
        consensusPublicKey: js.typedarray.Uint8Array | String,
        networkIdentityPublicKey: js.typedarray.Uint8Array | String,
        networkSigningPublicKey: js.typedarray.Uint8Array | String
      ): AsObject = {
        val __obj = js.Dynamic.literal(accountAddress = accountAddress.asInstanceOf[js.Any], consensusPublicKey = consensusPublicKey.asInstanceOf[js.Any], networkIdentityPublicKey = networkIdentityPublicKey.asInstanceOf[js.Any], networkSigningPublicKey = networkSigningPublicKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountAddress(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "accountAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccountAddressUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "accountAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsensusPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "consensusPublicKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsensusPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "consensusPublicKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "networkIdentityPublicKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkIdentityPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "networkIdentityPublicKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "networkSigningPublicKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworkSigningPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "networkSigningPublicKey", value.asInstanceOf[js.Any])
      }
    }
  }
}
