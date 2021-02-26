package typingsSlinky.libraCore.getWithProofPbMod

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

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
@js.native
class GetAccountTransactionBySequenceNumberRequest () extends Message {
  
  def getAccount(): js.typedarray.Uint8Array | String = js.native
  
  def getAccount_asB64(): String = js.native
  
  def getAccount_asU8(): js.typedarray.Uint8Array = js.native
  
  def getFetchEvents(): Boolean = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setAccount(value: String): Unit = js.native
  def setAccount(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setFetchEvents(value: Boolean): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
/* static members */
object GetAccountTransactionBySequenceNumberRequest {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): GetAccountTransactionBySequenceNumberRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetAccountTransactionBySequenceNumberRequest, reader: BinaryReader): GetAccountTransactionBySequenceNumberRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetAccountTransactionBySequenceNumberRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetAccountTransactionBySequenceNumberRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var account: js.typedarray.Uint8Array | String = js.native
    
    var fetchEvents: Boolean = js.native
    
    var sequenceNumber: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(account: js.typedarray.Uint8Array | String, fetchEvents: Boolean, sequenceNumber: String): AsObject = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], fetchEvents = fetchEvents.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchEvents(value: Boolean): Self = StObject.set(x, "fetchEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
