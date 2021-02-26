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

@JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
@js.native
class TransactionExclusion () extends Message {
  
  def getSender(): js.typedarray.Uint8Array | String = js.native
  
  def getSender_asB64(): String = js.native
  
  def getSender_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setSender(value: String): Unit = js.native
  def setSender(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
/* static members */
object TransactionExclusion {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionExclusion = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: TransactionExclusion, reader: BinaryReader): TransactionExclusion = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: TransactionExclusion, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: TransactionExclusion): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var sender: js.typedarray.Uint8Array | String = js.native
    
    var sequenceNumber: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(sender: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
      val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSender(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
