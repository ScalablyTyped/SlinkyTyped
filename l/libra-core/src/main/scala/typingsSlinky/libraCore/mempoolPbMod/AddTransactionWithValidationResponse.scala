package typingsSlinky.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
@js.native
class AddTransactionWithValidationResponse () extends Message {
  
  def clearStatus(): Unit = js.native
  
  def getCurrentVersion(): String = js.native
  
  def getStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
  
  def hasStatus(): Boolean = js.native
  
  def setCurrentVersion(value: String): Unit = js.native
  
  def setStatus(): Unit = js.native
  def setStatus(value: MempoolAddTransactionStatus): Unit = js.native
}
/* static members */
object AddTransactionWithValidationResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): AddTransactionWithValidationResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: AddTransactionWithValidationResponse, reader: BinaryReader): AddTransactionWithValidationResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: AddTransactionWithValidationResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: AddTransactionWithValidationResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var currentVersion: String = js.native
    
    var status: js.UndefOr[typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(currentVersion: String): AsObject = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: typingsSlinky.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
