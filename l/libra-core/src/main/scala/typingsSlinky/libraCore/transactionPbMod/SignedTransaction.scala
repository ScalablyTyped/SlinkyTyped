package typingsSlinky.libraCore.transactionPbMod

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

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
@js.native
class SignedTransaction () extends Message {
  
  def getRawTxnBytes(): js.typedarray.Uint8Array | String = js.native
  
  def getRawTxnBytes_asB64(): String = js.native
  
  def getRawTxnBytes_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderPublicKey(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderPublicKey_asB64(): String = js.native
  
  def getSenderPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderSignature(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderSignature_asB64(): String = js.native
  
  def getSenderSignature_asU8(): js.typedarray.Uint8Array = js.native
  
  def setRawTxnBytes(value: String): Unit = js.native
  def setRawTxnBytes(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderPublicKey(value: String): Unit = js.native
  def setSenderPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderSignature(value: String): Unit = js.native
  def setSenderSignature(value: js.typedarray.Uint8Array): Unit = js.native
}
/* static members */
object SignedTransaction {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): SignedTransaction = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: SignedTransaction, reader: BinaryReader): SignedTransaction = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: SignedTransaction, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: SignedTransaction): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var rawTxnBytes: js.typedarray.Uint8Array | String = js.native
    
    var senderPublicKey: js.typedarray.Uint8Array | String = js.native
    
    var senderSignature: js.typedarray.Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      rawTxnBytes: js.typedarray.Uint8Array | String,
      senderPublicKey: js.typedarray.Uint8Array | String,
      senderSignature: js.typedarray.Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawTxnBytes(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "rawTxnBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTxnBytesUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawTxnBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "senderPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "senderPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderSignature(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "senderSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderSignatureUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "senderSignature", value.asInstanceOf[js.Any])
    }
  }
}
