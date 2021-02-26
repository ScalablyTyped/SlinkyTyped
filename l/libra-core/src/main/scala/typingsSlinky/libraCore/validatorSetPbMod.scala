package typingsSlinky.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorSetPbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
  @js.native
  class ValidatorSet () extends Message {
    
    def addValidatorPublicKeys(): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: js.UndefOr[scala.Nothing], index: Double): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: ValidatorPublicKeys): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: ValidatorPublicKeys, index: Double): ValidatorPublicKeys = js.native
    
    def clearValidatorPublicKeysList(): Unit = js.native
    
    def getValidatorPublicKeysList(): js.Array[ValidatorPublicKeys] = js.native
    
    def setValidatorPublicKeysList(value: js.Array[ValidatorPublicKeys]): Unit = js.native
  }
  /* static members */
  object ValidatorSet {
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ValidatorSet = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ValidatorSet, reader: BinaryReader): ValidatorSet = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ValidatorSet, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ValidatorSet): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var validatorPublicKeysList: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        validatorPublicKeysList: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
      ): AsObject = {
        val __obj = js.Dynamic.literal(validatorPublicKeysList = validatorPublicKeysList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValidatorPublicKeysList(value: js.Array[typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]): Self = StObject.set(x, "validatorPublicKeysList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatorPublicKeysListVarargs(value: typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject*): Self = StObject.set(x, "validatorPublicKeysList", js.Array(value :_*))
      }
    }
  }
}
