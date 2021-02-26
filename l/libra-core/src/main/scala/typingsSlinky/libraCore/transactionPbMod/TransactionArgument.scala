package typingsSlinky.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
@js.native
class TransactionArgument () extends Message {
  
  def getData(): js.typedarray.Uint8Array | String = js.native
  
  def getData_asB64(): String = js.native
  
  def getData_asU8(): js.typedarray.Uint8Array = js.native
  
  def getType(): ArgType = js.native
  
  def setData(value: String): Unit = js.native
  def setData(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setType(value: ArgType): Unit = js.native
}
/* static members */
object TransactionArgument {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ArgType extends StObject
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.ArgType")
  @js.native
  object ArgType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArgType with Double] = js.native
    
    @js.native
    sealed trait ADDRESS extends ArgType
    /* 1 */ val ADDRESS: typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType.ADDRESS with Double = js.native
    
    @js.native
    sealed trait BYTEARRAY extends ArgType
    /* 3 */ val BYTEARRAY: typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType.BYTEARRAY with Double = js.native
    
    @js.native
    sealed trait STRING extends ArgType
    /* 2 */ val STRING: typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType.STRING with Double = js.native
    
    @js.native
    sealed trait U64 extends ArgType
    /* 0 */ val U64: typingsSlinky.libraCore.transactionPbMod.TransactionArgument.ArgType.U64 with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionArgument = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: TransactionArgument, reader: BinaryReader): TransactionArgument = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: TransactionArgument, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: TransactionArgument): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var data: js.typedarray.Uint8Array | String = js.native
    
    var `type`: ArgType = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8Array | String, `type`: ArgType): AsObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ArgType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
