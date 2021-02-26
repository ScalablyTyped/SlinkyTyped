package typingsSlinky.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.eventsPbMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
@js.native
class TransactionToCommit () extends Message {
  
  def addAccountStates(): AccountState = js.native
  def addAccountStates(value: js.UndefOr[scala.Nothing], index: Double): AccountState = js.native
  def addAccountStates(value: AccountState): AccountState = js.native
  def addAccountStates(value: AccountState, index: Double): AccountState = js.native
  
  def addEvents(): Event = js.native
  def addEvents(value: js.UndefOr[scala.Nothing], index: Double): Event = js.native
  def addEvents(value: Event): Event = js.native
  def addEvents(value: Event, index: Double): Event = js.native
  
  def clearAccountStatesList(): Unit = js.native
  
  def clearEventsList(): Unit = js.native
  
  def clearSignedTxn(): Unit = js.native
  
  def getAccountStatesList(): js.Array[AccountState] = js.native
  
  def getEventsList(): js.Array[Event] = js.native
  
  def getGasUsed(): String = js.native
  
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  
  def hasSignedTxn(): Boolean = js.native
  
  def setAccountStatesList(value: js.Array[AccountState]): Unit = js.native
  
  def setEventsList(value: js.Array[Event]): Unit = js.native
  
  def setGasUsed(value: String): Unit = js.native
  
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}
/* static members */
object TransactionToCommit {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionToCommit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: TransactionToCommit, reader: BinaryReader): TransactionToCommit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: TransactionToCommit, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: TransactionToCommit): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var accountStatesList: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject] = js.native
    
    var eventsList: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject] = js.native
    
    var gasUsed: String = js.native
    
    var signedTxn: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      accountStatesList: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject],
      eventsList: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject],
      gasUsed: String
    ): AsObject = {
      val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountStatesList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject]): Self = StObject.set(x, "accountStatesList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountStatesListVarargs(value: typingsSlinky.libraCore.transactionPbMod.AccountState.AsObject*): Self = StObject.set(x, "accountStatesList", js.Array(value :_*))
      
      @scala.inline
      def setEventsList(value: js.Array[typingsSlinky.libraCore.eventsPbMod.Event.AsObject]): Self = StObject.set(x, "eventsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsListVarargs(value: typingsSlinky.libraCore.eventsPbMod.Event.AsObject*): Self = StObject.set(x, "eventsList", js.Array(value :_*))
      
      @scala.inline
      def setGasUsed(value: String): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTxn(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTxn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTxnUndefined: Self = StObject.set(x, "signedTxn", js.undefined)
    }
  }
}
