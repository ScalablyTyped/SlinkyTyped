package typingsSlinky.libraCore.mempoolPbMod

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

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
@js.native
class GetBlockRequest () extends Message {
  
  def addTransactions(): TransactionExclusion = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion, index: Double): TransactionExclusion = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getMaxBlockSize(): String = js.native
  
  def getTransactionsList(): js.Array[TransactionExclusion] = js.native
  
  def setMaxBlockSize(value: String): Unit = js.native
  
  def setTransactionsList(value: js.Array[TransactionExclusion]): Unit = js.native
}
/* static members */
object GetBlockRequest {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): GetBlockRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetBlockRequest, reader: BinaryReader): GetBlockRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetBlockRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetBlockRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var maxBlockSize: String = js.native
    
    var transactionsList: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      maxBlockSize: String,
      transactionsList: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(maxBlockSize = maxBlockSize.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxBlockSize(value: String): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsList(value: js.Array[typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsListVarargs(value: typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value :_*))
    }
  }
}
