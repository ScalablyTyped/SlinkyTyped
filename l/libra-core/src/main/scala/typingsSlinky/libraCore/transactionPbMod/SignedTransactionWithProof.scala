package typingsSlinky.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.eventsPbMod.EventsList
import typingsSlinky.libraCore.proofPbMod.SignedTransactionProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
@js.native
class SignedTransactionWithProof () extends Message {
  
  def clearEvents(): Unit = js.native
  
  def clearProof(): Unit = js.native
  
  def clearSignedTransaction(): Unit = js.native
  
  def getEvents(): js.UndefOr[EventsList] = js.native
  
  def getProof(): js.UndefOr[SignedTransactionProof] = js.native
  
  def getSignedTransaction(): js.UndefOr[SignedTransaction] = js.native
  
  def getVersion(): String = js.native
  
  def hasEvents(): Boolean = js.native
  
  def hasProof(): Boolean = js.native
  
  def hasSignedTransaction(): Boolean = js.native
  
  def setEvents(): Unit = js.native
  def setEvents(value: EventsList): Unit = js.native
  
  def setProof(): Unit = js.native
  def setProof(value: SignedTransactionProof): Unit = js.native
  
  def setSignedTransaction(): Unit = js.native
  def setSignedTransaction(value: SignedTransaction): Unit = js.native
  
  def setVersion(value: String): Unit = js.native
}
/* static members */
object SignedTransactionWithProof {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): SignedTransactionWithProof = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: SignedTransactionWithProof, reader: BinaryReader): SignedTransactionWithProof = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: SignedTransactionWithProof, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: SignedTransactionWithProof): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var events: js.UndefOr[typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject] = js.native
    
    var proof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.SignedTransactionProof.AsObject] = js.native
    
    var signedTransaction: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
    
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
      def setEvents(value: typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setProof(value: typingsSlinky.libraCore.proofPbMod.SignedTransactionProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
      
      @scala.inline
      def setSignedTransaction(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTransactionUndefined: Self = StObject.set(x, "signedTransaction", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
