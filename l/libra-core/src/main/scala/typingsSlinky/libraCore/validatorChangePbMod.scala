package typingsSlinky.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.eventsPbMod.EventWithProof
import typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorChangePbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
  @js.native
  class ValidatorChangeEventWithProof () extends Message {
    
    def clearEventWithProof(): Unit = js.native
    
    def clearLedgerInfoWithSigs(): Unit = js.native
    
    def getEventWithProof(): js.UndefOr[EventWithProof] = js.native
    
    def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
    
    def hasEventWithProof(): Boolean = js.native
    
    def hasLedgerInfoWithSigs(): Boolean = js.native
    
    def setEventWithProof(): Unit = js.native
    def setEventWithProof(value: EventWithProof): Unit = js.native
    
    def setLedgerInfoWithSigs(): Unit = js.native
    def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  }
  /* static members */
  object ValidatorChangeEventWithProof {
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ValidatorChangeEventWithProof = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ValidatorChangeEventWithProof, reader: BinaryReader): ValidatorChangeEventWithProof = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ValidatorChangeEventWithProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ValidatorChangeEventWithProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var eventWithProof: js.UndefOr[typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject] = js.native
      
      var ledgerInfoWithSigs: js.UndefOr[typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventWithProof(value: typingsSlinky.libraCore.eventsPbMod.EventWithProof.AsObject): Self = StObject.set(x, "eventWithProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventWithProofUndefined: Self = StObject.set(x, "eventWithProof", js.undefined)
        
        @scala.inline
        def setLedgerInfoWithSigs(value: typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = StObject.set(x, "ledgerInfoWithSigs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoWithSigsUndefined: Self = StObject.set(x, "ledgerInfoWithSigs", js.undefined)
      }
    }
  }
}
