package typingsSlinky.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem")
@js.native
class RequestItem () extends Message {
  
  def clearGetAccountStateRequest(): Unit = js.native
  
  def clearGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  
  def clearGetEventsByEventAccessPathRequest(): Unit = js.native
  
  def clearGetTransactionsRequest(): Unit = js.native
  
  def getGetAccountStateRequest(): js.UndefOr[GetAccountStateRequest] = js.native
  
  def getGetAccountTransactionBySequenceNumberRequest(): js.UndefOr[GetAccountTransactionBySequenceNumberRequest] = js.native
  
  def getGetEventsByEventAccessPathRequest(): js.UndefOr[GetEventsByEventAccessPathRequest] = js.native
  
  def getGetTransactionsRequest(): js.UndefOr[GetTransactionsRequest] = js.native
  
  def getRequestedItemsCase(): RequestedItemsCase = js.native
  
  def hasGetAccountStateRequest(): Boolean = js.native
  
  def hasGetAccountTransactionBySequenceNumberRequest(): Boolean = js.native
  
  def hasGetEventsByEventAccessPathRequest(): Boolean = js.native
  
  def hasGetTransactionsRequest(): Boolean = js.native
  
  def setGetAccountStateRequest(): Unit = js.native
  def setGetAccountStateRequest(value: GetAccountStateRequest): Unit = js.native
  
  def setGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  def setGetAccountTransactionBySequenceNumberRequest(value: GetAccountTransactionBySequenceNumberRequest): Unit = js.native
  
  def setGetEventsByEventAccessPathRequest(): Unit = js.native
  def setGetEventsByEventAccessPathRequest(value: GetEventsByEventAccessPathRequest): Unit = js.native
  
  def setGetTransactionsRequest(): Unit = js.native
  def setGetTransactionsRequest(value: GetTransactionsRequest): Unit = js.native
}
/* static members */
object RequestItem {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RequestedItemsCase extends StObject
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.RequestedItemsCase")
  @js.native
  object RequestedItemsCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestedItemsCase with Double] = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_STATE_REQUEST extends RequestedItemsCase
    /* 1 */ val GET_ACCOUNT_STATE_REQUEST: typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase.GET_ACCOUNT_STATE_REQUEST with Double = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST extends RequestedItemsCase
    /* 2 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST: typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST with Double = js.native
    
    @js.native
    sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST extends RequestedItemsCase
    /* 3 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST: typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST with Double = js.native
    
    @js.native
    sealed trait GET_TRANSACTIONS_REQUEST extends RequestedItemsCase
    /* 4 */ val GET_TRANSACTIONS_REQUEST: typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase.GET_TRANSACTIONS_REQUEST with Double = js.native
    
    @js.native
    sealed trait REQUESTEDITEMS_NOT_SET extends RequestedItemsCase
    /* 0 */ val REQUESTEDITEMS_NOT_SET: typingsSlinky.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase.REQUESTEDITEMS_NOT_SET with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): RequestItem = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: RequestItem, reader: BinaryReader): RequestItem = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: RequestItem, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: RequestItem): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var getAccountStateRequest: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject] = js.native
    
    var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
        typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
      ] = js.native
    
    var getEventsByEventAccessPathRequest: js.UndefOr[
        typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject
      ] = js.native
    
    var getTransactionsRequest: js.UndefOr[typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject] = js.native
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
      def setGetAccountStateRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountStateRequest.AsObject): Self = StObject.set(x, "getAccountStateRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAccountStateRequestUndefined: Self = StObject.set(x, "getAccountStateRequest", js.undefined)
      
      @scala.inline
      def setGetAccountTransactionBySequenceNumberRequest(
        value: typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest.AsObject
      ): Self = StObject.set(x, "getAccountTransactionBySequenceNumberRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAccountTransactionBySequenceNumberRequestUndefined: Self = StObject.set(x, "getAccountTransactionBySequenceNumberRequest", js.undefined)
      
      @scala.inline
      def setGetEventsByEventAccessPathRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest.AsObject): Self = StObject.set(x, "getEventsByEventAccessPathRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetEventsByEventAccessPathRequestUndefined: Self = StObject.set(x, "getEventsByEventAccessPathRequest", js.undefined)
      
      @scala.inline
      def setGetTransactionsRequest(value: typingsSlinky.libraCore.getWithProofPbMod.GetTransactionsRequest.AsObject): Self = StObject.set(x, "getTransactionsRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTransactionsRequestUndefined: Self = StObject.set(x, "getTransactionsRequest", js.undefined)
    }
  }
}
