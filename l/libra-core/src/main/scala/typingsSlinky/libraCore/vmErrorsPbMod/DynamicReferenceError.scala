package typingsSlinky.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
class DynamicReferenceError () extends Message {
  
  def getErrorCode(): DynamicReferenceErrorType = js.native
  
  def setErrorCode(value: DynamicReferenceErrorType): Unit = js.native
}
/* static members */
object DynamicReferenceError {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DynamicReferenceErrorType extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.DynamicReferenceErrorType")
  @js.native
  object DynamicReferenceErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DynamicReferenceErrorType with Double] = js.native
    
    @js.native
    sealed trait GLOBALALREADYBORROWED extends DynamicReferenceErrorType
    /* 4 */ val GLOBALALREADYBORROWED: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALALREADYBORROWED with Double = js.native
    
    @js.native
    sealed trait GLOBALREFALREADYRELEASED extends DynamicReferenceErrorType
    /* 2 */ val GLOBALREFALREADYRELEASED: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALREFALREADYRELEASED with Double = js.native
    
    @js.native
    sealed trait MISSINGRELEASEREF extends DynamicReferenceErrorType
    /* 3 */ val MISSINGRELEASEREF: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.MISSINGRELEASEREF with Double = js.native
    
    @js.native
    sealed trait MOVEOFBORROWEDRESOURCE extends DynamicReferenceErrorType
    /* 1 */ val MOVEOFBORROWEDRESOURCE: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.MOVEOFBORROWEDRESOURCE with Double = js.native
    
    @js.native
    sealed trait UNKNOWNDYNAMICREFERENCEERROR extends DynamicReferenceErrorType
    /* 0 */ val UNKNOWNDYNAMICREFERENCEERROR: typingsSlinky.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.UNKNOWNDYNAMICREFERENCEERROR with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): DynamicReferenceError = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: DynamicReferenceError, reader: BinaryReader): DynamicReferenceError = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: DynamicReferenceError, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: DynamicReferenceError): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var errorCode: DynamicReferenceErrorType = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(errorCode: DynamicReferenceErrorType): AsObject = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: DynamicReferenceErrorType): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
}
