package typingsSlinky.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.accessPathPbMod.AccessPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp")
@js.native
class WriteOp () extends Message {
  
  def clearAccessPath(): Unit = js.native
  
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  
  def getType(): WriteOpType = js.native
  
  def getValue(): js.typedarray.Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): js.typedarray.Uint8Array = js.native
  
  def hasAccessPath(): Boolean = js.native
  
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  
  def setType(value: WriteOpType): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: js.typedarray.Uint8Array): Unit = js.native
}
/* static members */
object WriteOp {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): WriteOp = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: WriteOp, reader: BinaryReader): WriteOp = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: WriteOp, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: WriteOp): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var accessPath: js.UndefOr[typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
    
    var `type`: WriteOpType = js.native
    
    var value: js.typedarray.Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(`type`: WriteOpType, value: js.typedarray.Uint8Array | String): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPath(value: typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject): Self = StObject.set(x, "accessPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPathUndefined: Self = StObject.set(x, "accessPath", js.undefined)
      
      @scala.inline
      def setType(value: WriteOpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
